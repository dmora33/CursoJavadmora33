package es.cursojava.oo.ejercicios.libreria;

public class Main {

	public static void main(String[] args) {

// creo una direcion
		Direccion direccion1 = new Direccion();

		// creo tres libros
		Libro book1 = new Libro("libro1", "autor1", "loquesea1");
		Libro book2 = new Libro("libro2", "autor2", "loquesea2");
		Libro book3 = new Libro("libro3", "autor3", "loquesea3");
		// importante si estoy creando un array de Libro[10] con sus atributos...
		// declaro todo con [] y no con ().
		//Libro[] books = new Libro[10];

//creo obj libreria1 con sus caract.
		
		Library library1 = new Library("first", direccion1,10);
		library1.addBook(book1);
		library1.addBook(book2);
		library1.addBook(book3);

		// Muestra la información completa de la biblioteca.

		// llamo los metodos
	}

}
