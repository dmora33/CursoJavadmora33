package es.cursojava.interfaces.ejercicios.ejercicio1;

public abstract class Mueble implements Limpieable, Desinfectable {

	String color;

	public Mueble(String color) {
		this.color = color;
	}

}
