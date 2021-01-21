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
public class Lote_detalle implements Comparable<Lote_detalle>{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @JoinColumn(insertable = true,updatable = false,name="id_inventario",nullable = false)
    @ManyToOne(cascade = CascadeType.ALL)
    private Inventario inventario;
    
    @JoinColumn(insertable = true,updatable = false,name="id_laboratorio",nullable = true)
    @ManyToOne(cascade = CascadeType.ALL)
    private Laboratorio laboratorio;
    
    @JoinColumn(insertable = true,updatable = false,name="id_factura",nullable = false)
    @ManyToOne(cascade = CascadeType.ALL)
    private Factura factura;
    
    @JoinColumn(insertable = true,updatable = false,name="id_usuario",nullable = false)
    @ManyToOne(cascade = CascadeType.ALL)
    private Usuario usuario;
    
    @Column(name = "precio_venta_redondeado",nullable = false)
    private float precio_venta_redondeado;
    
    @Column(name="fecha_vencimiento",nullable = false)
    private Date  fecha_vencimiento;
    
    @Column(name="cantidad_actual",nullable = false)
    private int  cantidad_actual;
    
    @Column(name="codigo",length = 40,nullable = false)
    private String  codigo;

    @Column(name="isVencido",nullable = false)
    private boolean  isVencido;
    
    @Column(name="precio_unitario",nullable = false)
    private float  precio_unitario;
    
    @Column(name="fecha_de_registro",nullable = false)
    private Date fecha_de_registro;
    
      @Column(name = "cantidad_inicial", nullable = false)
    private int cantidad_inicial;
      
    public float getPrecio_Venta_Redondeado() {
        return precio_venta_redondeado;
    }

    public boolean isIsVencido() {
        return isVencido;
    }

    public void setIsVencido(boolean isVencido) {
        this.isVencido = isVencido;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public int getCantidad_actual() {
        return cantidad_actual;
    }

    public void setCantidad_actual(int cantidad_actual) {
        this.cantidad_actual = cantidad_actual;
    }

    public float getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(float precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public Date getFecha_de_registro() {
        return fecha_de_registro;
    }

    public void setFecha_de_registro(Date fecha_de_registro) {
        this.fecha_de_registro = fecha_de_registro;
    }

    public int getCantidad_inicial() {
        return cantidad_inicial;
    }

    public void setCantidad_inicial(int cantidad_inicial) {
        this.cantidad_inicial = cantidad_inicial;
    }
    
    

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }   
    
    public int getId() {
        return id;
    }

    public Laboratorio getLaboratorio() {
        return laboratorio;
    }

    public float getPrecio_venta_redondeado() {
        return precio_venta_redondeado;
    }

    public void setLaboratorio(Laboratorio laboratorio) {
        this.laboratorio = laboratorio;
    }

    public void setPrecio_venta_redondeado(float precio_venta_redondeado) {
        this.precio_venta_redondeado = precio_venta_redondeado;
    }


    public Date getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(Date fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }
    
    public void setId(int id_Lote_detalle) {
        this.id = id_Lote_detalle;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }



    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public Lote_detalle quitarCantidad(int cant){
        this.cantidad_actual=cantidad_actual-cant;
        return this;
    }
    
    @Override
    public String toString(){
        return this.codigo;
    }
    @Override
    public int compareTo(Lote_detalle o) {        
        return this.getInventario().getMedicamento().getNombre().compareTo(o.getInventario().getMedicamento().getNombre());
    }
    


    }
