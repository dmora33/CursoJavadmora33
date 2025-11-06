package es.cursojava.excepciones.ejercicios.ejercicio1;

import es.cursojava.oo.Alumno;

public class NotaInvalidaExecption extends Exception {

	public NotaInvalidaExecption(String mensaje) {
		super(mensaje);

	}
}
