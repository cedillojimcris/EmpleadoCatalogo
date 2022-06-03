package com.mx.SpringCrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mx.SpringCrud.dominio.Empleados;
import com.mx.SpringCrud.service.EmpleadosServ;

@Controller
@RequestMapping("EmpleadosCtrl") //localhost:1521/
public class EmpleadosCtrl {
	
	@Autowired
	EmpleadosServ empleadosServ;
	
	@GetMapping("/")
	public String listar(Model model){
		
		var lista = empleadosServ.listar();
		model.addAttribute("lista", lista);
		return "indexAutos";
	}
	
	@GetMapping("alta")
	public String alta(Empleados empleados) {
		return "agregarAutos";
	}
	
	@PostMapping("guardar")
	public String guardar(Empleados empleados) {
		empleadosServ.guardar(empleados);
		return "redirect:/EmpleadosCtrl/";
	}
	
	@GetMapping("/eliminar/{id}")
	public String eliminar(Empleados empleados, Model model) {
		empleados = empleadosServ.buscar(empleados);
		model.addAttribute("autos", empleados);
		return "eliminarAutos";
	}
	
	@PostMapping("delete")
	public String delete(Empleados empleados) {
		empleadosServ.eliminar(empleados);
		return "redirect:/EmpleadosCtrl/";
	}
	
	@GetMapping("/editar/{id}")
	public String editar(Empleados empleados, Model model) {
		
		empleados = empleadosServ.buscar(empleados);
		model.addAttribute("autos", empleados);
		return "editarAutos";
		
	}
	
	@PostMapping("actualizar")
	public String actaulizar(Empleados empleados) {
		empleadosServ.editar(empleados);
		return "redirect:/EmpleadosCtrl/";
		
	}

}
