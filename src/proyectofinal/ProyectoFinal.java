
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
import proyectofinal.AccesoaDatos.PasajeData;
import proyectofinal.AccesoaDatos.TipoAlojamiento;
import proyectofinal.Entidades.Alojamiento;
import proyectofinal.Entidades.Ciudad;
import proyectofinal.Entidades.Pasaje;


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
Ciudad ciu=new Ciudad(4,"Mar de Plata", "Argentina", true, "Buenos Aires");

AlojamientoData vac = new AlojamientoData();

//Alojamiento alo= new Alojamiento(1,LocalDate.of(2023, 1, 15),LocalDate.of(2023, 1, 21),true,"Desayuno y Almuerzo",20000,ciu,TipoAlojamiento.Hotel);
//
//vac.modificarAlojamiento(alo);
//try {
//          ciu=cd.buscarCiudad(7);
//        System.out.println(ciu.getNombre());
//        System.out.println(ciu.getPais());
//        System.out.println(ciu.getProvincia());
//    
//        } catch (NullPointerException e) {
//        }
//
//vac.eliminarAlojamiento(1);

PasajeData psaje = new PasajeData();
//Pasaje pasaje = new Pasaje("Avion", 50000, ciu, true);
//
//psaje.agregarPasaje(pasaje);

psaje.EliminarPasaje(4);

}
}
