package com.mx.SpringCrud.service;

import java.util.List;

import com.mx.SpringCrud.dominio.Empleados;

public interface EmpleadosServ {
	
	public void guardar(Empleados empleados);
	public void editar(Empleados empleados);
	public void eliminar(Empleados empleados);
	public Empleados buscar(Empleados empleados);
	public List<Empleados> listar(/*No poner nada le da amsiedad*/);

}