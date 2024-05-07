package com.springboot.models.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.models.entitys.Marca;
import com.springboot.models.repository.MarcaRepository;
import com.springboot.models.services.MarcaService;

@Service
public class MarcaServiceImpl implements MarcaService {

	@Autowired
	private MarcaRepository repository;

	@Override
	public List<Marca> listar() {

		return repository.findAll();
	}

}
