package com.mx.SpringCrud.dominio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="CATALOGOS")
public class Catalogos {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	String nombre; 
	String descripcion;
	
	@OneToOne(mappedBy="catalogos", cascade=CascadeType.ALL)
	List<Empleados> lista = new ArrayList<Empleados>();
	
	
	public Catalogos() {
	}

	public Catalogos(String nombre, String descripcion) {
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", lista=" + lista + "]\n";
	}


	
	
	
}
