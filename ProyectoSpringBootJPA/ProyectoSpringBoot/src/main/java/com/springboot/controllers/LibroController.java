package com.springboot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.models.entitys.Autor;
import com.springboot.models.entitys.Categoria;
import com.springboot.models.entitys.Libro;
import com.springboot.models.services.AutorService;
import com.springboot.models.services.CategoriaService;
import com.springboot.models.services.LibroService;

@Controller
public class LibroController {
	@Autowired
	private LibroService serviceLib;
	@Autowired
	private AutorService serviceAut;
	@Autowired
	private CategoriaService serviceCatego;

	@GetMapping("/")
	public String index(Model modelo) {
		List<Libro> lista = serviceLib.listar();
		modelo.addAttribute("listaLibros", lista);
		return "index";
	}

	@GetMapping("/nuevo")
	public String nuevo(Model modelo) {

		modelo.addAttribute("libro", new Libro());
		List<Autor> lista = serviceAut.listar();
		modelo.addAttribute("listaAutores", lista);
		List<Categoria> listacategoria = serviceCatego.listar();
		modelo.addAttribute("listaCategorias", listacategoria);

		return "nuevo";
	}

	@PostMapping("/guardar")
	public String guardar(@ModelAttribute Libro libro) {
		serviceLib.guardar(libro);
		return "redirect:/";

	}
}