package es.cursojava.inicio2.bucles.ejercicios;

import java.util.Scanner;

/**
 * pedir 10 números Indicar cuantos son multipos de 3 y cuantos son multipos de
 * 5
 */
public class Ejercicio3 {

	public static void main(String[] args) {

		int contador3 = 0;
		int contador5 = 0;
		Scanner scan = new Scanner(System.in);
		/**
		 * int i=0
		 * while (i<10) {
		 * System.out.println("di un número");
			int num = scan.nextInt();
			if (num%3==0) {
				contador3++;
			}
			if (num%5==0) {
				contador5++;
			}i++;
		 * }
		 */
		for (int i=0;i<10;i++) {
			System.out.println("di un número");
			int num = scan.nextInt();
			if (num%3==0) {
				contador3++;
			}
			if (num%5==0) {
				contador5++;
			}
		}
		System.out.println("multiplos de 3: " + contador3);
		System.out.println("multiplos de 5: " + contador5);
		scan.close();
	}

		// 

	}


