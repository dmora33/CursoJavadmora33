package es.cursojava.mapas.ejercicio3biblioteca;

import java.util.Objects;

public class Libro {
	private String titulo;
	private int anio;
	private String isbn;

	public Libro() {
	}

	public Libro(String titulo, int anio, String isbn) {
		this.titulo = titulo;
		this.anio = anio;
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", anio=" + anio + ", isbn=" + isbn + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(anio, isbn, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return anio == other.anio && Objects.equals(isbn, other.isbn) && Objects.equals(titulo, other.titulo);
	}

}
