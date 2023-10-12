/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal.Entidades;

import java.sql.Date;
import java.time.LocalDate;


/**
 *
 * @author Luis
 */
public class Alojamiento {
    
    private int idAlojamiento;
    private LocalDate Fechaing; // fecha de ingreso
    private LocalDate FechaOn; // fecha de salida
    private boolean estado;
    private String servicio;
    private double importeDiario;
    private Ciudad ciudadDest;
    private String tipoAlojam;

    public Alojamiento() {
    }

    public Alojamiento(LocalDate Fechaing, LocalDate FechaOn, boolean estado, String servicio, double importeDiario, Ciudad ciudadDest, String tipoAlojam) {
        this.Fechaing = Fechaing;
        this.FechaOn = FechaOn;
        this.estado = estado;
        this.servicio = servicio;
        this.importeDiario = importeDiario;
        this.ciudadDest = ciudadDest;
        this.tipoAlojam = tipoAlojam;
    }

  
    public Alojamiento(int idAlojamiento, LocalDate Fechaing, LocalDate FechaOn, boolean estado, String servicio, double importeDiario, Ciudad ciudadDest, String tipoAlojam) {
        this.idAlojamiento = idAlojamiento;
        this.Fechaing = Fechaing;
        this.FechaOn = FechaOn;
        this.estado = estado;
        this.servicio = servicio;
        this.importeDiario = importeDiario;
        this.ciudadDest = ciudadDest;
        this.tipoAlojam = tipoAlojam;
    }

    public int getIdAlojamiento() {
        return idAlojamiento;
    }

    public void setIdAlojamiento(int idAlojamiento) {
        this.idAlojamiento = idAlojamiento;
    }

    public LocalDate getFechaing() {
        return Fechaing;
    }

    public void setFechaing(LocalDate Fechaing) {
        this.Fechaing = Fechaing;
    }

    public LocalDate getFechaOn() {
        return FechaOn;
    }

    public void setFechaOn(LocalDate FechaOn) {
        this.FechaOn = FechaOn;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public double getImporteDiario() {
        return importeDiario;
    }

    public void setImporteDiario(double importeDiario) {
        this.importeDiario = importeDiario;
    }

    public Ciudad getCiudadDest() {
        return ciudadDest;
    }

    public void setCiudadDest(Ciudad ciudadDest) {
        this.ciudadDest = ciudadDest;
    }

    public String getTipoAlojam() {
        return tipoAlojam;
    }

    public void setTipoAlojam(String tipoAlojam) {
        this.tipoAlojam = tipoAlojam;
    }

    @Override
    public String toString() {
        return "Alojamiento{" + "idAlojamiento=" + idAlojamiento + ", Fechaing=" + Fechaing + ", FechaOn=" + FechaOn + ", servicio=" + servicio + ", importeDiario=" + importeDiario + ", tipoAlojam=" + tipoAlojam + '}';
    }

    
    
    
   
    
    
 }
