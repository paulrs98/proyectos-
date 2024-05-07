package com.springboot.models.entity;

@jakarta.persistence.Entity
@jakarta.persistence.Table(name="empleado")
public class Empleado {
@jakarta.persistence.Id
@jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)

@jakarta.persistence.Column(name="id_empleado")
private int id_empleado;

@jakarta.persistence.Column(name="apellido")
private String apellido;

@jakarta.persistence.Column(name="nombre")
private String nombre;

@jakarta.persistence.Column(name="telefono")
private int telefono;

@jakarta.persistence.Column(name="direccion")
private String direccion;

@jakarta.persistence.Column(name="fecha_nacimiento")
private String fecha_nacimiento;

@jakarta.persistence.Column(name="observaciones")
private String observaciones;

@jakarta.persistence.Column(name="sueldo")
private int sueldo;

public Empleado() {
	super();
}

public Empleado(int id_empleado, String apellido, String nombre, int telefono, String direccion,
		String fecha_nacimiento, String observaciones, int sueldo) {
	super();
	this.id_empleado = id_empleado;
	this.apellido = apellido;
	this.nombre = nombre;
	this.telefono = telefono;
	this.direccion = direccion;
	this.fecha_nacimiento = fecha_nacimiento;
	this.observaciones = observaciones;
	this.sueldo = sueldo;
}

public int getId_empleado() {
	return id_empleado;
}

public void setId_empleado(int id_empleado) {
	this.id_empleado = id_empleado;
}

public String getApellido() {
	return apellido;
}

public void setApellido(String apellido) {
	this.apellido = apellido;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public int getTelefono() {
	return telefono;
}

public void setTelefono(int telefono) {
	this.telefono = telefono;
}

public String getDireccion() {
	return direccion;
}

public void setDireccion(String direccion) {
	this.direccion = direccion;
}

public String getFecha_nacimiento() {
	return fecha_nacimiento;
}

public void setFecha_nacimiento(String fecha_nacimiento) {
	this.fecha_nacimiento = fecha_nacimiento;
}

public String getObservaciones() {
	return observaciones;
}

public void setObservaciones(String observaciones) {
	this.observaciones = observaciones;
}

public int getSueldo() {
	return sueldo;
}

public void setSueldo(int sueldo) {
	this.sueldo = sueldo;
}



}