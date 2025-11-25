package es.cursojava.ficheros;

import java.io.IOException;

public class EjemploLeerArchivo {

	public static void main(String[] args) throws IOException {
		// String nombreArchivo = "D:\\Cursos\\Java\\archivo\\java.txt";
		String nombreArchivo = "./recursos/productos.txt";
		ArchivoServicio servicio = new ArchivoServicio();
		EjemploLeerArchivo ejemplo = new EjemploLeerArchivo();

		System.out.println(servicio.leerArchivo2(nombreArchivo));
	}
}
