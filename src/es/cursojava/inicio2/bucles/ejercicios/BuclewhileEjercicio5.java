package es.cursojava.inicio2.bucles.ejercicios;

import java.util.Scanner;

public class BuclewhileEjercicio5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("di el numero de alumnos");
		int numeroAlumnos = scan.nextInt();
		int sumaNotas=0;
		int i=0;
		while(i<numeroAlumnos) {
			System.out.println("dime la nota");
			int nota = scan.nextInt();
			sumaNotas= sumaNotas + nota;
			i++;
		}
		System.out.println("la media de las notas es:" + sumaNotas/numeroAlumnos);
		scan.close();
		// 

	}

}
