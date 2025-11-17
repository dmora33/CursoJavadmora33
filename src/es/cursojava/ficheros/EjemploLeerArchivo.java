package es.cursojava.ficheros;

import java.io.IOException;


public class EjemploLeerArchivo {

	public static void main(String[] args) {
		// String nombreArchivo = "D:\\Cursos\\Java\\archivo\\java.txt";
		String nombreArchivo = "./recursos/productos.txt";
		ArchivoServicio servicio = new ArchivoServicio();
		EjemploLeerArchivo ejemplo = new EjemploLeerArchivo();

		 System.out.println(servicio.leerArchivo2(nombreArchivo));
		try {
		//	System.out.println(servicio.leerArchivo(nombreArchivo));
		//	System.out.println(servicio.leerArchivo2(nombreArchivo)); como ya esta controlado el error leerarchivo2 nos da error dentro del trty

		} catch (IOException e) {
			System.out.println("recojo la exce" + e.getMessage());
			e.printStackTrace();
		}
	}
}
