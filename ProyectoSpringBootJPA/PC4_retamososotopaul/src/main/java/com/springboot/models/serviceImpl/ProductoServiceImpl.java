package com.springboot.models.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.models.entitys.Producto;
import com.springboot.models.repository.ProductoRepository;
import com.springboot.models.services.ProductoService;

@Service
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	private ProductoRepository repository;

	@Override
	public List<Producto> listar() {

		return repository.findAll();
	}

	@Override
	public void guardar(Producto producto) {
		repository.save(producto);
	}

}
