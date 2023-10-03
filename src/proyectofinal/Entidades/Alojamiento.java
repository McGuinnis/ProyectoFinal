/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal.Entidades;

import java.sql.Date;

/**
 *
 * @author Luis
 */
public class Alojamiento {
    
    private int idAlojamiento;
    private Date Fechaing; // fecha de ingreso
    private Date FechaOn; // fecha de salida
    private boolean estado;
    private String servicio;
    private double importeDiario;
    private Ciudad ciudadDest;

    public Alojamiento() {
    }

    public Alojamiento(Date Fechaing, Date FechaOn, boolean estado, String servicio, double importeDiario, Ciudad ciudadDest) {
        this.Fechaing = Fechaing;
        this.FechaOn = FechaOn;
        this.estado = estado;
        this.servicio = servicio;
        this.importeDiario = importeDiario;
        this.ciudadDest = ciudadDest;
    }

    public Alojamiento(int idAlojamiento, Date Fechaing, Date FechaOn, boolean estado, String servicio, double importeDiario, Ciudad ciudadDest) {
        this.idAlojamiento = idAlojamiento;
        this.Fechaing = Fechaing;
        this.FechaOn = FechaOn;
        this.estado = estado;
        this.servicio = servicio;
        this.importeDiario = importeDiario;
        this.ciudadDest = ciudadDest;
    }

    public int getIdAlojamiento() {
        return idAlojamiento;
    }

    public void setIdAlojamiento(int idAlojamiento) {
        this.idAlojamiento = idAlojamiento;
    }

    public Date getFechaing() {
        return Fechaing;
    }

    public void setFechaing(Date Fechaing) {
        this.Fechaing = Fechaing;
    }

    public Date getFechaOn() {
        return FechaOn;
    }

    public void setFechaOn(Date FechaOn) {
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
 }
