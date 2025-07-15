package es.cursojava.inicio2.arrys.ejercicios;

import java.util.Iterator;
import java.util.Scanner;

/**
 * crear un array 4*4 de enteros pedir datos sacar datos sacar diagonal invertir
 * diagonal modificando array original.
 */
public class ArrayEjercicio {

	public static void main(String[] args) {

		int[][] tablero = new int[4][4];

		Scanner scan = new Scanner(System.in);
//		for (int i = 0; i < tablero.length; i++) {
//			for (int j = 0; j < tablero[i].length; j++) {
//				System.out.println("di el valor de la posición (" + i + "," + j + ")");
//				tablero[i][j]=scan.nextInt();
//			} // vamos a inicializarlo autimatico
		// COPIAR DEL RESUELTO DE PROF inicializar bidimensional siempre con lo mismos
		// datos!!!!!!!!
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
//					System.out.println("di el valor de la posición (" + i + "," + j + ")");
				tablero[i][j] = (int) (Math.random() * 100);
			}

		} // System.out.println(tablero.toString());
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				System.out.println("Valor de la posición (" + i + "," + j + "): " + tablero[i][j]);

			}
		}
		// mostrar los valores de la diagonal.
//		int i = 0;
//		int j = 0;
//		int[][] copy = new int[4][4];
		// busco la diagonal y de paso copio los valores en otro arry

//		do {
//			System.out.println("valor de la posición : (" + i + "," + j + ")" + tablero[i][j]);
//			copy[i][j]=tablero[i][j];
//			i++;
//			j++;
//		} while (i < tablero.length && j < tablero[i].length);

		// ES LO MISMO QUE ARRIBA:
		for (int k = 0; k < tablero.length; k++) {
			System.out.println("la posicion es " + k + "," + k + "; " + tablero[k][k]);
		}
		for (int k = 0; k < tablero.length / 2; k++) {
			int aux = tablero[tablero.length - 1 - k][tablero.length - 1 - k]; // la maldita diagobal.. al reves
			tablero[tablero.length - 1 - k][tablero.length - 1 - k] = tablero[k][k];
			tablero[k][k] = aux;
		}
		for (int k = 0; k < tablero.length; k++) {
			System.out.println("la posicion es " + k + "," + k + "; " + tablero[k][k]);
		}
	System.out.println(tablero.toString()); // solo sirve para unidimensionales así saca solo al posición de la memoria.  
	}
}
