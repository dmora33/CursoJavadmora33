package es.cursojava.utilsDani;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.time.Year;

//pasar un año y clacular la edad 
//mejora todos los métodos

public class Utilidades {

	// Reutilizamos un único Scanner para evitar cerrarlo accidentalmente y cerrar System.in.
	private static final Scanner SCANNER = new Scanner(System.in);

	/**
	 * Valida de forma básica la sintaxis de un email e imprime los errores encontrados.
	 * No realiza comprobaciones de existencia de dominio ni envío de correo.
	 * Mantiene la firma original (void) y muestra mensajes por consola.
	 *
	 * Reglas comprobadas:
	 * - No vacío
	 * - No espacios
	 * - Contiene exactamente una '@'
	 * - Dominio contiene al menos un punto
	 * - Distancia entre '@' y primer punto >= 2
	 * - Sufijo tras último punto entre 2 y 6 caracteres
	 *
	 * @param email la dirección a validar (se trimpea internamente)
	 */
	public static void validarMail(String email) {

		if (email == null) {
			System.out.println("El email no puede ser nulo");
			return;
		}

		String mensajeError = "";

		email = email.trim();

		if (email.isEmpty()) {
			mensajeError = "El email no puede estar en blanco";
		} else {
			if (email.contains(" ")) {
				mensajeError = "El email no puede tener espacios en blanco\n";
			}

			int atCount = email.length() - email.replace("@", "").length();
			if (atCount == 0) {
				mensajeError += "El email no tiene arroba\n";
			} else if (atCount > 1) {
				mensajeError += "El email no puede tener más de 1 arroba\n";
			} else {
				String dominio = email.substring(email.indexOf("@") + 1);
				// System.out.println("dominio: " + dominio);

				if (!dominio.contains(".")) {
					mensajeError += "El dominio del email debe contener al menos un punto \n";
				} else {// Si contiene punto
					int posicionPunto = dominio.indexOf(".");
					if (posicionPunto < 2) {
						mensajeError += "La separación entre la @ y el primer punto debe ser superior a 2 caracteres \n";
					}

					int posicionUltimoPunto = dominio.lastIndexOf(".");
					int longitudDominio = dominio.length() - 1;
					int sufijoLen = longitudDominio - posicionUltimoPunto;
					if (sufijoLen < 2 || sufijoLen > 6) {
						mensajeError += "Después del último punto solo puede haber entre 2 y 6 caracteres \n";
					}
				}

			}

		}

		if (mensajeError.isEmpty()) {
			System.out.println("El email '" + email + "' es válido");
		} else {
			System.out.println(mensajeError);
		}

	}

	/**
	 * Dibuja por consola un cuadrado hueco de asteriscos de tamaño 'tamano'.
	 * Si el tamaño es menor que 1 no dibuja nada.
	 *
	 * @param tamano el lado del cuadrado (número entero >= 1)
	 */
	public static void pintaCuadrado() {
		int tamano = pideDatoNumerico("Introduce un número entero positivo para el tamaño del cuadrado:");
		pintaCuadrado(tamano);
	}

	/**
	 * Versión que acepta tamaño directamente.
	 *
	 * @param tamano lado del cuadrado
	 */
	public static void pintaCuadrado(int tamano) {
		if (tamano <= 0) {
			System.out.println("Tamaño inválido. Debe ser mayor que 0.");
			return;
		}

		if (tamano == 1) {
			System.out.println("*");
			return;
		}

		// Fila superior
		for (int i = 0; i < tamano; i++) {
			System.out.print("*");
		}
		System.out.println();

		// Filas intermedias (huecas)
		for (int fila = 0; fila < tamano - 2; fila++) {
			System.out.print("*");
			for (int esp = 0; esp < tamano - 2; esp++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}

		// Fila inferior
		for (int i = 0; i < tamano; i++) {
			System.out.print("*");
		}
		System.out.println();
	}

	/**
	 * Imprime un menú en pantalla usando las opciones proporcionadas y lee una opción.
	 * Si no se proporciona texto, usa un texto por defecto.
	 *
	 * @param opciones array de opciones a mostrar (no nulo)
	 */
	public static void pintaMenu(String[] opciones) {
		pintaMenu(opciones, "Introduce una opción:");
	}

	/**
	 * Imprime un menú y muestra el texto de invitación.
	 *
	 * @param opciones lista de opciones a mostrar (si es null imprime nada)
	 * @param texto    texto de invitación al usuario
	 */
	public static void pintaMenu(String[] opciones, String texto) {
		if (opciones == null) {
			System.out.println("No hay opciones para mostrar.");
			return;
		}
		for (int i = 0; i < opciones.length; i++) {
			System.out.printf("%d) %s\n", i + 1, opciones[i]);
		}
		System.out.print((texto == null || texto.isBlank()) ? "Elige una opción:\n" : texto + "\n");
	}

	/**
	 * Añade un alumno a la primera posición libre en una estructura bidimensional (aulas x puestos).
	 * Muestra las posiciones libres y solicita nombre por consola. Si se introduce una cadena vacía
	 * o sólo espacios, se salta esa posición.
	 *
	 * @param colegio arreglo bidimensional donde null indica puesto libre
	 */
	public static void anadirAlumn(String[][] colegio) {
		if (colegio == null) {
			System.out.println("La estructura del colegio no puede ser nula.");
			return;
		}

		boolean hayHueco = false;
		for (int i = 0; i < colegio.length; i++) {
			if (colegio[i] == null) continue;
			for (int j = 0; j < colegio[i].length; j++) {
				if (colegio[i][j] == null) {
					System.out.println("Aula: " + i + " | puesto: " + j);
					String nombre = pideDatoCadena("Nombre del alumno (enter para saltar):");
					if (nombre == null || nombre.trim().isEmpty()) {
						System.out.println("Campo vacío. Saltando a la siguiente posición libre.");
					} else {
						colegio[i][j] = nombre.trim();
						hayHueco = true;
						System.out.println("Has añadido a " + colegio[i][j] + " | Aula: " + i + " | puesto: " + j);
						return; // añadimos sólo un alumno por llamada
					}
				}
			}
		}
		if (!hayHueco) {
			System.out.println("No hay huecos libres");
		}
	}

	/**
	 * Pide al usuario por consola un número entero. Reintenta hasta que se reciba un entero válido.
	 * Evita recursividad para no provocar StackOverflow en caso de entradas repetidamente incorrectas.
	 *
	 * @param texto mensaje a mostrar al usuario
	 * @return entero introducido por el usuario
	 */
	public static int pideDatoNumerico(String texto) {
		int numero;
		while (true) {
			System.out.println(texto);
			try {
				String linea = SCANNER.nextLine();
				if (linea == null) {
					System.out.println("Entrada nula. Inténtalo de nuevo.");
					continue;
				}
				linea = linea.trim();
				if (linea.isEmpty()) {
					System.out.println("No has introducido ningún valor. Inténtalo de nuevo.");
					continue;
				}
				numero = Integer.parseInt(linea);
				return numero;
			} catch (NumberFormatException e) {
				System.out.println("No has introducido un número entero válido. Inténtalo de nuevo.");
			}
		}
	}

	/**
	 * Lee una línea completa del teclado y la devuelve (sin cerrar System.in).
	 *
	 * @param texto mensaje/prompt a mostrar
	 * @return la cadena leída (puede ser vacía, nunca nula)
	 */
	public static String pideDatoCadena(String texto) {
		System.out.println(texto);
		String dato = SCANNER.nextLine();
		return dato == null ? "" : dato;
	}

	/**
	 * Calcula la edad aproximada a partir del año de nacimiento usando el año actual del sistema.
	 * Si el año de nacimiento es mayor que el año actual se devuelve 0.
	 *
	 * @param anioNacimiento año de nacimiento (positivo)
	 * @return edad estimada (>= 0)
	 */
	public static int calculaEdad(int anioNacimiento) {
		int anioActual = Year.now().getValue();
		if (anioNacimiento <= 0) {
			System.out.println("Año de nacimiento no válido: " + anioNacimiento);
			return 0;
		}
		int edad = anioActual - anioNacimiento;
		return Math.max(0, edad);
	}

	/**
	 * Genera un nombre y apellido aleatorio y lo imprime por consola.
	 *
	 * @return cadena formada por "Nombre Apellido"
	 */
	@Deprecated
	public static String NombreApellidoAleatorio() {
		return nombreApellidoAleatorio();
	}

	/**
	 * Genera un nombre aleatorio simple.
	 *
	 * @return nombre aleatorio
	 */
	@Deprecated
	public static String NombreAleatorio() {
		return nombreAleatorio();
	}

	/**
	 * Nueva versión en camelCase: genera un nombre y apellido aleatorio.
	 *
	 * @return cadena formada por "Nombre Apellido"
	 */
	public static String nombreApellidoAleatorio() {
		String[] nombres = { "Juan", "Ana", "Carlos", "Lucía", "Pedro", "María" };
		String[] apellidos = { "García", "López", "Pérez", "Fernández", "Rodríguez", "Sánchez" };

		String nombre = nombres[ThreadLocalRandom.current().nextInt(nombres.length)];
		String apellido = apellidos[ThreadLocalRandom.current().nextInt(apellidos.length)];

		String resultado = nombre + " " + apellido;
		System.out.println("Nombre aleatorio: " + resultado);
		return resultado;
	}

	/**
	 * Nueva versión en camelCase: genera un nombre aleatorio simple.
	 *
	 * @return nombre aleatorio
	 */
	public static String nombreAleatorio() {
		String[] nombres = { "Juan", "Ana", "Carlos", "Lucía", "Pedro", "María", "Amparo", "Geese",
				"Juanjo", "Pepito", "Carlitos" };
		String nombre = nombres[ThreadLocalRandom.current().nextInt(nombres.length)];
		System.out.println("Nombre aleatorio: " + nombre);
		return nombre;
	}

	/**
	 * Devuelve un entero aleatorio en el rango [0, rangoValores) y valida el parámetro.
	 *
	 * @param rangoValores límite superior (exclusivo). Debe ser mayor que 0.
	 * @return entero aleatorio en [0, rangoValores)
	 * @throws IllegalArgumentException si rangoValores <= 0
	 */
	public static int numeroAleatorio(int rangoValores) {
		if (rangoValores <= 0) {
			throw new IllegalArgumentException("rangoValores debe ser mayor que 0");
		}
		return ThreadLocalRandom.current().nextInt(rangoValores);
	}

	/**
	 * Devuelve un entero aleatorio en el rango [rangoValoresInc, rangoValoresFinal).
	 * Si rangoValoresInc >= rangoValoresFinal lanza IllegalArgumentException.
	 *
	 * @param rangoValoresInc   límite inferior (incluyente)
	 * @param rangoValoresFinal límite superior (excluyente)
	 * @return entero aleatorio dentro del rango
	 */
	public static int numeroAleatorio(int rangoValoresInc, int rangoValoresFinal) {
		if (rangoValoresInc >= rangoValoresFinal) {
			throw new IllegalArgumentException("El límite inferior debe ser menor que el superior");
		}
		return ThreadLocalRandom.current().nextInt(rangoValoresInc, rangoValoresFinal);
	}

}