package com.springboot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.models.entity.Empleado;
import com.springboot.models.service.EmpleadoService;

@Controller
public class EmpleadoController {
	@Autowired
	private EmpleadoService service;
	
	@GetMapping("/")
	public String listado(Model modelo) {
		List<Empleado>listado=service.listar();
		modelo.addAttribute("listadoEmpleados", listado);
		return "index";
	}
	
	@GetMapping("/nuevo")
	public String nuevo(Model modelo) {
		modelo.addAttribute("empleado", new Empleado());
		return "nuevo";
	}
	
	@PostMapping("/guardar")
	public String guardar(@ModelAttribute Empleado empleado) {
		service.guardar(empleado);
		return "redirect:/";
	}
}
