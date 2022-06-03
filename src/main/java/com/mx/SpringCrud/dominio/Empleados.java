package com.mx.SpringCrud.dominio;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="EMPLEADOS")
public class Empleados {

	
	@Id
	int id;
	String nomEmpleado;
	String apEmpleado; 
	String fecha; //yyyy-mm-dd
	String correo;
	String celular;
	String contrato;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="ID_CONTRATO")
	Catalogos catalogos;
	
	boolean activo;

}
