/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal.Entidades;

/**
 *
 * @author Luis
 */
public class Pasaje {
    
    private int idPasaje;
    private String tipoTransporte;
    private double importe;
    private Ciudad nombreCiudadOrigen;
    private boolean estado;

    public Pasaje() {
    }

    public Pasaje(String tipoTransporte, double importe, Ciudad nombreCiudadOrigen, boolean estado) {
        this.tipoTransporte = tipoTransporte;
        this.importe = importe;
        this.nombreCiudadOrigen = nombreCiudadOrigen;
        this.estado = estado;
    }

    public Pasaje(int idPasaje, String tipoTransporte, double importe, Ciudad nombreCiudadOrigen, boolean estado) {
        this.idPasaje = idPasaje;
        this.tipoTransporte = tipoTransporte;
        this.importe = importe;
        this.nombreCiudadOrigen = nombreCiudadOrigen;
        this.estado = estado;
    }

    public int getIdPasaje() {
        return idPasaje;
    }

    public void setIdPasaje(int idPasaje) {
        this.idPasaje = idPasaje;
    }

    public String getTipoTransporte() {
        return tipoTransporte;
    }

    public void setTipoTransporte(String tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public Ciudad getNombreCiudadOrigen() {
        return nombreCiudadOrigen;
    }

    public void setNombreCiudadOrigen(Ciudad nombreCiudadOrigen) {
        this.nombreCiudadOrigen = nombreCiudadOrigen;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Pasaje{" + "idPasaje=" + idPasaje + '}';
    }
    
    
    
    
}
