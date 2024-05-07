package com.springboot.models.services;

import java.util.List;

import com.springboot.models.entitys.Producto;

public interface ProductoService {

	public List<Producto> listar();

	public void guardar(Producto producto);
}
