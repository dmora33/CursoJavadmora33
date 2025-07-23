package es.cursojava.metodos;

import es.cursojava.utils.Utilidades;

public class LlamadaMetdos {

	public static void main(String[] args) {
		// desde aqui podemos llamar a los Metodos creados en la clase de Metodos
		Metodos.saludar("Dani El");

		// llamo al metod calcular edad pasandole un año y q muestre la edad

		int edad = Utilidades.calculaEdad(1980);
		System.out.println(edad);

	}

}
