
package proyectofinal;

import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Month;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import proyectofinal.AccesoaDatos.AlojamientoData;
import proyectofinal.AccesoaDatos.CiudadData;
import proyectofinal.AccesoaDatos.Conexion;
import proyectofinal.Entidades.Ciudad;


public class ProyectoFinal {

   
    public static void main(String[] args) {
        // TODO code application logic here

        Connection con = Conexion.getConexion();
        
        
        // ******************* iNSERTANDO UNA ciudad ******************
        CiudadData cd = new CiudadData();
//        Ciudad ciudad = new Ciudad("Santa Rosa", "Argentina", true, "La Pampa");
//        try {
//            cd.agregarCiudad(ciudad);
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error!!!!");
//        }
//    
//        ********************** MODIFICANDO UNA CIUDAD *************
//        Ciudad ciudad2 = new Ciudad(6, "General Pico", "Argentina", true, "La Pampa");
//        cd.modificarCiudad(ciudad2);
    
    // ************** Eliminando una CIUDAD *************
    
//     cd.eliminarCiudad(4);

AlojamientoData vac = new AlojamientoData();

vac.Calculo();




  }


    

}
