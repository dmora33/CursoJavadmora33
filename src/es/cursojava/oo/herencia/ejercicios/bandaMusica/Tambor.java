package es.cursojava.oo.herencia.ejercicios.bandaMusica;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Tambor extends Instrumento {
	private String material;
	private static final Logger log = LoggerFactory.getLogger(Tambor.class);

	public Tambor(String nombre, String tipo, boolean afinado) {
		super(nombre, tipo, afinado);
		// TODO Auto-generated constructor stub
	}

	public Tambor(String nombre, String tipo, boolean afinado, String material) {
		super(nombre, tipo, afinado);
		this.material = material;
	}

	public void afinar() {
		super.afinar();
		log.info("afinando");

	}

	public void aporrear() {
		log.info("aprorreando Tambor");
	}
}
