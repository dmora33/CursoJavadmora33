package es.cursojava.utils;

import java.util.Scanner;

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

	public static void pintaMenu(String[] opciones, String texto) {
		for (String opcion : opciones) {
			System.out.print(opcion + "\n");
	}

		// pitnaMenu (); no valdria por que saldría todo el rato ESCOGE UNA OPCIÓN!!!!!!!

		System.out.print(texto + "\n");
	}

	public static int pideDatoNumerico(String texto) {
		Scanner scan = new Scanner(System.in);
		System.out.println(texto);
		int numero = scan.nextInt();
		// scan.close();
		return numero;
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
}
