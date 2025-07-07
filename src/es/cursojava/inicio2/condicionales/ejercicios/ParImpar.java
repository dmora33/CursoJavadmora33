package es.cursojava.inicio2.condicionales.ejercicios;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("dime un número: ");
		int numero = scan.nextInt();
		if (numero % 2 == 0) {
			System.out.println("El " + numero + " es par");
		} else {
			System.out.println("El " + numero + " es impar");
		}

		// TODO Auto-generated method stub

	}

}
