package es.cursojava.mapas.ejercicio3biblioteca;

public class Libro {
	private String titulo;
	private int anio;
	private String isbn;
	public Libro() {
	}
	public Libro(String titulo, int anio, String isbn) {
		super();
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
	
	
	
	
	

}
