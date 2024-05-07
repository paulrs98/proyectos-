package com.springboot.models.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.models.entitys.Categoria;
import com.springboot.models.repository.CategoriaRepository;
import com.springboot.models.services.CategoriaService;

@Service
public class CategoriaServiceImpl implements CategoriaService {

	@Autowired
	private CategoriaRepository repository;

	@Override
	public List<Categoria> listar() {

		return repository.findAll();
	}

}
