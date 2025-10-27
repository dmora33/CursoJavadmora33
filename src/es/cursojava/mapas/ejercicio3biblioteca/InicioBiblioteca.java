package es.cursojava.mapas.ejercicio3biblioteca;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import es.cursojava.utils.Utilidades;

public class InicioBiblioteca {

	private static void eliminarLibro(String isbn, Map<Autor, List<Libro>> libreria) {

	}

	public static void main(String[] args) {

		// AQUI TENDRIA QUE IR DIVIDIENDO EL ARRAY DE LIBROS
		// PAR AÑADIRLO POR TROZOS A LOS AUTORES EN LE MAPA
		// Libro[] libros = new Libro[9];

//        libros[0] = new Libro("Cien años de soledad", 1967, "978-84-376-0494-7");
//        libros[1] = new Libro("Don Quijote de la Mancha", 1605, "978-84-376-0493-0");
//        libros[2] = new Libro("1984", 1949, "978-84-670-4183-6");
//        libros[3] = new Libro("El Principito", 1943, "978-84-376-0491-6");
//        libros[4] = new Libro("Fahrenheit 451", 1953, "978-84-376-0492-3");
//        libros[5] = new Libro("Crimen y castigo", 1866, "978-84-376-0490-9");
//        libros[6] = new Libro("La sombra del viento", 2001, "978-84-376-0495-4");
//        libros[7] = new Libro("It", 1986, "978-84-376-0496-1");
//        libros[8] = new Libro("Orgullo y prejuicio", 1813, "978-84-376-0497-8");

		Libro libro0 = new Libro("Cien años de soledad", 1967, "978-84-376-0494-7");
		Libro libro1 = new Libro("Don Quijote de la Mancha", 1605, "978-84-376-0493-0");
		Libro libro2 = new Libro("1984", 1949, "978-84-670-4183-6");
		Libro libro3 = new Libro("El Principito", 1943, "978-84-376-0491-6");
		Libro libro4 = new Libro("Fahrenheit 451", 2022, "978-84-376-0492-3");
		Libro libro5 = new Libro("Crimen y castigo", 2025, "978-84-376-0490-9");
		Libro libro6 = new Libro("La sombra del viento", 2001, "978-84-376-0495-4");
		Libro libro7 = new Libro("It", 1986, "978-84-376-0496-1");
		Libro libro8 = new Libro("Orgullo y prejuicio", 2009, "978-84-376-0497-8");

		Autor autor1 = new Autor("Carlitos", "Espanol");
		Autor autor2 = new Autor("Pepa", "Espanol");
		Autor autor3 = new Autor("Pepito", "Espanol");
		Autor autor4 = new Autor("Menganito", "Espanol");

		List<Libro> listaLibrosAutor1 = Arrays.asList(libro0, libro1, libro2);
		List<Libro> listaLibrosAutor2 = Arrays.asList(libro3, libro4);
		List<Libro> listaLibrosAutor3 = Arrays.asList(libro5, libro6);
		List<Libro> listaLibrosAutor4 = Arrays.asList(libro7, libro8);

		Map<Autor, List<Libro>> libreria = new HashMap<>();
		libreria.put(autor1, listaLibrosAutor1);
		libreria.put(autor2, listaLibrosAutor2);
		libreria.put(autor3, listaLibrosAutor3);
		libreria.put(autor4, listaLibrosAutor4);

	}

}
