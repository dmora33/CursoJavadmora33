package es.cursojava.interfaces.ejercicios.ApagarEncender.pojos;

import es.cursojava.interfaces.ejercicios.ApagarEncender.Interfaces.Consultable;

public class Ramen extends Alimentos implements Consultable {

	public Ramen(String nombre, int precio, String fechaCaducidad) {
		super(nombre, precio, fechaCaducidad);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void select() {
		this.getId();
		
	}

	

	
	

	

	
	
}

