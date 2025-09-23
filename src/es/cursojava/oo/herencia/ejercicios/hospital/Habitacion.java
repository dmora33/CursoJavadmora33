package es.cursojava.oo.herencia.ejercicios.hospital;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Habitacion {
	private int numero;
	private Enfermo enfermo;

	private static final Logger log = LoggerFactory.getLogger(Habitacion.class);

	public Habitacion() {
		super();
	}

	public Habitacion(int numero, Enfermo enfermo) {
		super();
		this.numero = numero;
		this.enfermo = enfermo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Enfermo getEnfermo() {
		return enfermo;
	}

	public void setEnfermo(Enfermo enfermo) {
		this.enfermo = enfermo;
	}

	@Override
	public String toString() {
		return "Habitacion [numero=" + numero + ", enfermo=" + enfermo + "]";
	}

}
