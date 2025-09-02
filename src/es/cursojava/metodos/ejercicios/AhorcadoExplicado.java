package es.cursojava.metodos.ejercicios;

import es.cursojava.utils.Utilidades;

/**
 * Clase que implementa la lógica para el juego del Ahorcado.
 * <p>
 * Este juego genera una frase aleatoria y le pide al usuario que adivine
 * las letras. El usuario tiene un número limitado de intentos.
 * </p>
 * @author [Tu Nombre]
 * @version 1.0
 */
public class AhorcadoExplicado {

	private static String[] sujetos = { "El gato", "La niña", "Mi amigo", "Un hombre", "La policía", "El perro",
			"La profesora", "Un payaso", "El médico", "La madre", "El robot", "Mi vecino" };

	private static String[] verbos = { "come", "pinta", "busca", "rompe", "salta", "canta", "lava", "lee", "mueve",
			"atrapa", "conduce", "enciende" };

	private static String[] complementos = { "una manzana", "la casa", "el coche", "una canción", "el jardín",
			"la calle", "el balón", "un sombrero", "la ventana", "la lámpara", "el periódico", "el fuego" };

	/**
	 * Genera una frase aleatoria combinando un sujeto, un verbo y un complemento.
	 *
	 * @return Una cadena de texto que representa una frase aleatoria.
	 */
	public static String generateRandomPhrase() {
		return sujetos[(int) (Math.random() * 12)] + " " + verbos[(int) (Math.random() * 12)] + " "
				+ complementos[(int) (Math.random() * 12)] + " ";
	}
	

	/**
	 * Inicia y gestiona la partida del juego del Ahorcado.
	 * <p>
	 * El método pide al usuario su nombre, genera una frase aleatoria,
	 * y permite al usuario adivinar letras hasta que gane, pierda
	 * o se quede sin intentos.
	 * </p>
	 */
	public static void hangMan() {
		// generar frase
		String phrase = generateRandomPhrase();
		System.out.println("la frase es: " + phrase);
		String letters = "";
		String character = "";
		// pedir nombre usuario
		String userName = Utilidades.pideDatoCadena("Ingresa tu nombre");
		// inicializar vidas
		int attemps = 7;
		System.out.println(userName + " vamos a jugar ahorcado, buena suerte!");
		// un ciclo mientras tenga vida o encuentre la frase
		while (attemps > 0) {
			System.out.println("Tienes " + attemps + " vidas");
			printPhraseHangMan(phrase, letters);
			character = Utilidades.pideDatoCadena("Ingresa una letra:");
			letters = letters.concat(character);
			if (!phrase.contains(character)) {
				attemps--;
			}
			//comentario
			if (wasPhraseFound(phrase, letters)) {
				System.out.println("Felicidades " + userName + " has ganado");
				break;
			}
			showLetters(letters);
		}
		if(attemps == 0) {
			System.out.println("Que pena "+userName+", has perdido!");
		}

	}
	
	/**
	 * Muestra por consola las letras que el usuario ha introducido.
	 *
	 * @param letters Una cadena de texto que contiene todas las letras ingresadas por el usuario.
	 */
	public static void showLetters(String letters) {
		System.out.print("\nLas letras que has introducido son: ");
		for (int i = 0; i < letters.length(); i++) {
			System.out.print(letters.charAt(i)+" ");
		}
		System.out.println();
	}

	/**
	 * Comprueba si el usuario ha adivinado todas las letras de la frase.
	 *
	 * @param phrase La frase que el usuario debe adivinar.
	 * @param letters Una cadena de texto con las letras que el usuario ha introducido.
	 * @return {@code true} si la frase ha sido completamente adivinada; {@code false} en caso contrario.
	 */
	public static boolean wasPhraseFound(String phrase, String letters) {
		for (int i = 0; i < phrase.length(); i++) {
			if (phrase.charAt(i) != ' ' && !letters.contains(String.valueOf(phrase.charAt(i)))) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Imprime la frase oculta, mostrando solo las letras que el usuario ha adivinado.
	 * Las letras no adivinadas se reemplazan con un guion bajo.
	 *
	 * @param phrase La frase completa que se debe adivinar.
	 * @param letters Las letras que el usuario ha adivinado hasta el momento.
	 */
public static void printPhraseHangMan(String phrase, String letters) {
		for (int i = 0; i < phrase.length(); i++) {
			if (letters.contains(String.valueOf(phrase.charAt(i)))) {
				System.out.print(phrase.charAt(i));
			} else if (phrase.charAt(i) == ' ') {
				System.out.print(" ");
			} else {
				System.out.print("_");
			}
		}
		System.out.println();
	}
}