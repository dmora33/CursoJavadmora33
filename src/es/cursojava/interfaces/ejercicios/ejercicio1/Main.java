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
		silla.limpiar();
		// judiaVerde.desinfectar(); no puede tener
		judiaVerde.limpiar();
		lechuga.desinfectar();

		desinfectar(mesa); // con el metodo puedo llamar a los obj

		// y con un array de interfaz

		Limpieable[] limpos = { silla, mesa, lechuga };

		limpiar(limpos); // limpiamos un array de interfaz Limpiable
		limpiar(mesa); // limpiamos un obj con el interfaz Limpiable
	}

	// metodo para que desinfecte objetos; ahora solo los q se pueden desinfectar.
	private static void desinfectar(Desinfectable d) {
		// d.limpiar();
		d.desinfectar();
	}

	private static void limpiar(Limpieable[] limpos) {
		for (Limpieable limpieable : limpos) {
			limpiar(limpieable);
		}
	}

// hacemos sobrecarga del metodo
	private static void limpiar(Limpieable limpio) {
		limpio.limpiar();
	}
}
