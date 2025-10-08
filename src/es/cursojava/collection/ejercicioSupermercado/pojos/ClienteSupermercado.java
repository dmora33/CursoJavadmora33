package es.cursojava.collection.ejercicioSupermercado.pojos;

import java.awt.List;
import java.util.ArrayList;

import es.cursojava.collection.ejercicioSupermercado.Alimentos.Alimentos;

public class ClienteSupermercado {
	private String nombre;
	private ArrayList<Alimentos> listaCompra = new ArrayList<Alimentos>();
	private double cuenta;

	// constructores

	public ClienteSupermercado() {
	}

	public ClienteSupermercado(String nombre) {
		super();
		this.nombre = nombre;
	}

	public ClienteSupermercado(String nombre, ArrayList<Alimentos> listaCompra) {
		super();
		this.nombre = nombre;
		this.listaCompra = listaCompra;
	}

	// get y set

	public double getCuenta() {
		return cuenta;
	}

	public void setCuenta(double cuenta) {
		this.cuenta = cuenta;
	}

	public ClienteSupermercado(String nombre, ArrayList<Alimentos> listaCompra, double cuenta) {
		super();
		this.nombre = nombre;
		this.listaCompra = listaCompra;
		this.cuenta = cuenta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Alimentos> getListaCompra() {
		return listaCompra;
	}

	public void setListaCompra(ArrayList<Alimentos> listaCompra) {
		this.listaCompra = listaCompra;
	}

	@Override
	public String toString() {
		return "ClienteSupermercado [nombre=" + nombre + ", listaCompra=" + listaCompra + ", cuenta=" + cuenta + "]";
	}

}
