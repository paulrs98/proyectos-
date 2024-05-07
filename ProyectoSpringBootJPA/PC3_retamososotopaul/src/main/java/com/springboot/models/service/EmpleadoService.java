package com.springboot.models.service;

import java.util.List;

import com.springboot.models.entity.Empleado;

public interface EmpleadoService {
/*METODOS CRUD*/
	public List<Empleado>listar();
	public void guardar(Empleado empleado);
	public List<Empleado> buscarPorID(Long id_empleado);
}
