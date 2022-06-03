package com.mx.SpringCrud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("MenuCtrl")
public class MenuCtrl {

	@GetMapping("/")
	public String listar(){
		

		return "menu";
	}
}
