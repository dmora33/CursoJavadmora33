package es.cursojava.metodos.ejercicios;

import java.util.Scanner;

import es.cursojava.utils.Utilidades;

public class MenuDeLosCoj2 {

	

	public static void main(String[] args) {
		String colegio[][] = new String[2][3];

		int opcion = 0;

		// entrada y salda del menu
		colegio[0][1] = "Daniel";
		colegio[1][2] = "Juan";

		// TODO Auto-generated method stub

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

			case 3: {
				System.out.println("3. Añadir Alumno");
				boolean hayHueco = false;
				for (int i = 0; i < colegio.length; i++) {
					for (int j = 0; j < colegio[i].length; j++) {
						if (colegio[i][j] == null) {
							scan = new Scanner(System.in);
							System.out.println(" | Aula: " + i + " | puesto" + j);
							System.out.println("Añadir nombre del Alumno:");
							String nombre = scan.nextLine();
							// si pulsamos enter sin introducir datos y quitamos los espacios en blanco
							// salto a otro espacio
							if (nombre.trim().isEmpty()) {
								System.out.println("Campo vacio pasamos al siguente vacio");
							} else {
								colegio[i][j] = nombre;
								hayHueco = true;
								System.out.println("Has añadido a" + nombre + " | Aula: " + i + " | puesto" + j);

							}
						}

					}
				}
				if (!hayHueco) {
					System.out.println("no hay huecos libre");
				}
			}
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
