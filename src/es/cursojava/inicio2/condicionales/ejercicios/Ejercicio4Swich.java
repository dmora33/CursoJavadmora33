package es.cursojava.inicio2.condicionales.ejercicios;

import java.util.Scanner;

public class Ejercicio4Swich {

	public static void main(String[] args) {

		// pinto menu
		System.out.println("********************");
		System.out.println("Menu");
		System.out.println("1. Pintar Cuador");
		System.out.println("2. Validar email");
		System.out.println("3. Añadir Alumno");
		System.out.println("4. Salir");

		Scanner scan = new Scanner(System.in);
		System.out.println("Escoge una opción");
		int opcion = scan.nextInt();
		// swicht

		switch (opcion) {
		case 1:
			System.out.println("1. Pintar Cuador");
			break;

		case 2:
			System.out.println("2. Validar email");
			break;

		case 3:
			System.out.println("3. Añadir Alumno");
			break;

		case 4:
			System.out.println("4. Salir");
			break;
		default:
			System.out.println("Opcion incorrecta");

		}
		scan.close();

		// TODO Auto-generated method stub

	}

}
