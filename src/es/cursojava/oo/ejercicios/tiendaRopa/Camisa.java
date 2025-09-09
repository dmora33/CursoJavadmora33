package es.cursojava.oo.ejercicios.tiendaRopa;

import java.util.Arrays;

/**
 * para tener una camisa primero hay que tener un array de botones
 * 
 */
public class Camisa {
	
		
	private String color;
	private double precio;
	private String talla;
	private Boton[] boton;

	public Camisa(String color, double precio, String talla, Boton[] boton) {
		super();
		this.color = color;
		this.precio = precio;
		this.talla = talla;
		this.boton = boton;
	}
	

	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getTalla() {
		return talla;
	}


	public void setTalla(String talla) {
		this.talla = talla;
	}


	public Boton[] getBoton() {
		return boton;
	}


	public void setBoton(Boton[] boton) {
		this.boton = boton;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public void mostrarCamisa() {
		System.out.println("\ncolor:\t" + this.color + "\nprecio:\t" + this.precio + "\ntalla:\t" + talla + "\nboton\t"
				+ Arrays.toString(boton));
	}

}
