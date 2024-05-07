package com.springboot.models.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.models.entitys.Libro;
import com.springboot.models.repository.LibroRepository;
import com.springboot.models.services.LibroService;

@Service
public class LibroServiceImpl implements LibroService {

	@Autowired
	private LibroRepository repository;

	@Override
	public List<Libro> listar() {

		return repository.findAll();
	}

	@Override
	public void guardar(Libro libro) {
		repository.save(libro);
	}

}
