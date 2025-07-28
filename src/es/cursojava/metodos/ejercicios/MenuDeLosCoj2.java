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

	public static void validarMail(String email) {

		String mensajeError = "";

		email = email.trim();

		if (email.isEmpty()) {
			mensajeError = "El email no puede estar en blanco";
		} else {
			if (email.contains(" ")) {
				mensajeError = "El email no puede tener espacios en blanco\n";
			}

			if (!email.contains("@")) {
				mensajeError += "El email no tiene arroba\n";
			} else if (email.indexOf("@") != email.lastIndexOf("@")) {
				mensajeError += "El email no puede tener más de 1 arroba\n";
			} else {
				String dominio = email.substring(email.indexOf("@") + 1);
				System.out.println("dominio: " + dominio);

				if (!dominio.contains(".")) {
					mensajeError += "El dominio del email debe contener al menos un punto \n";
				} else {// Si contiene punto
					int posicionPunto = dominio.indexOf(".");
					if (posicionPunto < 2) {
						mensajeError += "La separación entre la @ y el primer punto debe ser superior a 2 caracteres \n";
					}

					int posicionUltimoPunto = dominio.lastIndexOf(".");
					int longitudDominio = dominio.length() - 1;
					if (longitudDominio - posicionUltimoPunto < 2 || longitudDominio - posicionUltimoPunto > 6) {
						mensajeError += "Después del último punto solo puede haber entre 2 y 6 caracteres \n";
					}
				}

			}

		}

		if (mensajeError.isEmpty()) {
			System.out.println("El email " + email + " es valido");
		} else {
			System.out.println(mensajeError);
		}

	}

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
			PintaMenuYTexto.pintaMenu(opcionesMenu);

			opcion = scan.nextInt();

			switch (opcion) {
			case 1:
				System.out.println("1. Pintar Cuadro" + "\ndime cuanto mide el cuadrado:");
				int tamano = scan.nextInt();
				cuadrado(tamano);

				break;

			case 2:

				System.out.println("2. Validar email \nIntroduce el mail");
				scan = new Scanner(System.in);
				String mail = scan.nextLine();
				validarMail(mail);

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
