/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecoedu.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author yrma
 */
@Entity
public class Rol implements Comparable<Rol>{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "nombre_rol",nullable = false,length = 30)
    private String nombre_rol;
    
    @Column(name = "abre_rol",nullable = true,length = 2)
    private String abre_rol;

    public int getId() {
        return id;
    }

    public void setId(int id_Rol) {
        this.id = id_Rol;
    }
    
    @JoinColumn(insertable = true,updatable = false,name="id_tipo_Roles",nullable = true)
    @ManyToOne(cascade = CascadeType.ALL)
    private Tipo_Roles tipo_Roles;

    public Tipo_Roles getTipo_Roles() {
        return tipo_Roles;
    }

    public void setTipo_Roles(Tipo_Roles tipo_Roles) {
        this.tipo_Roles = tipo_Roles;
    }

    public String getAbre_rol() {
        return abre_rol;
    }

    public void setAbre_rol(String abre_rol) {
        this.abre_rol = abre_rol;
    }

    public String getNombre_rol() {
        return nombre_rol;
    }

    public void setNombre_rol(String nombre_rol) {
        this.nombre_rol = nombre_rol;
    }
    @Override
    public String toString(){
        return nombre_rol;
    }

    @Override
    public int compareTo(Rol o) {
        return abre_rol.compareTo(o.abre_rol);
    }
    
    
    /*
           INSERT INTO Rol (nombre_rol,abre_rol,id_tipo_Roles) VALUES 
      ('masculino','m',1), 
      ('femenino','f',1),

      ('nuevo','n',2),
      ('concurrente','c',2),
      ('reingresante','r',2),

      ('odontología','',3 ),
      ('obstetricia','',3 ),
      ('medicina','',3),
      ('psicología','',3),
      ('otros','',3),

      ('camp. alpachaca','',4) ,
      ('ins. odontología','',4),
      ('ins. enfermería','',4),
      ('farmacia','',4),
      ('ins. laboratorio','',4),
      ('ins. farmacia','',4),
      ('ins. obstetricia','',4),


      ('jefa','',5),
      ('adm_química','',5),
      ('química','',5),
      ('trabajadora social','',5),
      ('consultante','',5),

      ('pérdida','',6),
      ('vencido','',6),
      ('donación','',6),
      ('campaña','',6),
      ('odontología','',6),
      ('enfermería','',6),
      ('laboratorio','',6),
      ('obstetricia','',6),

      ('asistencial','',7),
      ('laboratorio','',7),
      ('imagenes','',7),
      ('otros servicios','',7);
    
    */
    
    
    
}
