/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal.AccesoaDatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import proyectofinal.Entidades.Alojamiento;
import proyectofinal.Entidades.Ciudad;
import proyectofinal.Entidades.Paquete;
import proyectofinal.Entidades.Pasaje;
import sun.security.rsa.RSACore;

/**
 *
 * @author maxfa
 */
public class PaqueteData {

    private PreparedStatement ps;

    private Connection con = null;

    public PaqueteData() {

        con = Conexion.getConexion();
    }

    public void agregarPaquete(Paquete paquete) {
        String sql = "INSERT INTO `paquete`(idCiudadOrigen, idCiudadDestino, idAlojamiento, idPasaje) "
                + "VALUES (?, ? , ?, ?)";

        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, paquete.getOrigen().getIdCiudad());
            ps.setInt(2, paquete.getDestino().getIdCiudad());
            ps.setInt(3, paquete.getAlojamiento().getIdAlojamiento());
            ps.setInt(4, paquete.getPasaje().getIdPasaje());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {

                paquete.setIdPaquete(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Paquete Agregado con Exito");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos Paquete");

        }
    }

    public void modificarPaquete(Paquete paquete) {
    }

    public void eliminarPaquete(int id) {
        String sql = "DELETE FROM `paquete` WHERE idPaquete=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Paquete eliminado con exito");
            } else {
                JOptionPane.showMessageDialog(null, "Paquete no encontrado");
            }
            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(PaqueteData.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public List<Paquete> listarPaquetePorCiudad(int idCiudaddestino) {

        String sql = "SELECT *"
                + "FROM paquete p "
                + "INNER JOIN Ciudad co ON  p.idCiudadOrigen=co.idCiudad "
                + "INNER JOIN Alojamiento a ON p.idAlojamiento = a.idAlojamiento "
                + "INNER JOIN Pasaje pa ON p.idPasaje = pa.idPasaje "
                + "INNER JOIN Ciudad cd ON p.idCiudadDestino= cd.idCiudad "
                + "WHERE p.idCiudadDestino = ? ";
        ArrayList<Paquete> paquete1 = new ArrayList<>();
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idCiudaddestino);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Paquete paq = new Paquete();
                Alojamiento alo = new Alojamiento();
                AlojamientoData aloData = new AlojamientoData();
                PasajeData pd = new PasajeData();
                Pasaje pas = new Pasaje();
                Ciudad ciuO = new Ciudad();
                Ciudad ciuD = new Ciudad();

                ciuO.setIdCiudad(rs.getInt("idCiudadOrigen"));
                ciuO.setNombre(rs.getString("co.Nombre"));
                ciuO.setPais(rs.getString("co.Pais"));
                ciuO.setProvincia(rs.getString("co.Provincia"));
                ciuO.setEstado(rs.getBoolean("co.Estado"));

                ciuD.setIdCiudad(rs.getInt("idCiudadDestino"));
                ciuD.setNombre(rs.getString("cd.Nombre"));
                ciuD.setPais(rs.getString("cd.Pais"));
                ciuD.setProvincia(rs.getString("cd.Provincia"));
                ciuD.setEstado(rs.getBoolean("cd.Estado"));

                alo = aloData.buscarAlojamiento(rs.getInt("idAlojamiento"));
                paq.setAlojamiento(alo);
                paq.setOrigen(ciuO);
                paq.setDestino(ciuD);

                pas = pd.buscarPasaje(rs.getInt("idPasaje"));
                paq.setPasaje(pas);

                paq.setIdPaquete(rs.getInt("IdPaquete"));

                paquete1.add(paq);

//                System.out.println("Nombre ciudad Origen "+ciuO.getNombre());
//                System.out.println("Nombre ciudad Destino "+ciuD.getNombre());
//                System.out.println("Nombre del Alojamiento ID "+alo.getIdAlojamiento());
//                System.out.println("Nombre de pasaje ID "+pas.getIdPasaje());
//                System.out.println("Fecha "+alo.getFechaing());
//                System.out.println("===================================================");
            }

        } catch (SQLException ex) {
            Logger.getLogger(PaqueteData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return paquete1;
    }

    public List<Paquete> listarPaquetePorFechaSalida(LocalDate fechaActual) {
        String sql = "SELECT * "
                + "FROM paquete p "
                + "INNER JOIN Ciudad co ON p.idCiudadOrigen = co.idCiudad "
                + "INNER JOIN Alojamiento a ON p.idAlojamiento = a.idAlojamiento "
                + "INNER JOIN Pasaje pa ON p.idPasaje = pa.idPasaje "
                + "INNER JOIN Ciudad cd ON p.idCiudadDestino = cd.idCiudad "
                + "WHERE a.FechaOn < ? ";
                

        ArrayList<Paquete> paquete1 = new ArrayList<>();
        try {
            ps = con.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(fechaActual));

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Paquete paq = new Paquete();
                Alojamiento alo = new Alojamiento();
                AlojamientoData aloData = new AlojamientoData();
                PasajeData pd = new PasajeData();
                Pasaje pas = new Pasaje();
                Ciudad ciuO = new Ciudad();
                Ciudad ciuD = new Ciudad();

                ciuO.setIdCiudad(rs.getInt("idCiudadOrigen"));
                ciuO.setNombre(rs.getString("co.Nombre"));
                ciuO.setPais(rs.getString("co.Pais"));
                ciuO.setProvincia(rs.getString("co.Provincia"));
                ciuO.setEstado(rs.getBoolean("co.Estado"));

                ciuD.setIdCiudad(rs.getInt("idCiudadDestino"));
                ciuD.setNombre(rs.getString("cd.Nombre"));
                ciuD.setPais(rs.getString("cd.Pais"));
                ciuD.setProvincia(rs.getString("cd.Provincia"));
                ciuD.setEstado(rs.getBoolean("cd.Estado"));

                alo = aloData.buscarAlojamiento(rs.getInt("idAlojamiento"));
                paq.setAlojamiento(alo);
                paq.setOrigen(ciuO);
                paq.setDestino(ciuD);

                pas = pd.buscarPasaje(rs.getInt("idPasaje"));
                paq.setPasaje(pas);

                paq.setIdPaquete(rs.getInt("IdPaquete"));

                paquete1.add(paq);
            }

        } catch (SQLException ex) {
            Logger.getLogger(PaqueteData.class.getName()).log(Level.SEVERE, null, ex);
        }

        return paquete1;
    }
}
