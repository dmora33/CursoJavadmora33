package es.cursojava.inicio2.bucles.ejercicios;

import java.util.Scanner;

/**
 * 8. Numero tenistas en el top 10 --> 
 * + Pedir por teclado la cantidad de tenistas que se apuntan a un torneo, 
 * + por cada uno de ellos preguntar en que puesto de la ATP se encuentran. 
 * + Indicar cuantos tenistas estarían entre los diez primeros.
 */
public class BucleForEjercicio8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int contador10=0;
		int numTenistas=0;
		System.out.println("dime el numero de tenistas");
		numTenistas=scan.nextInt();
//		for (int i=0;i<numTenistas;i++) {
//			System.out.println("dime el puesto del tenista");
//			int puesto=scan.nextInt();
//			if (puesto<=10) {
//				contador10++;
//			} 
//		}
		int i=0;
		while (i<numTenistas) {
			System.out.println("Dime el puesto del tenista " + i);
			int puesto=scan.nextInt();
			if (puesto<=10) {
				contador10++;
			}
			i++;
		}
		System.out.println("El número de tenistas TOP 10 es: " + contador10);
//		// TODO Auto-generated method stub
		scan.close();
		
	}

}
