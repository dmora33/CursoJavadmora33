package es.cursojava.interfaces.ejercicios.ejercicio1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
	private static final Logger log = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) {
		Mueble silla = new Silla("rojo", "tres");
		Mueble mesa = new Mesa("maron", "rectanfular");
		Verdura judiaVerde = new JudiasVerdes("España", "Blanda");
		Verdura lechuga = new Lechuga("España", "Sin vaina");

		silla.limpiar();
		mesa.desinfectar();
		mesa.limpiar();
		judiaVerde.desinfectar();
		lechuga.desinfectar();
	}
}
