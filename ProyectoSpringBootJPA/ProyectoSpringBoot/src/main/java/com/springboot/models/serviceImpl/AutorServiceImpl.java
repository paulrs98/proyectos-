package com.springboot.models.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.models.entitys.Autor;
import com.springboot.models.repository.AutorRepository;
import com.springboot.models.services.AutorService;

@Service
public class AutorServiceImpl implements AutorService {

	@Autowired
	private AutorRepository repository;

	@Override
	public List<Autor> listar() {

		return repository.findAll();
	}

}
