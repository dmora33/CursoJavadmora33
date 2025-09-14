package es.cursojava.metodos.ejercicios;

import java.util.Scanner;

public class TablaMultiplicar {

	public static void main(String[] args) {
		//
		System.out.println("dime dos números");
		Scanner scan = new Scanner(System.in);
		int numeroUno = scan.nextInt();
		System.out.println("dime el segu do numero");
		int numeroDos = scan.nextInt();

		pintaTablasMultiplicar(numeroUno, numeroDos);

	}

	private static void pintaTablaMultiplicar(int numero) {
		System.out.println("Tabla del " + numero);
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " x " + numero + " = " + (i * numero));
		}
	}

	private static void pintaTablasMultiplicar(int numero1, int numero2) {

		for (int i = numero1; i <= numero2; i++) {
			pintaTablaMultiplicar(i);
		}

	}
}
