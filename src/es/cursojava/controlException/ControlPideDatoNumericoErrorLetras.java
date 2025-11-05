package es.cursojava.controlException;

import es.cursojava.utils.Utilidades;

public class ControlPideDatoNumericoErrorLetras {
	public static void main(String[] args) {

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

	}
}
