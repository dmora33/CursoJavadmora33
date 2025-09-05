package es.cursojava.oo.ejercicios.libreria;

public class Libro {
	private String title;
	private String author;
	private String isbn;

	public Libro() {
		// genérico
	}

	public Libro(String title, String author, String isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getAuthor() {
		return this.author;
	}

	public void getIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String setIsbn() {
		return this.isbn;
	}

	public String showInformation2() {
		return "Libro [title=" + title + ", author=" + author + ", isbn=" + isbn + "]";
	}

	public void showInformaion() {
		System.out.println("Libro [title=" + title + ", author=" + author + ", isbn=" + isbn + "]");
	}
}
