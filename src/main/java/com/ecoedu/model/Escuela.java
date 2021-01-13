/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecoedu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author alexis
 */

@Entity
public class Escuela {
    @Id
    @Column(unique = true, nullable = false)
    private String id_escuela;
    
    
    @Column(name = "nombre",nullable = false)
    private String nombre;
    
    @Column(name = "abreviatura",nullable = true)
    private String abreviatura;

    public String getId_escuela() {
        return id_escuela;
    }

    public void setId_escuela(String id_escuela) {
        this.id_escuela = id_escuela;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }
    
    
    
}
