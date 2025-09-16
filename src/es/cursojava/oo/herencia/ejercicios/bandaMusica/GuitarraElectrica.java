package es.cursojava.oo.herencia.ejercicios.bandaMusica;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GuitarraElectrica extends Guitarra {
	private static final Logger log = LoggerFactory.getLogger(Guitarra.class);
	private int potencia;

	public GuitarraElectrica(String nombre, String tipo, boolean afinado) {
		super(nombre, tipo, afinado);
		// TODO Auto-generated constructor stub
	}

	public GuitarraElectrica(String nombre, String tipo, boolean afinado, int potencia) {
		super(nombre, tipo, afinado);
		this.potencia = potencia;

	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public void tocar() {
		log.info("Tocar muy alto");
	}
}
