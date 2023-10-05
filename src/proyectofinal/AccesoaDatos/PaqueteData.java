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
import java.util.List;
import javax.swing.JOptionPane;
import proyectofinal.Entidades.Paquete;

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
    
public void agregarPaquete(Paquete paquete){
    String sql = "INSERT INTO `paquete`(idCuidadOrigen, idCuidadDestino, idAlojamiento, idPasaje, stock) "
                + "VALUES (?, ? , ?, ?, ?)";

        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, paquete.getOrigen().getIdCiudad());
            ps.setInt(2,paquete.getDestino().getIdCiudad());
            ps.setInt(3,paquete.getAlojamiento().getIdAlojamiento());
            ps.setInt(4,paquete.getPasaje().getIdPasaje());
            ps.setInt(5,paquete.getStock());
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                
                paquete.setIdPaquete(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Paquete Agregado con Exito");
            }
            
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos Paquete");

        }
}

public void modificarPaquete(Paquete paquete){
}

public void eliminarPaquete(Paquete paquete){
}

//public List<Paquete> listarPaquete(){
//}
}
