/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal.AccesoaDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import proyectofinal.Entidades.Ciudad;

/**
 *
 * @author Luis
 */
public class CiudadData {
    
    private PreparedStatement ps;

    private Connection con = null;

    public CiudadData() {

        con = Conexion.getConexion();
    }

//Insertando una Ciudad
    public void agregarCiudad(Ciudad ciudad){

        String sql = "INSERT INTO ciudad (Nombre, Pais, Estado, Provincia)"
                + "VALUES(?, ?, ?, ?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, ciudad.getNombre());
            ps.setString(2, ciudad.getPais());
            ps.setBoolean(3, ciudad.isEstado());
            ps.setString(4, ciudad.getProvincia());
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()){
                ciudad.setIdCiudad(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Ciudad Agregada con Exito");
            }
            ps.close();
        } catch (SQLException eq) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos ciudad");
        }

    }
    
    public void eliminarCiudad(int id) { // ****Eliminando Logicamente una Ciudad

        String sql = "UPDATE ciudad SET Estado = 0 WHERE idCiudad = ?";
        
        try {
            ps = con.prepareStatement(sql);
            
            ps.setInt(1, id);
            
            int exito = ps.executeUpdate();
            
            if (exito == 1){
                
                JOptionPane.showMessageDialog(null, "Ciudad eliminada con Exito");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos ciudad");
        }
    }
    
    public void modificarCiudad(Ciudad ciudad) {
        String sql = "Update ciudad SET Nombre=?, Pais=?, Provincia=? "
                + "Where idCiudad=?";
        
                
        try {
            
            ps = con.prepareStatement(sql);
            
            ps.setString(1, ciudad.getNombre());
            ps.setString(2, ciudad.getPais());
            ps.setString(3, ciudad.getProvincia());
            ps.setInt(4, ciudad.getIdCiudad());
            
            int exito = ps.executeUpdate();
            
            if (exito == 1){
                JOptionPane.showMessageDialog(null, "Ciudad actualizada con exito");
            }
                        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos ciudad");
        }
    }

}
