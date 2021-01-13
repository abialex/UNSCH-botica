/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecoedu.model;

import java.io.Serializable;
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
public class Descarga implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @JoinColumn(insertable = true,updatable = false,name="id_usuario",nullable = false)
    @ManyToOne(cascade = CascadeType.ALL)
    private Usuario usuario;
    
    @JoinColumn(insertable = true,updatable = false,name="id_usuarioreceptor",nullable = true)
    @ManyToOne(cascade = CascadeType.ALL)
    private Usuario usuarioreceptor;
    
    @JoinColumn(insertable = true,updatable = false,name="id_lote_detalle",nullable = false)
    @ManyToOne(cascade = CascadeType.ALL)
    private Lote_detalle lote_detalle;
    
    @JoinColumn(insertable = true,updatable = false,name="id_tipo",nullable = false)
    @ManyToOne(cascade = CascadeType.ALL)
    private Rol tipo;
    
    @Column(name = "cantidad",nullable = false)
    private int cantidad;
    
    @Column(name = "fecha",nullable = false)
    private Date fecha;
    
    @Column(name = "motivo", nullable = true, length = 120)
    private String motivo;
    
    @Column(name = "destino_persona",nullable = true, length = 60)
    private String destino_persona;
    
    @Column(name = "codigo_documento",nullable = false, length = 30)
    private String codigo_documento;

    public String getCodigo_documento() {
        return codigo_documento;
    }

    public void setCodigo_documento(String codigo_documento) {
        this.codigo_documento = codigo_documento;
    }

    public Usuario getUsuarioRecibe() {
        return usuarioreceptor;
    }

    public void setUsuarioRecibe(Usuario usuarioreceptor) {
        this.usuarioreceptor = usuarioreceptor;
    }  
    
    public int getId() {
        return id;
    }

    public void setId(int id_Descarga) {
        this.id = id_Descarga;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Lote_detalle getLote_detalle() {
        return lote_detalle;
    }

    public void setLote_detalle(Lote_detalle lote_detalle) {
        this.lote_detalle = lote_detalle;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Rol getTipo() {
        return tipo;
    }

    public void setTipo(Rol Tipo) {
        this.tipo = Tipo;
    }
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getDestino_persona() {
        return destino_persona;
    }

    public void setDestino_persona(String destino_persona) {
        this.destino_persona = destino_persona;
    }
    
    
}
