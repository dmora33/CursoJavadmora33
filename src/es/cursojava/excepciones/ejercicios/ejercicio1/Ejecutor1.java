package es.cursojava.excepciones.ejercicios.ejercicio1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import es.cursojava.oo.Alumno;
import es.cursojava.utils.Utilidades;

public class Ejecutor1 {

	// metodos que tengo

	// numero aleatorio

	// crear cienco alumnos

	// AlumnoException nombre = new AlumnoException(Utilidades.numeroAleatorio(0,
	// 80));

	/**
	 * crear un lista de 5 alumnos
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
	 * @throws NotaInvalidaExecption
	 * @throws IllegalAccessException
	 * 
	 */

	public static void main(String[] args) throws IllegalAccessException, NotaInvalidaExecption {
		// int numeroAleatorio = Utilidades.numeroAleatorio(100);
		// System.out.println(numeroAleatorio);
		List<AlumnoException> pollines = new ArrayList<>();
		// String nombre = Utilidades.NombreAleatorio();
// crear 5 alumnos
		AlumnoException nombre3 = new AlumnoException(35);
		AlumnoException nombre2 = new AlumnoException(25);
		pollines.add(nombre3);
		pollines.add(nombre2);
		pollines.toString();

	}

}
