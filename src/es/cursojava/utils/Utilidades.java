package es.cursojava.utils;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

//pasar un año y clacular la edad 
public class Utilidades {
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

	public static void pintaCuadrado() {
		int tamano = Utilidades.pideDatoNumerico("dime un numero para el cuadrado");
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

	public static void pintaMenu(String[] opciones) {
//		for (String opcion : opciones) {
//			System.out.print(opcion + "\n");
//		}
		pintaMenu(opciones, "intruduce una opción");
		// System.out.println("Escoge una opción:");

	}

	public static void anadirAlumn(String[][] colegio) {
		// String nombre = Utilidades.pideDatoCadena("\nNombre del alumno:\n");
		boolean hayHueco = false;
		for (int i = 0; i < colegio.length; i++) {
			for (int j = 0; j < colegio[i].length; j++) {
				if (colegio[i][j] == null) {
					System.out.println(" | Aula: " + i + " | puesto" + j);
					String nombre = Utilidades.pideDatoCadena("\nNombre del alumno:\n");
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

	public static void pintaMenu(String[] opciones, String texto) {
		for (String opcion : opciones) {
			System.out.print(opcion + "\n");
		}

		// pitnaMenu (); no valdria por que saldría todo el rato ESCOGE UNA
		// OPCIÓN!!!!!!!

		System.out.print(texto + "\n");
	}

	public static int pideDatoNumerico(String texto) {
		int numero = 0;
		System.out.println(texto);
		Scanner scan = new Scanner(System.in);

		try {
			return scan.nextInt();
		} catch (InputMismatchException | NumberFormatException e) {
			System.out.println("No has introducido un valor correcto");
			return pideDatoNumerico(texto);
		}

	}

	public static String pideDatoCadena(String texto) {
		System.out.println(texto);
		Scanner scan2 = new Scanner(System.in);
		String dato = scan2.nextLine();
		// scan2.close();

		return dato;
	}

	/**
	 * @param anioNacimiento int
	 * @return edad desde el año 2025 int
	 */
	public static int calculaEdad(int anioNacimiento) {

		int edad = 0;
		edad = 2025 - anioNacimiento;

		return edad;
	}

	public static String NombreApellidoAleatorio() {
		String[] nombres = { "Juan", "Ana", "Carlos", "Lucía", "Pedro", "María" };
		String[] apellidos = { "García", "López", "Pérez", "Fernández", "Rodríguez", "Sánchez" };

		String nombre = nombres[ThreadLocalRandom.current().nextInt(nombres.length)];
		String apellido = apellidos[ThreadLocalRandom.current().nextInt(apellidos.length)];

		System.out.println("Nombre aleatorio: " + nombre + " " + apellido);
		return nombre + " " + apellido;
	}

	public static String NombreAleatorio() {
		String[] nombres = { "Juan", "Ana", "Carlos", "Lucía", "Pedro", "María" };
		String nombre = nombres[ThreadLocalRandom.current().nextInt(nombres.length)];
		System.out.println("Nombre aleatorio: " + nombre);
		return nombre;
	}

	public static int numeroAleatorio(int rangoValoresInc, int rangoValoresFinal) {
		Random randomNumero = new Random();
		return randomNumero.nextInt(rangoValoresInc, rangoValoresFinal);
	}

}
