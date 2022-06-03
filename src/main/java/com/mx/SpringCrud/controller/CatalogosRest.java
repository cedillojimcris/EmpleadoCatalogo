package com.mx.SpringCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.SpringCrud.dominio.Catalogos;
import com.mx.SpringCrud.service.CatalogosServ;

@CrossOrigin
@RestController
@RequestMapping("MarcaRest") //localhost:1521/
public class CatalogosRest {
	
	@Autowired
	CatalogosServ catalogosServ;
	
	@GetMapping("listar")
	public List<Catalogos> listar(){
		var lista = catalogosServ.listar();
		System.out.println("listar -->"+lista);
		return lista;
	}
	
	
	@PostMapping("guardar")
	public void guardar(@RequestBody Catalogos catalogos)
	{
		catalogosServ.guardar(catalogos);
	}
	
	@PostMapping("editar")
	public void editar(@RequestBody Catalogos catalogos)
	{
		catalogosServ.editar(catalogos);
	}
	
	@PostMapping("eliminar")
	public void eliminar(@RequestBody Catalogos catalogos)
	{
		catalogosServ.eliminar(catalogos);
	}
	
	@PostMapping("buscar")
	public Catalogos buscar(@RequestBody Catalogos catalogos)
	{
		catalogos = catalogosServ.buscar(catalogos);
		return catalogos;
	}

}