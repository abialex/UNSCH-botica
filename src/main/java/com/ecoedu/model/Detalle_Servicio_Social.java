/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecoedu.model;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Detalle_Servicio_Social implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @JoinColumn(insertable = true,updatable = false,name="id_servicio_social",nullable = false)
    @ManyToOne(cascade = CascadeType.ALL)
    private Servicio_social servicio_social;
    
    @JoinColumn(insertable = true,updatable = false,name="id_usuario",nullable = false)
    @ManyToOne(cascade = CascadeType.ALL)
    private Usuario usuario;
    
    
    @JoinColumn(insertable = true,updatable = false,name="id_tarifario",nullable = false)
    @ManyToOne(cascade = CascadeType.ALL)
    private Tarifario tarifario;
   
   
    @Column(name="precio",nullable = false)
    private float  precio_Total;

    public int getId() {
        return id;
    }

    public void setId(int id_Detalle_servicio_social) {
        this.id = id_Detalle_servicio_social;
    }

    public Servicio_social getServicio_social() {
        return servicio_social;
    }

    public void setServicio_social(Servicio_social servicio_social) {
        this.servicio_social = servicio_social;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public float getPrecio_Total() {
        return precio_Total;
    }

    public void setPrecio_Total(float precio_Total) {
        this.precio_Total = precio_Total;
    }

    public Tarifario getTarifario() {
        return tarifario;
    }

    public void setTarifario(Tarifario tarifario) {
        this.tarifario = tarifario;
    }
    @Override
    public String toString(){
        return tarifario.getDescripcion();
    }
    
    
    
    
    
    
    
    
}
