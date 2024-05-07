package com.springboot.models.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.models.entity.Empleado;
import com.springboot.models.repository.EmpleadoRepository;
import com.springboot.models.service.EmpleadoService;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {

	@Autowired
	private EmpleadoRepository repository;
	
	@Override
	public List<Empleado> listar() {

		return repository.findAll();
	}

	@Override
	public void guardar(Empleado empleado) {
		repository.save(empleado);
		
	}

	
	@Override
	public List<Empleado> buscarPorID(Long id_empleado) {
		// TODO Auto-generated method stub
		return null;
	}

}
