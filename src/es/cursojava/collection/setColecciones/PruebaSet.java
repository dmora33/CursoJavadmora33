package es.cursojava.collection.setColecciones;

import java.util.HashSet;
import java.util.Set;

import es.cursojava.oo.PersonaOO;

public class PruebaSet {
	public static void main(String[] args) {
		Set<PersonaOO> conjunto = new HashSet();

		PersonaOO p = new PersonaOO();

		for (int i = 0; i < 10; i++) {
			boolean aniadido = conjunto.add(new PersonaOO("a", i));
		}
	}

}
