/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pruebapuxles.microprofile.document;

import java.util.Date;

/**
 *
 * @author ASUS
 */
public class Taller {
    
    private int idTaller;
    private int idPersona;
    private Date fecha;
    private double calificacion;
    private String lugar;
    
    
    Taller(int idPersona,Date fecha,double calificacion ,String lugar){
        this.idPersona=idPersona;
        this.fecha=fecha;
        this.calificacion=calificacion;
        this.lugar=lugar;
    }

    /**
     * @return the idTaller
     */
    public int getIdTaller() {
        return idTaller;
    }

    /**
     * @param idTaller the idTaller to set
     */
    public void setIdTaller(int idTaller) {
        this.idTaller = idTaller;
    }

    /**
     * @return the idPersona
     */
    public int getIdPersona() {
        return idPersona;
    }

    /**
     * @param idPersona the idPersona to set
     */
    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the calificacion
     */
    public double getCalificacion() {
        return calificacion;
    }

    /**
     * @param calificacion the calificacion to set
     */
    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    /**
     * @return the lugar
     */
    public String getLugar() {
        return lugar;
    }

    /**
     * @param lugar the lugar to set
     */
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    
    
}
