package es.cursojava.metodos.ejercicios;

import es.cursojava.utilsDani.Utilidades;

public class PintaMenuYTexto {

	public static void main(String[] args) {
		String[] opciones = { "opción 1", "opción 2", "opción 3", };
		String texto = "esto es un String de cadena de texto fijo";
		// String texto2 = "esto es un String de cadena de texto fijo";

		Utilidades.pintaMenu(opciones);
		// si no tengo creado un menu opciones, si utilizo args.... ejec automatic y me
		// pregunta por el menu.. que le metemos desde eclipse no desde consola!!!!
		// Utilidades.pintaMenu(args);
		System.out.println("");
		Utilidades.pintaMenu(opciones, "elige una opción");
		System.out.println("");
		int numero = Utilidades.pideDatoNumerico("dime un número");
		System.out.println("");
		// String cadena = pideDatoCadena(texto2);
		String cadena = Utilidades.pideDatoCadena("escribe algo");
		// System.out.println(cadena);
		
	}

}
