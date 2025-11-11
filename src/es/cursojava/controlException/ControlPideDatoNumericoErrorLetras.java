package es.cursojava.controlException;

import es.cursojava.utilsDani.Utilidades;

public class ControlPideDatoNumericoErrorLetras {
	public static void main(String[] args) {

		GetafeException npe = new GetafeException("Daniela es la más buena de las bebes");

		boolean correcto = false;
		do {
			try {
				Utilidades.pideDatoNumerico("dime un numero");
				correcto = true;
			} catch (java.util.InputMismatchException e) {
				System.out.println("te he dicho un numero");
				correcto = false;

			} finally {
				System.out.println("Siempre");
			}
		} while (!correcto);

		
		throw npe;
	}
}
