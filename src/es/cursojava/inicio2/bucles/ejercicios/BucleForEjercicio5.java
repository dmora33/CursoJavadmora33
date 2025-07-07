package es.cursojava.inicio2.bucles.ejercicios;

import java.util.Scanner;

/**
 * Solicitar por consola el numero de alumnos de un aula. Pedir para cada alumno
 * su nota Indicar la nota media de todos los alumnos del aula.
 * 
 */
public class BucleForEjercicio5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("número de alumnos:");
		int numAlumnos = scan.nextInt();
		int sumaNotas = 0;

		for (int i = 0; i < numAlumnos; i++) {
			System.out.println("di la nota");
			int nota = scan.nextInt();
			if (nota >= 0 && nota <= 10) {
				sumaNotas = sumaNotas + nota;
			} else {
				System.out.println("nota incorrecta solo puede ser del 0 al 10");
			}
		}
		scan.close();
		System.out.println("la media de las notas es:" + sumaNotas / numAlumnos);
	}

}
