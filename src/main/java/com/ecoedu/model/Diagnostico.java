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
 * @author yrma
 */
@Entity
public class Diagnostico{
    @Id
    @Column(unique = true, length = 6, nullable = false)
    private String id;
    
    @Column(name = "descripcion_Diagnostico",nullable = false)
    private String descripcion_Diagnostico;
    
    
    //usado solo para guardar cuanta cantidad del tipo de diagnostico(Requisito del negocio)
   
    
    

    public String getId(){
        return id;
    }

    public void setId(String id_DiagnosticoCodigo) {
        this.id = id_DiagnosticoCodigo;
    }

    public String getDescripcion_Diagnostico() {
        return descripcion_Diagnostico;
    }

    public void setDescripcion_Diagnostico(String descripcion_Diagnostico) {
        this.descripcion_Diagnostico = descripcion_Diagnostico;
    }

    @Override
    public String toString() {
        return "Diagnostico asdasd";
    }

    

    
    
}
