package com.springboot.models;

public class Boleta {
 private int  codigoboleta;
 private String nombrecliente;
 private int dni;
 private int codigoyogurt;
 private double precio;
 private int cantidad;
 
 
public Boleta() {
	super();
}


public Boleta(int codigoboleta, String nombrecliente, int dni, int codigoyogurt, double precio, int cantidad) {
	super();
	this.codigoboleta = codigoboleta;
	this.nombrecliente = nombrecliente;
	this.dni = dni;
	this.codigoyogurt = codigoyogurt;
	this.precio = precio;
	this.cantidad = cantidad;
}


public int getCodigoboleta() {
	return codigoboleta;
}


public void setCodigoboleta(int codigoboleta) {
	this.codigoboleta = codigoboleta;
}


public String getNombrecliente() {
	return nombrecliente;
}


public void setNombrecliente(String nombrecliente) {
	this.nombrecliente = nombrecliente;
}


public int getDni() {
	return dni;
}


public void setDni(int dni) {
	this.dni = dni;
}


public int getCodigoyogurt() {
	return codigoyogurt;
}


public void setCodigoyogurt(int codigoyogurt) {
	this.codigoyogurt = codigoyogurt;
}


public double getPrecio() {
	return precio;
}


public void setPrecio(double precio) {
	this.precio = precio;
}


public int getCantidad() {
	return cantidad;
}


public void setCantidad(int cantidad) {
	this.cantidad = cantidad;
}


public double Precio() {
    if (this.codigoyogurt==1) {
    	return this.precio=5.50;
    } else if(this.codigoyogurt==2) {
    	return this.precio=6.20;
    }else if(this.codigoyogurt==3) {
    	return this.precio=7.50;
    }else if(this.codigoyogurt==4) {
    	return this.precio=8.70;
    }else if(this.codigoyogurt==5){
    	return this.precio=9.30;
    }else 
    	return 0;
}

public double ImportCompra() {

 return this.cantidad * Precio();
}


public double ImportDesc() {
	if (this.cantidad >= 0 && this.cantidad < 15) {
		return ImportCompra()*0.04;
    } else if (this.cantidad >= 15 && this.cantidad < 30) {
        return ImportCompra()*0.065;
    } else if (this.cantidad >= 30 && this.cantidad < 45) {
        return ImportCompra()*0.09;
    } else if (this.cantidad >= 45 ) {
        return ImportCompra()*0.115;
    } else {
    	return 0;
    }

}
	
public double ImportTotal() {
	
	return this.ImportCompra()- ImportDesc();	

}

public String Obsequio() {
	if (this.cantidad >= 0 && this.cantidad <= 25) {
		return "Una historieta";
    } else if (this.cantidad > 25 ) {
        return "Una novela";
    } else {
    	return "No tiene Obsequio";
    }
}

}