/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal.AccesoaDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import proyectofinal.Entidades.Paquete;
import proyectofinal.Entidades.Pasaje;

/**
 *
 * @author orell
 */
public class PasajeData {
    private PreparedStatement ps;

    private Connection con = null;

    public PasajeData() {

    con = Conexion.getConexion();
    }
    
    public void agregarPasaje(Pasaje pasaje){
        
        String sql = "INSERT INTO pasaje(TipodeTransporte, Importe, idCiudadOrigen, Estado) VALUES (?, ?, ?, ?)";
        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, pasaje.getTipoTransporte());
            ps.setDouble(2,pasaje.getImporte());
            ps.setInt(3,pasaje.getNombreCiudadOrigen().getIdCiudad());
            ps.setBoolean(4,pasaje.isEstado());
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                
                pasaje.setIdPasaje(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Paquete Agregado con Exito");
            } else {
                JOptionPane.showMessageDialog(null, "Paquete no agregado");
            }

            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos Paquete");
                
    }
  }
    
    public void EliminarPasaje(int id){
        String sql="UPDATE pasaje SET Estado=0 WHERE idPasaje=?";
        try {
            ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito=ps.executeUpdate();
            
            if(exito==1){
            JOptionPane.showMessageDialog(null, "Pasaje eliminado con exito");
            }else{
            JOptionPane.showMessageDialog(null, "Pasaje no encontrado");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos Pasaje");
        }
    }
    
    
    
}
