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
import proyectofinal.Entidades.Ciudad;
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
    
    public Pasaje agregarPasaje(Pasaje pasaje){
        
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
                JOptionPane.showMessageDialog(null, "Pasaje Agregado con Exito");
                
            } else {
                JOptionPane.showMessageDialog(null, "Pasaje no agregado");
            }

            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos Paquete");
                
    }
        return pasaje;
  }
    
    public void EliminarPasaje(int id){
        String sql="DELETE FROM `pasaje` WHERE idPasaje=?";
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
    
    public Pasaje buscarPasaje(int idPas) {

        String sql = "SELECT  `TipodeTransporte`, `Importe`, `idCiudadOrigen`, `Estado` FROM `pasaje` WHERE idPasaje=?";
       Pasaje pasaje = null;

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idPas);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                // Obtenemos los valores del resultado y creamos un objeto Alojamiento
               pasaje = new Pasaje();
               CiudadData cO=new CiudadData();
               Ciudad ciu=cO.buscarCiudad(rs.getInt("idCiudadOrigen"));
               pasaje.setIdPasaje(idPas);
               
               pasaje.setNombreCiudadOrigen(ciu);
               pasaje.setImporte(rs.getDouble("Importe"));
               pasaje.setTipoTransporte(rs.getString("TipodeTransporte"));
               pasaje.setEstado(rs.getBoolean("Estado"));
               
               
            } else {
                JOptionPane.showMessageDialog(null, "Alojamiento no encontrado");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos Alojamiento");
        }

        return pasaje;
    }

    
}
