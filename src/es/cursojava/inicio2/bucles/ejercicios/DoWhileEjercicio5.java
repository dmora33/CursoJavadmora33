package es.cursojava.inicio2.bucles.ejercicios;

import java.util.Scanner;

/**
 * solicitar por colsola el numero de alumnos de un alula.
 * Pedir para cada alumno su nota
 * Indicar la nota media de todos los alumnos del aula
 */
public class DoWhileEjercicio5 {
	public static void main (String [] args) {
		int contador=0;
		int sumaNotas=0;
	
		
		System.out.println("Dime el numero de alumnos");
			Scanner scan = new Scanner(System.in);
			int numeroAlumnos = scan.nextInt();
		do {
			System.out.println("Dime la nota del alumno");
			int nota=scan.nextInt();
			//sumaNotas= sumaNotas + nota;
			sumaNotas+=nota;
			
			contador++;
		}while (contador!=numeroAlumnos);
		System.out.println("la media es: "+ sumaNotas/numeroAlumnos);
		scan.close();
	}
		// TODO Auto-generated method stub



}
