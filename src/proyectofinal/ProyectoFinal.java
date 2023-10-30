package proyectofinal;

import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import proyectofinal.AccesoaDatos.AlojamientoData;
import proyectofinal.AccesoaDatos.CiudadData;
import proyectofinal.AccesoaDatos.Conexion;
import proyectofinal.AccesoaDatos.PaqueteData;
import proyectofinal.AccesoaDatos.PasajeData;

import proyectofinal.Entidades.Alojamiento;
import proyectofinal.Entidades.Ciudad;
import proyectofinal.Entidades.Paquete;
import proyectofinal.Entidades.Pasaje;
import proyectofinal.Vistas.menu;

public class ProyectoFinal {

    public static void main(String[] args) throws ParseException {
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
        Ciudad ciu = new Ciudad(4, "Mar de Plata", "Argentina", true, "Buenos Aires");

        AlojamientoData vac = new AlojamientoData();

//Alojamiento alo= new Alojamiento(1,LocalDate.of(2023, 1, 15),LocalDate.of(2023, 1, 21),true,"Desayuno y Almuerzo",20000,ciu,TipoAlojamiento.Hotel);
////********************Modificar Alojamiento*************************
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
/////////////************** Agregar Pasaje**************
//psaje.agregarPasaje(pasaje);

//////**************Eliminar Pasaje ********************
//psaje.EliminarPasaje(1);
////////********Listar Ciudades por Pais ********************
//List<Ciudad> cc=cd.listarCiudadPorPais("Peru");
//        for (Ciudad ciudad1 : cc) {
//            System.out.println("Nombre Ciudad: "+ciudad1.getNombre());
//            System.out.println("Provincia: "+ciudad1.getProvincia());
//            System.out.println("---------------------------------------");
//        }
//        
//cd.listarPaises();
//        List<String> provincias = cd.listarProvinciasPorPaisCombo("España");
//
//        for (String provincia : provincias) {
//
//            System.out.println("" + provincia);
//
//        }
//List<Ciudad> cc=cd.listarCiudadPorProvinciaypais("Argentina", "Chubut");
//        for (Ciudad ciudad1 : cc) {
//            System.out.println("Id: "+ ciudad1.getIdCiudad());
//            System.out.println("Nombre Ciudad: "+ciudad1.getNombre());
//            System.out.println("Provincia: "+ciudad1.getProvincia());
//            System.out.println("---------------------------------------");
//        }
        AlojamientoData ad = new AlojamientoData();
        //Alojamiento alojamiento = ad.buscarAlojamiento(1);
        
//        if (alojamiento != null) {
//
//            System.out.println("ID de Alojamiento: " + alojamiento.getIdAlojamiento());
//            System.out.println("Fecha Inicio: " + alojamiento.getFechaing());
//            System.out.println("Fecha Fin: " + alojamiento.getFechaOn());
//            System.out.println("Estado: " + alojamiento.isEstado());
//            System.out.println("Servicio: " + alojamiento.getServicio());
//            System.out.println("Importe Diario: " + alojamiento.getImporteDiario());
//            System.out.println("Tipo Alojamiento:"+ alojamiento.getTipoAlojam());
//            
//            
//
//        }
        
//        PaqueteData pd = new PaqueteData();
//        pd.listarPaquetePorCiudad(2);
//        
//        Ciudad ss = cd.buscarCiudadPorNombre("Azul");
//        
//        System.out.println("Probando "+ss.getIdCiudad()+" "+ss.getNombre());   

       // System.out.println(""+ad.CalcularDiasVacaciones(LocalDate.of(2023, 10, 30), LocalDate.of(2023, 11, 2)));

menu mn = new menu();
mn.setVisible(true);

    }
}
