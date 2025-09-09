package es.cursojava.oo.ejercicios.tiendaRopa;

import java.util.Arrays;

/**
 * para tener una camisa primero hay que tener un array de botones
 * 
 */
public class Camisa {
	private String color;
	private double precio;
	private double talla;
	private Boton[] boton;

	public Camisa(String color, double precio, double talla, Boton[] boton) {
		super();
		this.color = color;
		this.precio = precio;
		this.talla = talla;
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
