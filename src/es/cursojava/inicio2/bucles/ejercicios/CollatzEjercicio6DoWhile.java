package es.cursojava.inicio2.bucles.ejercicios;

import java.util.Scanner;

/**
 * 6. Conjetura Collatz Solicitar un numero: +Si el numero es par, se divide
 * entre dos +Si es impar se multiplicar por 3 y se le suma 1 se repite hasta
 * que el valor del numero es 1
 * 
 */
public class CollatzEjercicio6DoWhile {

	public static void main(String[] args) {

		System.out.println("Dimero un número");
		Scanner scan = new Scanner(System.in);
		int numero = scan.nextInt();

		do {

			if (numero % 2 == 0) {
				numero = numero / 2;
			} else {
				numero = numero * 3 + 1;
			}
			System.out.print(numero + ", ");
		} while (numero != 1);
		scan.close();

		// 

	}

}
