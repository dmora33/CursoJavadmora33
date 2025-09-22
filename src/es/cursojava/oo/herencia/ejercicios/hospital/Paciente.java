package es.cursojava.oo.herencia.ejercicios.hospital;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Paciente extends Persona {
	private String[] sintomas;
	private static final Logger log = LoggerFactory.getLogger(Paciente.class);

	public Paciente(String nombre, int edad, String[] sintomas) {
		super(nombre, edad);
		this.sintomas = sintomas;
	}

	public String[] getSintomas() {
		return sintomas;
	}

	public void setSintomas(String[] sintomas) {
		this.sintomas = sintomas;
	}

	@Override
	public String toString() {
		return "Paciente [sintomas=" + Arrays.toString(sintomas) + ", getSintomas()=" + Arrays.toString(getSintomas())
				+ ", getNombre()=" + getNombre() + ", getEdad()=" + getEdad() + "]";
	}

	@Override
	public void comer() {
		log.info("El paciente " + getNombre() + " esta comiendo");
	}

}
