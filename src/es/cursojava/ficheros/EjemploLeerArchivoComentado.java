package es.cursojava.ficheros;

import java.io.IOException;

public class EjemploLeerArchivoComentado {

	public static void main(String[] args) {
		// Se declara una variable para almacenar la ruta del archivo a leer.
		// La primera línea está comentada: usa una ruta absoluta en Windows.
		// La segunda línea usa una ruta relativa a la carpeta del proyecto.
		// Esto permite mayor portabilidad entre entornos.
		// String nombreArchivo = "D:\\Cursos\\Java\\archivo\\java.txt";
		String nombreArchivo = "./recursos/java3.txt";

		// Se crea una instancia del servicio que contiene métodos para trabajar con
		// archivos.
		// ArchivoServicio es una clase externa no mostrada aquí que probablemente tenga
		// métodos
		// para leer, crear o escribir archivos.
		ArchivoServicio servicio = new ArchivoServicio();

		// Se crea una instancia de esta misma clase (EjemploLeerArchivo), aunque
		// realmente no se usa
		// más adelante. Podría eliminarse sin afectar la ejecución.
		EjemploLeerArchivo ejemplo = new EjemploLeerArchivo();

		// Línea comentada: muestra cómo se podría usar otro método del servicio
		// (leerArchivo2)
		// para leer el contenido del archivo y mostrarlo por consola.
		// System.out.println(servicio.leerArchivo2(nombreArchivo));

		try {
			// Se intenta leer el contenido del archivo utilizando el método leerArchivo3
			// del servicio.
			// Este método probablemente lanza una excepción IOException si hay problemas de
			// lectura
			// (por ejemplo, si el archivo no existe o no se puede acceder).
			// El resultado (posiblemente el contenido del archivo en texto) se imprime en
			// consola.
			System.out.println(servicio.leerArchivo3(nombreArchivo));
		} catch (IOException e) {
			// Bloque de captura de excepciones: si ocurre un error de E/S, se imprime el
			// stack trace
			// (traza de la excepción) en la salida de error. Esto ayuda a depurar el fallo.
			// TODO Auto-generated catch block es un comentario generado automáticamente por
			// el IDE
			// indicando que este bloque se puede completar con una gestión más adecuada.
			e.printStackTrace();
		}
	}
}