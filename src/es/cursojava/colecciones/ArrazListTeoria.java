package es.cursojava.colecciones;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import ch.qos.logback.core.read.ListAppender;
import es.cursojava.oo.PersonaOO;

public class ArrazListTeoria {

	public static void main(String[] args) {

		// declarar sin inicializar:

		List<PersonaOO> lista = new ArrayList<PersonaOO>();

		lista.add(new PersonaOO("Diela", "Crespo ora", 0, "90098k"));
		lista.add(new PersonaOO("Daela", "Cespo Mora", 0, "90098jk"));
		lista.add(new PersonaOO("Danla", "Crespo Mora", 0, "9098jk"));
		lista.add(new PersonaOO("Daniel", "Cre¡po Mora", 0, "0098jk"));
		lista.add(new PersonaOO("Danila", "CrespoMora", 0, "998jk"));
		lista.add(new PersonaOO("niela", "Crspo Mora", 0, "90098j"));

		System.out.println("-------FOREACH------");

		for (PersonaOO persona : lista) {
			System.out.println("prueba" + persona.getNombre());
		}

		List<PersonaOO> lista2 = new LinkedList<PersonaOO>();

		lista2.add(new PersonaOO("Diela1", "Crespo ora", 0, "90098k"));
		lista2.add(new PersonaOO("Daela2", "Cespo Mora", 0, "90098jk"));
		lista2.add(new PersonaOO("Danla3", "Crespo Mora", 0, "9098jk"));
		lista2.add(new PersonaOO("Danie4l", "Cre¡po Mora", 0, "0098jk"));
		lista2.add(new PersonaOO("Danila5", "CrespoMora", 0, "998jk"));
		lista2.add(new PersonaOO("niela6", "Crspo Mora", 0, "90098j"));

		// remover en ArrayList
		lista.remove(1); // borra posicion 1

		// borrar en LinkedList

		String nombreBorrar = "daela2";

		for (PersonaOO persona : lista2) {
			if (persona.getNombre().equals(nombreBorrar)) {
				lista.remove(persona);
				break;
			}
		}
		// borrar toda la lista

		lista.clear();

		lista2.clear();

		// mostrar primer elemento

		lista.getFirst().toString();
		// último elemento

		lista.getLast().toString();

		// mostrar si esta vaci

		lista.isEmpty(); // boolean

	}

}
