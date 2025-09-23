package es.cursojava.oo.herencia.ejercicios.hospital;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Enfermo extends Persona {
	private boolean enfermedad;
	private static final Logger log = LoggerFactory.getLogger(Enfermo.class);

	// Constructor por defecto vacío
	

	public Enfermo(String nombre, int edad, boolean enfermedad) {
		super(nombre, edad);
		this.enfermedad = enfermedad;
	}

	public Enfermo(String nombre, int edad) {
		super(nombre, edad);
	}

	public boolean getEnfermedad() {
		return enfermedad;
	}

	public void setEnfermedad(boolean enfermedad) {
		this.enfermedad = enfermedad;
	}

	@Override
	public String toString() {
		return "Enfermo [enfermedad=" + enfermedad + ", getNombre()=" + getNombre() + ", getEdad()=" + getEdad() + "]";
	}

	public void comer() {
		log.info("El enfermo " + getNombre() + " esta comiendo en la habitación");
	}

}
