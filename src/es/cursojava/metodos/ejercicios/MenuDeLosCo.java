package es.cursojava.metodos.ejercicios;

import java.util.Scanner;

public class MenuDeLosCo {
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
		String[] opcionesMenu = { "Menu", "1. Pintar Cuadro", "2. Validar email", "3. Añadir Alumno", "4. Salir" };

		PintaMenuYTexto.pintaMenu(opcionesMenu);
		System.out.println("Escoge una opción");

		Scanner scan = new Scanner(System.in);
		int opcion = scan.nextInt();
		// swicht
		 while (opcion != 4) {

		switch (opcion) {
		case 1:
			System.out.println("1. Pintar Cuadro");
			System.out.println("Dime el tamño de los cuadro: ");
			int tamanoCuadro = scan.nextInt();
			cuadrado(tamanoCuadro);
			break;

		case 2:

			System.out.println("2. Validar email");
			System.out.println("escribe tu mail");
			String mail = scan.nextLine();
			validarMail(mail);
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

		}

		// TODO Auto-generated method stub

	}

}
