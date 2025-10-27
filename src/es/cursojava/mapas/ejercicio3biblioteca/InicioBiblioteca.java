package es.cursojava.mapas.ejercicio3biblioteca;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import es.cursojava.utils.Utilidades;

public class InicioBiblioteca {

	// TODO:Solicitar los datos de un libro, autor, titulo, isbn y año de
	// publicación,
//	- si el autor no está en la biblioteca, solicitar la nacionalidad del autor y meterlo en la biblioteca, 
//	- si el autor sí está ya, agregar el libro a su listado

	private static void librosPubclicadosAnio(int anio, Map<Autor, List<Libro>> libreria) {
		Collection<List<Libro>> listaLibros = libreria.values(); // sacamos los libros!!!!!!!
		for (List<Libro> list : listaLibros) {
			for (Libro libro : list) {
				if (libro.getAnio() > anio) {
					System.out.println("libros del anio " + anio + libro.getTitulo());
				}
			}
		}
	}

	private static void nacionalidadAutor(Map<Autor, List<Libro>> libreria) {
		Set<Autor> autores = libreria.keySet(); // sacamos con KeySet solo las Ket
		for (Autor autor : autores) {
			System.out.println(autor.getNacionalidad());
			// solo saca las tres primeras letras
			// como tengo un autor con nacional null
//			try {
//				System.out.println(autor.getNacionalidad().substring(0, 3));
//			} catch (NullPointerException npe) {
//				// npe significa que clase NullPointerException y la variable npe
//				//
//				System.out.println("error al optener la nacionalidad");
//			} catch (StringIndexOutOfBoundsException siobe) {
//				// npe significa que clase StringIndexOutOfBoundsException y la variable siobe
//				//
//				System.out.println("te has pasado de listo con las posiciones de la nacionalidad");
//			} catch (Exception todasLasExcepciones) {
//				System.out.println("error general, cualquiera... lo buscas, los coge todos");
//			} finally {			System.out.println("todo lo que haya en finally se ejecuta siempre haya o no haya errores!!!!");
//
//			}

		}

	}
	// + mostrar por cada autor que tenga más de dos libros su nombre y el nombre de
	// todos los libros que tiene publicados

	private static void autorMasDeDosLibros(Map<Autor, List<Libro>> libreria) {

		Set<Entry<Autor, List<Libro>>> entrylibreria = libreria.entrySet(); // entry guarda las referencias

		for (Entry<Autor, List<Libro>> entry : entrylibreria) {
			Autor a = entry.getKey();

			List<Libro> libros = entry.getValue();
			if (libros.size() > 2) {
				for (Libro libro : libros) {
					System.out.println(libro.getTitulo());
				}
			}
		}
	}

	private static void eliminarLibroIsbn(String isbn, Map<Autor, List<Libro>> libreria) {

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
		Autor autor2 = new Autor("Pepa", null); // cambio a null para que me de un error y tener que hacer el control de
												// errores
		Autor autor3 = new Autor("Pepito", "Espanol");
		Autor autor4 = new Autor("Menganito", "Espanol");

		// si queremos modificar la lista hay que hacerlo asi no nos vale Arrays.asList
		// List<Libro> listaLibroAutor = new ArrayList();

		List<Libro> listaLibrosAutor1 = new ArrayList();
		listaLibrosAutor1.add(libro0);
		
		listaLibrosAutor1.add(libro1);
		// listaLibrosAutor1.add(libro2);

		List<Libro> listaLibrosAutor2 = Arrays.asList(libro3, libro4);// con arrys.aslist no podemos modificar el
																		// contenido
		List<Libro> listaLibrosAutor3 = Arrays.asList(libro5, libro6);
		List<Libro> listaLibrosAutor4 = Arrays.asList(libro7, libro8);

		Map<Autor, List<Libro>> libreria = new HashMap<>();
		libreria.put(autor1, listaLibrosAutor1);
		libreria.put(autor2, listaLibrosAutor2);
		libreria.put(autor3, listaLibrosAutor3);
		libreria.put(autor4, listaLibrosAutor4);
	//	libreria.get(listaLibrosAutor1).add(libro2); // tambien podemos añadir libro al autor desde la bibliotenca, esto est mal!!!!!

		nacionalidadAutor(libreria); 
		autorMasDeDosLibros(libreria);
	}

}
