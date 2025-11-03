package Examen2.pojos;

import java.util.Random;

import Examen2.interfaz.Participable;

public class Jinete extends Persona implements Participable {

	private int aniosExperiencia;
	private String identificador;

	public Jinete(String nombre, int edad, int aniosExperiencia) {
		super(nombre, edad);
		this.aniosExperiencia = aniosExperiencia;
	}

	public Jinete(String nombre, int edad) {
		super(nombre, edad);
		// TODO Auto-generated constructor stub
	}

	public int getAniosExperiencia() {
		return aniosExperiencia;
	}

	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}

	@Override
	public String toString() {
		return "Jinete [aniosExperiencia=" + aniosExperiencia + "]";
	}

	@Override
	public String getIdentificador() {
		Random random = new Random();
		this.identificador = "Jinete" + random.nextInt(0, 1000);
		return identificador;

	}

}
