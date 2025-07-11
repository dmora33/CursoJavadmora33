package es.cursojava.inicio2.string;

import java.util.Scanner;

/**
 * Ejercicio 5 - Validar un email ============================== Preguntar al
 * usuario por un email Le diremos si es valido o no y si no lo es le diremos el
 * motivo
 * 
 * Validaciones: Que no tenga espacios en blanco Que tenga @, solo 1 Que después
 * de la @ tenga al menos un punto Que entre la @ y el punto a su derecha haya
 * una separación de dos caracateres Que despues del último punto haya entre 2 y
 * 6 caracteres
 */
public class ValidarMail2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mensajeDeError = "";

		// entrada
		do {
			// reinicializo el mensaje de error vacio para que pueda salir en caso de no dar
			// errores.
			mensajeDeError = "";

			Scanner scan = new Scanner(System.in);
			System.out.println("introduce tu mail:");
			String email = scan.nextLine();
			int longitudEmail = email.length();

			System.out.println(email);
			// Que no tenga espacios en blanco
			if (email.contains(" ")) {
				mensajeDeError += "- No puede haber espacios en blanco.\n";
				System.out.println(mensajeDeError);
			}
			// else {
			// System.out.println("no tiene espacios");
			// }
			// Que despues del último punto haya entre 2 y 6 caracteres
			int posicionPunto = 0;
			String subEmail = "";
			int longitudSubEmail = 0;
			if (!email.contains(".")) {
				mensajeDeError += "- no hay ningun punto .\n";
				System.out.println(mensajeDeError);
				// si no hay punto no continuo dara errores de posición
				continue;

			}
			posicionPunto = email.lastIndexOf(".");
			subEmail = email.substring(posicionPunto);
			longitudSubEmail = subEmail.length();
			// si no esta entre esos valores error
			if (longitudSubEmail > 6 && longitudSubEmail < 2) {
				mensajeDeError += "- despues del último punto no cumple entre 2 y 6 carácteres.\n";
				System.out.println(mensajeDeError);

			} else {
				// System.out.println("esta entre los valores 2 y 6");
			}
			// que el resultado de la busqueda de la posición de @ tanto por el principio y
			// por el final sea el mismo y que la posición de la @ sea menor que la del
			// punto.

			if (email.indexOf("@") != email.lastIndexOf("@")) {
				mensajeDeError += "- solo puede haber una @ .\n";
				System.out.println(mensajeDeError);

			} else {
				// System.out.println("solo puede tener una @");
			}
			if (!email.contains("@")) {
				mensajeDeError += "- no hay ninguna @ .\n";
				System.out.println(mensajeDeError);

			}
			// else {System.out.println("solo tiene una @2");}
			// que la posicion de @ sea menor que la posicion del punto
			int posicionArroba = email.lastIndexOf("@");
			if (posicionArroba > posicionPunto) {
				mensajeDeError += "- posicion de la arroba mal .\n";
				System.out.println(mensajeDeError);

			}
			// else {System.out.println("tiene la @ bien");}

			if (posicionPunto < posicionArroba + 2) {
				mensajeDeError += "- no hay dos caracteres entre la arroba y el punto .\n";
				System.out.println(mensajeDeError);

			}
			// else {System.out.println("caracteres mas de dos");}

			// salimos mientras no haya mensajes de error
		} while (!mensajeDeError.isEmpty());

		System.out.println("email correcto");

	}

}
