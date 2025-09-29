package es.cursojava.interfaces.ejercicios.ejercicio1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
	private static final Logger log = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) {
		Mueble silla = new Silla("rojo", "tres");
		Mueble mesa = new Mesa("maron", "rectanfular");
		Verdura judiaVerde = new JudiasVerdes(null);
		Verdura lechuga = new Lechuga(null);
		
	

	}
}
