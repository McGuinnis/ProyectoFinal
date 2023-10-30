/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal.AccesoaDatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import proyectofinal.Entidades.Alojamiento;
import proyectofinal.Entidades.Ciudad;

/**
 *
 * @author ilux
 */
public class AlojamientoData {

    private PreparedStatement ps;

    private Connection con = null;

    public AlojamientoData() {

        con = Conexion.getConexion();
    }

    public void agregarAlojamiento(Alojamiento alojamiento) {

        String sql = "INSERT INTO alojamiento(FechaIn, FechaOn, Estado, Servicio, ImporteDiario, idCiudadDestino, TipodeAlojamiento) "
                + "VALUES (?, ? , ?, ?, ?, ?, ?)";

        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setDate(1, Date.valueOf(alojamiento.getFechaing()));
            ps.setDate(2, Date.valueOf(alojamiento.getFechaOn()));
            ps.setBoolean(3, alojamiento.isEstado());
            ps.setString(4, alojamiento.getServicio());
            ps.setDouble(5, alojamiento.getImporteDiario());
            ps.setInt(6, alojamiento.getCiudadDest().getIdCiudad());
            ps.setString(7, alojamiento.getTipoAlojam());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {

                alojamiento.setIdAlojamiento(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Alojamiento Agregado con Exito");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos Alojamiento");

        }
    }

    public void modificarAlojamiento(Alojamiento alojamiento) {

        String sql = "UPDATE `alojamiento` SET FechaIn=?,FechaOn=?,Estado=?,Servicio=?,ImporteDiario=?,idCiudadDestino=?,TipodeAlojamiento=? WHERE idAlojamiento= ?";

        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setDate(1, Date.valueOf(alojamiento.getFechaing()));
            ps.setDate(2, Date.valueOf(alojamiento.getFechaOn()));
            ps.setBoolean(3, alojamiento.isEstado());
            ps.setString(4, alojamiento.getServicio());
            ps.setDouble(5, alojamiento.getImporteDiario());
            ps.setInt(6, alojamiento.getCiudadDest().getIdCiudad());
            ps.setString(7, alojamiento.getTipoAlojam());
            ps.setInt(8, alojamiento.getIdAlojamiento());

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Alojamiento Modificado con Exito");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos Alojamiento");
        }
    }

    public void calculoVacaciones(LocalDate fecha1, LocalDate fecha2) {
       // LocalDate fechaInicio = LocalDate.of(2023, 1, 1);

        //LocalDate fechaFin = LocalDate.of(2023, 1, 16);

        String temporada = CalcularTemporada(fecha1);

        int diasVacaciones = CalcularDiasVacaciones(fecha1, fecha2);

        System.out.println("Temporada" + temporada);
        System.out.println("Día de Vacaciones" + diasVacaciones);
    }

    public String CalcularTemporada(LocalDate fechaInicio) {

        Month mesInicio = fechaInicio.getMonth();

        if (mesInicio == Month.JANUARY || mesInicio == Month.JULY) {
            return "Alta";
        } else if (mesInicio == Month.FEBRUARY || mesInicio == Month.JUNE) {
            return "Media";
        } else {
            return "Baja";
        }
    }

    public int CalcularDiasVacaciones(LocalDate fechaInicio, LocalDate fechaFin) {

        long diasDeDiferencia = fechaInicio.until(fechaFin, ChronoUnit.DAYS);

        return (int) diasDeDiferencia;

    }

    public void eliminarAlojamiento(int id) {
        String sql = "UPDATE alojamiento SET Estado=0 WHERE idAlojamiento=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Alojamiento eliminado con exito");
            } else {
                JOptionPane.showMessageDialog(null, "Alojamiento no encontrado");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos Alojamiento");
        }
    }

    public Alojamiento buscarAlojamiento(int idAlojamiento) {

        String sql = "SELECT FechaIn, FechaOn, Estado, Servicio, ImporteDiario, idCiudadDestino, TipodeAlojamiento FROM alojamiento WHERE idAlojamiento = ?";
        Alojamiento alojamiento = null;

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlojamiento);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                // Obtenemos los valores del resultado y creamos un objeto Alojamiento
                alojamiento = new Alojamiento();
                CiudadData cD=new CiudadData();
                Ciudad ciU=cD.buscarCiudad(rs.getInt("idCiudadDestino"));
                
                alojamiento.setIdAlojamiento(idAlojamiento);
                alojamiento.setFechaing(rs.getDate("FechaIn").toLocalDate());
                alojamiento.setFechaOn(rs.getDate("FechaOn").toLocalDate());
                alojamiento.setEstado(rs.getBoolean("Estado"));
                alojamiento.setServicio(rs.getString("Servicio"));
                alojamiento.setImporteDiario(rs.getDouble("ImporteDiario"));
                alojamiento.setCiudadDest(ciU);
                alojamiento.setTipoAlojam(rs.getString("TipodeAlojamiento"));
            } else {
                JOptionPane.showMessageDialog(null, "Alojamiento no encontrado");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos Alojamiento");
        }

        return alojamiento;
    }

    public List<Alojamiento> listarAlojamientoxCyF(int ciudad, LocalDate fechaIn) {

        String sql = "SELECT idAlojamiento, FechaIn, FechaOn, Servicio, ImporteDiario,  TipodeAlojamiento FROM alojamiento WHERE FechaIn >= ? AND idCiudadDestino=? AND Estado=1";
        Alojamiento alojamiento = null;
        ArrayList<Alojamiento> listaAlojamiento=new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(fechaIn)); //LocalDate fechaIng = jdFechaIngreso.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            ps.setInt(2, ciudad);
            ResultSet rs = ps.executeQuery();
            
            CiudadData cd=new CiudadData();
            

            while (rs.next()) {
                // Obtenemos los valores del resultado y creamos un objeto Alojamiento
                alojamiento = new Alojamiento();
                Ciudad ciU=new Ciudad();
                ciU=cd.buscarCiudad(ciudad);
                
                alojamiento.setIdAlojamiento(rs.getInt("idAlojamiento"));
                alojamiento.setFechaing(rs.getDate("FechaIn").toLocalDate());
                alojamiento.setFechaOn(rs.getDate("FechaOn").toLocalDate());
                alojamiento.setEstado(true);
                alojamiento.setServicio(rs.getString("Servicio"));
                alojamiento.setImporteDiario(rs.getDouble("ImporteDiario"));
                alojamiento.setCiudadDest(ciU);
                alojamiento.setTipoAlojam(rs.getString("TipodeAlojamiento"));
                
                listaAlojamiento.add(alojamiento);
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos Alojamiento");
        }

        return listaAlojamiento;
    }

}
