package es.cursojava.collection.listas.ejercicios.ejercicio1;

import java.util.Arrays;

public class AlumnoNew {
	private String nombre;
	private String dni;
	private double notaMedia;
	private String[] asignaturas;

	public AlumnoNew(String nombre, String dni, double notaMedia) {
		this.nombre = nombre;
		this.dni = dni;
		this.notaMedia = notaMedia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public double getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}

	public String[] getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(String[] asignaturas) {
		this.asignaturas = asignaturas;
	}

	@Override
	public String toString() {
		return "AlumnoNew [nombre=" + nombre + ", dni=" + dni + ", notaMedia=" + notaMedia + ", asignaturas="
				+ Arrays.toString(asignaturas) + "]";
	}

}
