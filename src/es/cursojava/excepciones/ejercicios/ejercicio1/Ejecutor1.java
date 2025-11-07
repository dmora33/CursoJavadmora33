package es.cursojava.excepciones.ejercicios.ejercicio1;

import java.util.ArrayList;
import java.util.List;

import es.cursojava.utils.Utilidades;
import sun.jvm.hotspot.gc.parallel.PSYoungGen;

public class Ejecutor1 {

	// metodos que tengo

	/**
	 * crear un array de 5 alumnos
	 */

	// metodo crear alumno
	public static List<AlumnoException> creaAlumnoException() {
		List<AlumnoException> listaAlumnos = new ArrayList<AlumnoException>();
		String nombre = Utilidades.NombreAleatorio();
		return listaAlumnos;

//			AlumnoException nombre = new AlumnoException(Utilidades.pideDatoNumerico("dime la edad"));
//			AlumnoException Utilidades.NombreAleatorio() = new AlumnoException(Utilidades.pideDatoNumerico("dime la edad"));

	}

	/**
	 * recorrer el un bucle de 5 creando el alumno y dando los datos y añade crear
	 * metodo crear alumno llamar
	 */
	/**
	 * pidecadena crear metodo apara ingresar datos alumno
	 * 
	 */

	public static void main(String[] args) {
		String nombre = Utilidades.NombreAleatorio();
System.out.println(nombre);
}

}
