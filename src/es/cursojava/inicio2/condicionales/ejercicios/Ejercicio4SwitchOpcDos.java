package es.cursojava.inicio2.condicionales.ejercicios;

import java.util.Scanner;

public class Ejercicio4SwitchOpcDos {

	public static void main(String[] args) {

		// pinto menu
		System.out.println("********************");

		System.out.println("di el mes y yo te digo la estación");

		Scanner scan = new Scanner(System.in);

		String mes = scan.next();
		// swicht

		switch (mes) {
		case "enero", "febrero", "diciembre" -> System.out.println("invierno");

		case "marzo", "abril", "mayo" -> System.out.println("primavera");

		case "junio", "julio", "agosto" -> System.out.println("invierno");

		case "septiembre", "octubre", "noviembre" -> System.out.println("invierno");

		default -> System.out.println("Opcion incorrecta");

		}
		scan.close();

		// 

	}

	// 

}
