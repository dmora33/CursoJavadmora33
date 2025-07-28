package es.cursojava.metodos.ejercicios;

import java.util.Random;
import java.util.Scanner;

public class AhorcadoMetodo {

	static String[] sujetos = { "El gato", "La niña", "Mi amigo", "Un hombre", "La policía", "El perro", "La profesora",
			"Un payaso", "El médico", "La madre", "El robot", "Mi vecino" };

	static String[] verbos = { "come", "pinta", "busca", "rompe", "salta", "canta", "lava", "lee", "mueve", "atrapa",
			"conduce", "enciende" };

	static String[] complementos = { "una manzana", "la casa", "el coche", "una canción", "el jardín", "la calle",
			"el balón", "un sombrero", "la ventana", "la lámpara", "el periódico", "el fuego" };

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();

		// Construir frase aleatoria
		String frase = sujetos[rand.nextInt(sujetos.length)] + " " + verbos[rand.nextInt(verbos.length)] + " "
				+ complementos[rand.nextInt(complementos.length)];

		// Crear versión oculta
		StringBuilder oculta = new StringBuilder();
		for (char c : frase.toCharArray()) {
			if (Character.isLetter(c)) {
				oculta.append("_");
			} else {
				oculta.append(c);
			}
		}

		// Bienvenida y juego
		System.out.print("Introduce tu nombre: ");
		String nombre = scan.nextLine();
		System.out.println("¡Bienvenido " + nombre + "! Adivina la frase:");
		int intentosFallidos = 0;
		final int MAX_FALLOS = 6;
		boolean haGanado = false;

		while (intentosFallidos < MAX_FALLOS && !haGanado) {
			System.out.println("Frase: " + mostrarEspaciado(oculta.toString()));
			System.out.print("Introduce una letra: ");
			String entrada = scan.nextLine().toLowerCase();

			if (entrada.length() != 1 || !Character.isLetter(entrada.charAt(0))) {
				System.out.println("Introduce solo una letra válida.");
				continue;
			}

			char letra = entrada.charAt(0);
			boolean acierto = false;

			for (int i = 0; i < frase.length(); i++) {
				if (Character.toLowerCase(frase.charAt(i)) == letra) {
					oculta.setCharAt(i, frase.charAt(i));
					acierto = true;
				}
			}

			if (acierto) {
				System.out.println("¡Bien! Letra encontrada.");
			} else {
				intentosFallidos++;
				System.out.println("Letra no encontrada. Intentos restantes: " + (MAX_FALLOS - intentosFallidos));
			}

			haGanado = !oculta.toString().contains("_");
		}

		if (haGanado) {
			System.out.println("\n🎉 ¡Felicidades " + nombre + "! Has adivinado la frase:");
			System.out.println(frase);
		} else {
			System.out.println("\n💀 Has fallado demasiadas veces. La frase era:");
			System.out.println(frase);
		}

		scan.close();
	}

	// Para mostrar la frase con espacios entre letras ocultas
	public static String mostrarEspaciado(String frase) {
		return frase.replaceAll("", " ").trim();
	}
}
