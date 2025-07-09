package es.cursojava.inicio2.string;

import java.util.Scanner;

public class StringEjercicio3CuentaVocales {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("que texto quieres que cuente la vocales?"); // hola lo pasa aloh

		int contadorVocales = 0;
		String cadena = scan.nextLine();

		cadena = cadena.toLowerCase();
		for (int z = 0; z < cadena.length() - 1; z++) {
			if (cadena.charAt(z) == 'a' || cadena.charAt(z) == 'e' || cadena.charAt(z) == 'i' || cadena.charAt(z) == 'o'
					|| cadena.charAt(z) == 'u') {
				contadorVocales++;
			}
		}
		scan.close();
		System.out.println("el número de vocales es: " + contadorVocales);

	}

}
