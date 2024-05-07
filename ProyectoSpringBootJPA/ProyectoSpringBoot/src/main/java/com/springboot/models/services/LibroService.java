package com.springboot.models.services;

import java.util.List;

import com.springboot.models.entitys.Libro;

public interface LibroService {

	public List<Libro> listar();

	public void guardar(Libro libro);
}
