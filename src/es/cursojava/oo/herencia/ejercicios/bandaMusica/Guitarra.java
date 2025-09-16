package es.cursojava.oo.herencia.ejercicios.bandaMusica;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Guitarra extends Instrumento {
	private static final Logger log = LoggerFactory.getLogger(Guitarra.class);
	private int numCuerdas;

	public Guitarra(String nombre, String tipo, boolean afinado) {
		super(nombre, tipo, afinado);
		// TODO Auto-generated constructor stub
	}

	public Guitarra(String nombre, String tipo, boolean afinado, int numCuerdas) {
		super(nombre, tipo, afinado);
		this.numCuerdas = numCuerdas;
	}

	public int getNumCuerdas() {
		return numCuerdas;
	}

	public void setNumCuerdas(int numCuerdas) {
		this.numCuerdas = numCuerdas;
	}

	public void afinar() {
		super.afinar();
		log.info("Afinando guitarra");
	}

}
