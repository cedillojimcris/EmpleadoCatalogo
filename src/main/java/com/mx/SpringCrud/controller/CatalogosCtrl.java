package com.mx.SpringCrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mx.SpringCrud.dominio.Catalogos;
import com.mx.SpringCrud.service.CatalogosServ;

@Controller
@RequestMapping("CatalogosCtrl")
public class CatalogosCtrl {
	
	@Autowired
	CatalogosServ catalogosServ;
	
	@GetMapping("/")
	public String listar(Model model){
		
		var lista = catalogosServ.listar();
		model.addAttribute("lista", lista);
		return "indexMarcaAuto";
	}
	
	@GetMapping("alta")
	public String alta(Catalogos catalogos) {
		return "agregarMarcaAuto";
	}
	
	@PostMapping("guardar")
	public String guardar(Catalogos catalogos) {
		catalogosServ.guardar(catalogos);
		return "redirect:/CatalogosCtrl/";
	}
	
	@GetMapping("/eliminar/{id}")
	public String eliminar(Catalogos catalogos, Model model) {
		catalogos = catalogosServ.buscar(catalogos);
		model.addAttribute("catalogos", catalogos);
		return "eliminarMarcaAuto";
	}
	
	@PostMapping("delete")
	public String delete(Catalogos catalogos) {
		catalogosServ.eliminar(catalogos);
		return "redirect:/CatalogosCtrl/";
	}
	
	@GetMapping("/editar/{id}")
	public String editar(Catalogos catalogos, Model model) {
		
		catalogos = catalogosServ.buscar(catalogos);
		model.addAttribute("catalogos", catalogos);
		return "editarMarcaAuto";
		
	}
	
	@PostMapping("actualizar")
	public String actaulizar(Catalogos catalogos) {
		catalogosServ.editar(catalogos);
		return "redirect:/CatalogosCtrl/";
		
	}

}

