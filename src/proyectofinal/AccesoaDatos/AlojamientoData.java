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

        String sql = "INSERT INTO alojamiento(FechaIn, FechaOn, Estado, Servicio, ImporteDiario, idCuidadDestino, TipodeAlojamiento) "
                + "VALUES (?, ? , ?, ?, ?, ?, ?)";

        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setDate(1, Date.valueOf(alojamiento.getFechaing()));
            ps.setDate(2, Date.valueOf(alojamiento.getFechaOn()));
            ps.setBoolean(3, alojamiento.isEstado());
            ps.setString(4, alojamiento.getServicio());
            ps.setDouble(5, alojamiento.getImporteDiario());
            ps.setInt(6, alojamiento.getCiudadDest().getIdCiudad());
            ps.setString(7, alojamiento.getTipoAlojam().name());
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                
                alojamiento.setIdAlojamiento(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Alojamiento Agregado con Exito");
            }
            
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos Alojamiento");

        }
    }

}
