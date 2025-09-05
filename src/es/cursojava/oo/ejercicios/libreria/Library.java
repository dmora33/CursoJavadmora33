package es.cursojava.oo.ejercicios.libreria;

import java.util.Arrays;

public class Library {
	private String name;
	private Direccion address;
	private Libro[] books;
	private int limiteLibros; //añadimos un limite
	private int contadorLibros;

	public Library() {
	}
// añadimos al construc un limite para el array de libros,,, que es la capacidad
	public Library(String name, Direccion address,int limiteLibros)  {

		this.name = name;
		this.address = address;
		this.books =new Libro[limiteLibros];
	}

	public String getName() {
		return name;
	}

	public Library(Direccion address, Libro[] books) {
		super();
		this.address = address;
		this.books = books;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Direccion getAddress() {
		return address;
	}

	public void setAddress(Direccion address) {
		this.address = address;
	}

	public Libro[] getBooks() {
		return books;
	}

	public void setBooks(Libro[] books) {
		this.books = books;
	}
//public void addBook2(Libro books) {
//	if (contadorLibros<books.length) {
//		libro[contadorLibros++]=libro;
//	}else {System.out.println("its full fuck!!");}
//}
	public void addBook(Libro libro) {

		for (int i = 0; i < books.length; i++) {
			// boolean cut =true;
			if (books[i] == null) {

				books[i] = libro;
				break;
			}
//			} else if() {
//				System.err.println("there is no space!!");
//			}
		}
	}

	public void showBook() {
		System.out.println(Arrays.toString(books));
	}

	public void showInfLibrary() {
		getAddress();
		showBook();

	}
}
