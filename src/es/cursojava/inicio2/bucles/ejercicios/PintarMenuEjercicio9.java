package es.cursojava.inicio2.bucles.ejercicios;

import java.util.Scanner;

public class PintarMenuEjercicio9 {
	public static void main(String[] args) {

		// pinto menu
		System.out.println("********************");
		System.out.println("Menu");
		System.out.println("1. Pintar Cuadro");
		System.out.println("2. Validar email");
		System.out.println("3. Añadir Alumno");
		System.out.println("4. Salir");

		Scanner scan = new Scanner(System.in);
		System.out.println("Escoge una opción");
		int opcion = scan.nextInt();
		// swicht

		switch (opcion) {
		case 1:
			System.out.println("1. Pintar Cuadro");
			System.out.println("Dime el tamño de los cuadro: ");
			int tamanoCuadro = scan.nextInt();
			for (int i = 0; i <= tamanoCuadro - 1; i++) {
				System.out.print("*" + " ");
			}
			for (int i = 0; i <= tamanoCuadro - 3; i++) {
				System.out.println();
				System.out.print("*");
				for (int z = 0; z < tamanoCuadro * 2 - 3; z++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}

			System.out.println();
			for (int i = 0; i <= tamanoCuadro - 1; i++) {
				System.out.print("*" + " ");
			}
			
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
