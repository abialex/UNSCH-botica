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
public class Laboratorio {    
    @Id
    @Column(unique = true, nullable = false)
    private String id_laboratorio;
    
    
    @Column(name = "nombre",nullable = false)
    private String nombre;
    
    @Column(name = "abreviatura",nullable = true)
    private String abreviatura;
    
    @Column(name = "descripcion",nullable = true)
    private String descripcion;

    public String getId_proveedor() {
        return id_laboratorio;
    }

    public void setId_proveedor(String id_laboratorio) {
        this.id_laboratorio = id_laboratorio;
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


    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
    
    
    
}