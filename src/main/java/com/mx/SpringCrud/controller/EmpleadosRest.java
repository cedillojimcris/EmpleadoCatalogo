package com.mx.SpringCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.SpringCrud.dominio.Empleados;
import com.mx.SpringCrud.service.EmpleadosServ;

@CrossOrigin
@RestController
@RequestMapping("EmpleadosRest")
public class EmpleadosRest {
	
	@Autowired 
	EmpleadosServ empleadosServ;
	
	@GetMapping("listar")
	public List<Empleados> listar(){
		var lista = empleadosServ.listar();
		System.out.println("listar -->"+lista);
		return lista;
	}
	
	
	@PostMapping("guardar")
	public void guardar(@RequestBody Empleados empleados)
	{
		empleadosServ.guardar(empleados);
	}
	
	@PostMapping("editar")
	public void editar(@RequestBody Empleados empleados)
	{
		empleadosServ.editar(empleados);
	}
	
	@PostMapping("eliminar")
	public void eliminar(@RequestBody Empleados empleados)
	{
		empleadosServ.eliminar(empleados);
	}
	
	@PostMapping("buscar")
	public Empleados buscar(@RequestBody Empleados empleados)
	{
		empleados = empleadosServ.buscar(empleados);
		return empleados;
	}

}
