package es.cursojava.interfaces.ejercicios.ejercicio1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Lechuga extends Verdura implements Desinfectable {
	private static final Logger log = LoggerFactory.getLogger(Lechuga.class);

	public Lechuga(String procedencia) {
		super(procedencia);
	}

	String tipo;

	@Override
	public void limpiar() {
		log.info("Limpiando ");
	}

	@Override
	public void desinfectar() {
		// TODO Auto-generated method stub

	}

}
