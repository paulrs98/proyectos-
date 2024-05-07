package com.springboot.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.springboot.models.Producto;
import com.springboot.models.dao.ProductoDaoImpl;
@Controller
public class controllerProducto {
	@Autowired
	private ProductoDaoImpl dao;
	
	@GetMapping ("/")
	public String listar(Model modelo) {
		List<Producto>lista = dao.listar();
		modelo.addAttribute("listaproductos", lista);
				return "index";
	}

}