package es.cursojava.inicio2.string;

import java.util.Scanner;

/**
 * Escribe un programa que reciba un String y devuelva el texto invertido.
 */
public class StringEjercicio1TextoInvertido {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("que texto quieres invertir?"); // hola lo pasa aloh
		System.out.println("escrbelo:");

		String cadena = scan.next();

		int tamanoCadena = cadena.length() - 1;
		for (int i = tamanoCadena - 1; i >= 0; i--) {
			System.out.print(cadena.charAt(i));
		}
		scan.close();
	}

}
