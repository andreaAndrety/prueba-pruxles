/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pruebapuxles.microprofile.document;

/**
 *
 * @author ASUS
 */
public class Habilidad {
    private int idHabilidad;
    private String nombre;
    
    
    Habilidad(String nombre){
    this.nombre=nombre;
    }

    /**
     * @return the idHabilidad
     */
    public int getIdHabilidad() {
        return idHabilidad;
    }

    /**
     * @param idHabilidad the idHabilidad to set
     */
    public void setIdHabilidad(int idHabilidad) {
        this.idHabilidad = idHabilidad;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
