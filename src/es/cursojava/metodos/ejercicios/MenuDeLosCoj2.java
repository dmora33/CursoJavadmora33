package es.cursojava.metodos.ejercicios;

import java.util.Scanner;

public class MenuDeLosCoj2 {

	public static void cuadrado(int tamano) {
		for (int i = 0; i <= tamano - 1; i++) {
			System.out.print("*" + " ");
		}
		for (int i = 0; i <= tamano - 3; i++) {
			System.out.println();
			System.out.print("*");
			for (int z = 0; z < tamano * 2 - 3; z++) {
				System.out.print(" ");
			}
			System.out.print("*");
		}

		System.out.println();
		for (int i = 0; i <= tamano - 1; i++) {
			System.out.print("*" + " ");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] opcionesMenu = { "\nMenu", "1. Pintar Cuadro", "2. Validar email", "3. Añadir Alumno", "4. Salir" };

		int opcion;

		do {
			PintaMenuYTexto.pintaMenu(opcionesMenu);
		System.out.println("Escoge una opción");


			Scanner scan = new Scanner(System.in);
			opcion = scan.nextInt();

			switch (opcion) {
			case 1:
				System.out.println("1. Pintar Cuadro" + "\ndime cuanto mide el cuadrado:");
				int tamano = scan.nextInt();
				cuadrado(tamano);

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

		} while (opcion != 4);

	}
}
