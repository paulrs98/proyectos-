package com.springboot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.models.entitys.Categoria;
import com.springboot.models.entitys.Marca;
import com.springboot.models.entitys.Producto;
import com.springboot.models.services.CategoriaService;
import com.springboot.models.services.MarcaService;
import com.springboot.models.services.ProductoService;

@Controller
public class ProductosController {
	@Autowired
	private ProductoService serviceProdu;
	@Autowired
	private CategoriaService serviceCat;
	@Autowired
	private MarcaService serviceMar;

	@GetMapping("/")
	public String index(Model modelo) {
		List<Producto> lista = serviceProdu.listar();
		modelo.addAttribute("listaProductos", lista);
		return "index";
	}

	@GetMapping("/nuevo")
	public String nuevo(Model modelo) {

		modelo.addAttribute("producto", new Producto());
		List<Categoria> lista = serviceCat.listar();
		modelo.addAttribute("listaCategorias", lista);
		List<Marca> listamarca = serviceMar.listar();
		modelo.addAttribute("listaMarcas", listamarca);

		return "nuevo";
	}

	@PostMapping("/guardar")
	public String guardar(@ModelAttribute Producto producto) {
		serviceProdu.guardar(producto);
		return "redirect:/";

	}
}
