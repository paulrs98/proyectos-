package com.springboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.models.Boleta;

@Controller
public class controllerBoleta
	 {
			@GetMapping("/")
			public String abrirTienda(Model modelo) {
				modelo.addAttribute("boleta", new Boleta());
				return "index";
			}

			@PostMapping("/vender")
			public String calcularVenta(Model modelo, Boleta obj) {
				modelo.addAttribute("b_codigoboleta", obj.getCodigoboleta());
				modelo.addAttribute("b_nombrecliente", obj.getNombrecliente());
				modelo.addAttribute("b_dni", obj.getDni());
				modelo.addAttribute("b_codigoyogurt", obj.getCodigoyogurt());
				modelo.addAttribute("b_precio", obj.Precio());
				modelo.addAttribute("b_cantidad", obj.getCantidad());
				modelo.addAttribute("b_importcompra", obj.ImportCompra());
				modelo.addAttribute("b_importdesc", obj.ImportDesc());
				modelo.addAttribute("b_importtotal", obj.ImportTotal());
				modelo.addAttribute("b_obsequio", obj.Obsequio());
				return "index";	
	}

}