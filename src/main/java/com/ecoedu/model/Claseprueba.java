package com.ecoedu.model;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Claseprueba {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	private int id_clasePrueba;
	
	@Column(name = "nombrecito", unique = false, nullable = true)
	private String nombrecito;
	
	public String getNombrecito() {
		return nombrecito;
	}
}
