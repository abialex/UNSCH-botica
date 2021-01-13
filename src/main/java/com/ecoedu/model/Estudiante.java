/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecoedu.model;

import java.util.Date;
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
public class Estudiante{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @JoinColumn(insertable = true,updatable = false,name="id_persona",nullable = false)
    @ManyToOne(cascade = CascadeType.ALL)
    private Persona persona;
    
    @Column(name="fecha_nacimiento",nullable = true)
    private Date  fecha_nacimiento;
    
    @JoinColumn(insertable = true,updatable = false,name="id_escuela",nullable = false)
    @ManyToOne(cascade = CascadeType.ALL)
    private Escuela escuela;
    
    @Column(name="codigo",unique = true,length = 8,nullable = false)
    private String codigo;
    
    @Column(name="serie",length = 3,nullable = false)
    private String serie;
    
    @JoinColumn(insertable = true,updatable = false,name="id_condicion",nullable = true)
    @ManyToOne(cascade = CascadeType.ALL)
    private Rol Condicion;
    
    @JoinColumn(insertable = true,updatable = false,name="id_sexo",nullable = false)
    @ManyToOne(cascade = CascadeType.ALL)
    private Rol Sexo;
    
    @Column(name="nrotelefonico",unique = true,length = 9,nullable = true)
    private String nrotelefonico;

    public int getId() {
        return id;
    }

    public void setId(int id_Estudiante) {
        this.id = id_Estudiante;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public Escuela getEscuela() {
        return escuela;
    }

    public void setEscuela(Escuela escuela) {
        this.escuela = escuela;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public Rol getCondicion() {
        return Condicion;
    }

    public void setCondicion(Rol Condicion) {
        this.Condicion = Condicion;
    }

    public Rol getSexo() {
        return Sexo;
    }

    public void setSexo(Rol Sexo) {
        this.Sexo = Sexo;
    }

    public String getNrotelefonico() {
        return nrotelefonico;
    }

    public void setNrotelefonico(String nrotelefonico) {
        this.nrotelefonico = nrotelefonico;
    }

   
    
    
    
    
}
