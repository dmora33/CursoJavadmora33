package es.cursojava.inicio2.string;

/**
 * Funciones e inicializar un String
 */
public class FuncionesString {

	public static void main(String[] args) {

		String nombre = "marta";
		String nombre2 = "eva";
		String nombre3 = null; // inicializamos sin objeto... ya se declarará más tarde...
		nombre3 = nombre2;
		nombre2 = nombre;
		nombre2.toUpperCase();
		String nombre4 = nombre3.toUpperCase();
		// System.out.println(nombre3.toUpperCase());// para grabar el objeto en mays
		// hay que referenciarlo....
		System.out.println(nombre4);
		System.out.println(nombre); // null pointed exception!!!!!! java.lang.NullPointerException
		System.out.println("======================================================");
		System.out.println(nombre.charAt(0)); // devuelve el caracter en la posición 0
		System.out.println(nombre.charAt(nombre.length() - 1)); // length da el tamAñO no las posiciones!!!! CUIDADO!!!!
																// HAY QUE RESTAR 1
		System.out.println(nombre.contains("te")); // devuelve boolean!!!!!
		System.out.println("Tenerife".toLowerCase().contains("te")); // toLowerCase.. todo en minusculas y lo compara
																		// con te para devolver boolean

		System.out.println(nombre2.endsWith("va")); // termina con... va... BOOLEAN!!!!!
		System.out.println(nombre4.startsWith("ev")); /// si empieza con ev.... BOoLeAn!!!!!
		String cadena = "Esto es una rppueba de Strings";
		System.out.println(cadena.indexOf("e")); // devuelve la POSICIÓN de la primera e
		System.out.println(cadena.lastIndexOf("e")); // devuelve la POSICIÓN buscando... empezando por la derecha, lo
														// empieza las
														// posiciones siempre son las mismas.

		System.out.println(cadena.replace("a", "A")); // remplaza a por A

		System.out.println("======================================================");

		cadena = "  e r t  ";
		System.out.println(cadena.isBlank());// de vuelve boolean si tiene SOLO espacios Y TABULADORES en blanco
		System.out.println(cadena.isEmpty());// devuelve boolean si esta VACIO!!

		System.out.println("'" + cadena + "'");
		System.out.println("'" + cadena.strip() + "'"); // quita los espacios en blanco del princio y del final con los
														// caracteres.
		System.out.println("'" + cadena.replace(" ", "") + "'");// remplaza los espacios en blanco por un espacio simple
																// QUE NO ES UN ESPACIO EN BLANCO...

		cadena = "Hola Mundo Locooo desde Getafe";
		System.out.println(cadena.substring(5)); // genera una cadena nueva empezando desde la posición 5 hasta el
													// final.
		System.out.println(cadena.substring(5, 12));// genera una cadena nueva empezando desde la posición 5 hasta
													// posición 10.

		// como hacer que saque solo la última palabar de la cadena??
		System.out.println(cadena.substring(cadena.lastIndexOf(" ") + 1)); // IMPORTANTE
	}

}
