package es.cursojava.metodos.ejercicios;

import java.util.Scanner;


public class MenuDeLosCoj2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] opcionesMenu = { "Menu", "1. Pintar Cuadro", "2. Validar email", "3. Añadir Alumno", "4. Salir" };

		PintaMenuYTexto.pintaMenu(opcionesMenu);
		System.out.println("Escoge una opción");

		Scanner scan = new Scanner(System.in);
		int opcion = scan.nextInt();
		
		do {
			switch (opcion) {
			case 1:
						System.out.println("1. Pintar Cuadro");

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
			
		} while (opcion!=4);
		
		
	}
}
