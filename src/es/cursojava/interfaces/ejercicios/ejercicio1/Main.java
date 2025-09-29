package es.cursojava.interfaces.ejercicios.ejercicio1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
	private static final Logger log = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) {
		Silla silla = new Silla("rojo", "tres");
		Mesa mesa = new Mesa("maron", "rectanfular");
		JudiasVerdes judiaVerde = new JudiasVerdes(null);
		Lechuga lechuga = new Lechuga(null);

		mesa.desinfectar();
		mesa.limpiar();
	}
}
