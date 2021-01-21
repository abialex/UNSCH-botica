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
      ('ingener�a de sistemas','sistemas'), 
      ('ingener�a civil','civil'),
      ('ingener�a qu�mica','qu�mica'),
      ('ingener�a agroforestal','forestal'),
      ('ingener�a de minas','minas'),
      ('ingener�a agr�cola','agr�cola'),
      ('agronom�a','agronom�a'),
      ('medicina humana','medicina'),
      ('enfermer�a','enfermer�a'),
      ('obstetricia','obstetricia'),
      ('farmacia y bioqu�mica','farmacia'),
      ('industria alimentarias','industria'),
      ('f�sico matem�ticas','f�sico'),
      ('educaci�n inicial','ed. inicial'),
      ('educaci�n primaria','ed. primaria'),
      ('educaci�n secundaria', ed.secundaria),
      ('educaci�n f�sica','ed. f�sica'),
    
        

    
    */
    
    
    
    
    
}
