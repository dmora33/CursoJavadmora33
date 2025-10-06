package es.cursojava.collection.listas.ejercicios.ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MecagoEnElMain {

	public static void main(String[] args) {

		AlumnoNew alumno1 = new AlumnoNew("Carlitos1", "65465f1", 1.5);
		AlumnoNew alumno2 = new AlumnoNew("Carlitos2", "65465f2", 2.5);
		AlumnoNew alumno3 = new AlumnoNew("Carlitos3", "65465f3", 3.5);
		AlumnoNew alumno4 = new AlumnoNew("Carlitos4", "65465f4", 4.5);
		AlumnoNew alumno5 = new AlumnoNew("Carlitos5", "65465f5", 5.5);
		AlumnoNew alumno6 = new AlumnoNew("Carlitos6", "65465f6", 6.5);
		AlumnoNew alumno7 = new AlumnoNew("Carlitos7", "65465f7", 7.5);
		AlumnoNew alumno8 = new AlumnoNew("Carlitos8", "65465f8", 9.5);

		List<AlumnoNew> listaAlumnos = new ArrayList<AlumnoNew>();
		listaAlumnos.add(alumno1);
		listaAlumnos.add(alumno2);
		listaAlumnos.add(alumno3);
		listaAlumnos.add(alumno4);
		listaAlumnos.add(alumno5);
		listaAlumnos.add(alumno6);
		listaAlumnos.add(alumno7);
		listaAlumnos.add(alumno8);
//llamo a los metodos
		mostrarInfoAlumno(listaAlumnos);
		System.out.println("solo los que tiene más de 9");
		mostrarAlumnoMasDeNueve(listaAlumnos);
		System.out.println("eliminar alumnos suspensos");
		eliminarAlumno(listaAlumnos);
		mostrarInfoAlumno(listaAlumnos);
		mostrarAlumnoNombre(listaAlumnos);
	}

	public static void mostrarInfoAlumno(List<AlumnoNew> listaAlumnos) {
		for (AlumnoNew alumno : listaAlumnos) {
			System.out.println(alumno);
		}

	}

	public static void mostrarAlumnoMasDeNueve(List<AlumnoNew> listaAlumnos) {
		for (AlumnoNew alumnoNew : listaAlumnos) {
			if (alumnoNew.getNotaMedia() > 9) {
				System.out.println(alumnoNew.getNombre() + "\n" + alumnoNew.getNotaMedia());
			}
		}
	}

	public static void mostrarAlumnoNombre(List<AlumnoNew> listaAlumnos) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Dime el nombre del Alumno");
		String nombre = scan.next();
		for (AlumnoNew alumnoNew : listaAlumnos) {
			if (alumnoNew.getNombre().equals(nombre)) {
				System.out.println(alumnoNew.getNotaMedia());
			}
		}

	}

	// elimina de la lista todos los alumnos con notaMedia menor de 5
	public static void eliminarAlumno(List<AlumnoNew> listadoAlumnos) {
		// esta es una buena manera d resolver pero lo hemos dado en clase;
		
		// listadoAlumnos.removeIf(alumno -> alumno.getNotaMedia() < 5);
		
//	    if (alumnoNew.getNotaMedia() < 5) {
//	        listadoAlumnos.remove(alumnoNew); ERROR en tiempo de ejecución
//	    }
		for (int i = 0; i < listadoAlumnos.size(); i++) {
// podemos hacer lo que cada vez que borre uno la i retroceda para que cuando la lista se arregle no pierda la posición.
			// otra solución es recorrerlo del final al princiío, de esa manera nunca pierde
			// la referencia de posición.

		}

	}

}
