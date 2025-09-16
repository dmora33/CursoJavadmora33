package es.cursojava.oo.herencia.ejercicios.bandaMusica;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Piano extends Instrumento {
	private static final Logger log = LoggerFactory.getLogger(Piano.class);
	private int numeroOctavas;
	private String tipoPiano;

	public Piano(String nombre, String tipo, boolean afinado) {
		super(nombre, tipo, afinado);
		// TODO Auto-generated constructor stub
	}

	public Piano(String nombre, String tipo, boolean afinado, int numeroOctavas, String tipoPiano) {
		super(nombre, tipo, afinado);
		this.numeroOctavas = numeroOctavas;
		this.tipoPiano = tipoPiano;
	}

	public int getNumeroOctavas() {
		return numeroOctavas;
	}

	public void setNumeroOctavas(int numeroOctavas) {
		this.numeroOctavas = numeroOctavas;
	}

	public String getTipoPiano() {
		return tipoPiano;
	}

	public void setTipoPiano(String tipoPiano) {
		this.tipoPiano = tipoPiano;
	}

}
