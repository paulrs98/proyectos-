package com.springboot.models;

public class Producto {
	private int idproducto;
	private String nombre;
	private String marca;
	private int stock;
	private double preciocompra;
	private double precioventa;
	private String fechavencimiento;
	private String fechaingreso;
	private char estado;
	
	public Producto() {
		super();
	}

	public Producto(int idproducto, String nombre, String marca, int stock, double preciocompra, double precioventa,
			String fechavencimiento, String fechaingreso, char estado) {
		super();
		this.idproducto = idproducto;
		this.nombre = nombre;
		this.marca = marca;
		this.stock = stock;
		this.preciocompra = preciocompra;
		this.precioventa = precioventa;
		this.fechavencimiento = fechavencimiento;
		this.fechaingreso = fechaingreso;
		this.estado = estado;
	}

	public int getIdproducto() {
		return idproducto;
	}

	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public double getPreciocompra() {
		return preciocompra;
	}

	public void setPreciocompra(double preciocompra) {
		this.preciocompra = preciocompra;
	}

	public double getPrecioventa() {
		return precioventa;
	}

	public void setPrecioventa(double precioventa) {
		this.precioventa = precioventa;
	}

	public String getFechavencimiento() {
		return fechavencimiento;
	}

	public void setFechavencimiento(String fechavencimiento) {
		this.fechavencimiento = fechavencimiento;
	}

	public String getFechaingreso() {
		return fechaingreso;
	}

	public void setFechaingreso(String fechaingreso) {
		this.fechaingreso = fechaingreso;
	}

	public char getEstado() {
		return estado;
	}

	public void setEstado(char estado) {
		this.estado = estado;
	}
	
	
	
}