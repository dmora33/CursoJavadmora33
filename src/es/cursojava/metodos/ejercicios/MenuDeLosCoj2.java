package es.cursojava.metodos.ejercicios;

import java.util.Scanner;

import es.cursojava.utilsDani.Utilidades;

public class MenuDeLosCoj2 {

	

	public static void main(String[] args) {
		String colegio[][] = new String[2][3];

		int opcion = 0;

		// entrada y salda del menu
		colegio[0][1] = "Daniel";
		colegio[1][2] = "Juan";

		// 

		String[] opcionesMenu = { "\nMenu", "1. Pintar Cuadro", "2. Validar email", "3. Añadir Alumno", "4. Salir" };
		Scanner scan = new Scanner(System.in);

		do {
			Utilidades.pintaMenu(opcionesMenu);
			// si quiero usar un String solo hay q convertirlo en un array es:
			// Utilidades.pintaMenu(opcionesMenu.split("\n")); ESTO SI opcionesMenu fuese un String

			opcion = scan.nextInt();

			switch (opcion) {
			case 1:

				Utilidades.pintaCuadrado();

				break;

			case 2:

				Utilidades.validarMail(Utilidades.pideDatoCadena("\nIntroduce el mail\n"));

				break;

			case 3: 
				Utilidades.anadirAlumn(colegio);
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
