package es.cursojava.metodos.ejercicios;

import java.util.Scanner;

public class PintaMenuYTexto {

	public static void main(String[] args) {
		String[] opciones = { "opción 1", "opción 2", "opción 3", };
		String texto = "esto es un String de cadena de texto fijo";
		//String texto2 = "esto es un String de cadena de texto fijo";

		pintaMenu(opciones);
		pintaMenu(opciones, texto);
		System.out.println("pideDatoNumérico");
		System.out.println(pideDatoNumerico(texto));
		System.out.println("pideDatoCadena");
		//String cadena = pideDatoCadena(texto2);
		System.out.println(pideDatoCadena(texto));
		//System.out.println(cadena);
	}

	public static void pintaMenu(String[] opciones) {
		for (String opcion : opciones) {
			System.out.print(opcion + "\n");
		}
		System.out.println("Escoge una opción:");
	}

	public static void pintaMenu(String[] opciones, String texto) {
		for (String opcion : opciones) {
			System.out.print(opcion + "\n");
		}
		System.out.print(texto + "\n");
	}

	public static int pideDatoNumerico(String texto) {
		Scanner scan = new Scanner(System.in);
		System.out.println("di el numero");
		int numero = scan.nextInt();
		//scan.close();
		System.out.println(texto);
		return numero;
	}

	public static String pideDatoCadena(String texto) {
		System.out.println(texto);
		System.out.println("dame un dato");
		Scanner scan2 = new Scanner(System.in);
		String dato = scan2.nextLine();
		//scan2.close();

		return dato;
	}

}
