package es.cursojava.enums;

import es.cursojava.examenmodulo2.pojos.Jinete;

public enum CaballosEnum {

	CABALLO1(7, "jinete1", "SALTITOS", 350, 52, 15), CABALLO2(6, "jinete6", "SALTITOS2", 350, 59, 5),
	CABALLO3(4, "jinete4", "SALTITOS3", 350, 57, 6), CABALLO4(2, "jinete2", "SALTITOS4", 350, 35, 9),
	CABALLO5(9, "jinete9", "SALTITOS", 350, 45, 2);

	private int aniosExperiencia;
	private String identificador;
	private String nombre;
	private double peso;
	private double velocidad;
	private int experiencia;

	private CaballosEnum(int aniosExperiencia, String identificador, String nombre, double peso, double velocidad,
			int experiencia) {
		this.aniosExperiencia = aniosExperiencia;
		this.identificador = identificador;
		this.nombre = nombre;
		this.peso = peso;
		this.velocidad = velocidad;
		this.experiencia = experiencia;
	}

	public int getAniosExperiencia() {
		return aniosExperiencia;
	}

	public String getIdentificador() {
		return identificador;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPeso() {
		return peso;
	}

	public double getVelocidad() {
		return velocidad;
	}

	public int getExperiencia() {
		return experiencia;
	}

}
