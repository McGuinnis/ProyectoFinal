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
 public void calculoVacaciones(LocalDate fecha1, LocalDate fecha2){
   
    
    
        
  public void Calculo () {
      
      
      
    LocalDate fechaInicio = LocalDate.of(2023, 1, 1);
    
    LocalDate fechaFin = LocalDate.of(2023, 1, 16);
        
        String temporada = CalcularTemporada(fechaInicio);
        
        int diasVacaciones = CalcularDiasVacaciones(fechaInicio, fechaFin);
        
      System.out.println("Temporada" +  temporada);
      System.out.println("Día de Vacaciones" +  diasVacaciones);
}
    
    private String CalcularTemporada(LocalDate fechaInicio){
        
        Month mesInicio = fechaInicio.getMonth();
        
        if (mesInicio == Month.JANUARY || mesInicio == Month.JULY){
            return "Alta";
        } else if (mesInicio == Month.FEBRUARY || mesInicio == Month.JUNE){
            return "Media";
        } else {
            return "Baja";
        }  
    }
    
    private int CalcularDiasVacaciones(LocalDate fechaInicio, LocalDate fechaFin){
        
        long diasDeDiferencia = fechaInicio.until(fechaFin, ChronoUnit.DAYS);
        
        return (int) diasDeDiferencia;
        
    }
    
    }



    
    
    
    

