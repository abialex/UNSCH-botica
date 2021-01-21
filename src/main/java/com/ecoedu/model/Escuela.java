/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecoedu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author alexis
 */

@Entity
public class Escuela {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    
    @Column(name = "nombre",nullable = false)
    private String nombre;
    
    @Column(name = "abreviatura",nullable = true)
    private String abreviatura;

    public int getId() {
        return id;
    }

    public void setId(int id_escuela) {
        this.id = id_escuela;
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

    @Override
    public String toString() {
        return nombre;
    }
    
    
    /*
         INSERT INTO Escuela (nombre,abreviatura) VALUES 
      ('ingenería de sistemas','sistemas'), 
      ('ingenería civil','civil'),
      ('ingenería química','química'),
      ('ingenería agroforestal','forestal'),
      ('ingenería de minas','minas'),
      ('ingenería agrícola','agrícola'),
      ('agronomía','agronomía'),
      ('medicina humana','medicina'),
      ('enfermería','enfermería'),
      ('obstetricia','obstetricia'),
      ('farmacia y bioquímica','farmacia'),
      ('industria alimentarias','industria'),
      ('físico matemáticas','físico'),
      ('educación inicial','ed. inicial'),
      ('educación primaria','ed. primaria'),
      ('educación secundaria', ed.secundaria),
      ('educación física','ed. física'),
    
        

    
    */
    
    
    
    
    
}
