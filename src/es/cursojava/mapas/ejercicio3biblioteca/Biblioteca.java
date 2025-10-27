package es.cursojava.mapas.ejercicio3biblioteca;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Biblioteca {
	Map<Autor, List<Libro>> biblioteca = new HashMap<>();

	public Biblioteca(Map<Autor, List<Libro>> biblioteca) {
		this.biblioteca = biblioteca;
	}

	public Map<Autor, List<Libro>> getBiblioteca() {
		return biblioteca;
	}

	public void setBiblioteca(Map<Autor, List<Libro>> biblioteca) {
		this.biblioteca = biblioteca;
	}

	@Override
	public String toString() {
		return "Biblioteca [biblioteca=" + biblioteca + "]";
	}

}
