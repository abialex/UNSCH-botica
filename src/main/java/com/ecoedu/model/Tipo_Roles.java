/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecoedu.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Tipo_Roles implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "nombre",nullable = false,length = 30)
    private String nombre;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_rol() {
        return nombre;
    }

    public void setNombre_rol(String nombre) {
        this.nombre = nombre;
    }
    /*
    INSERT INTO Tipo_Roles (nombre) VALUES 
    ('sexo'), 
    ('condición'),
    ('procedencia'),
    ('origen'),
    ('cargo'),
    ('descargo');
    ('servicios')
    */
    
}
