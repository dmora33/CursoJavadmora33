package es.cursojava.colecciones;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import ch.qos.logback.core.read.ListAppender;
import es.cursojava.oo.Persona;

public class ArrazListTeoria {

	public static void main(String[] args) {

		// declarar sin inicializar:

		List<Persona> lista = new ArrayList<Persona>();

		lista.add(new Persona("Diela", "Crespo ora", 0, "90098k"));
		lista.add(new Persona("Daela", "Cespo Mora", 0, "90098jk"));
		lista.add(new Persona("Danla", "Crespo Mora", 0, "9098jk"));
		lista.add(new Persona("Daniel", "Cre¡po Mora", 0, "0098jk"));
		lista.add(new Persona("Danila", "CrespoMora", 0, "998jk"));
		lista.add(new Persona("niela", "Crspo Mora", 0, "90098j"));

		System.out.println("-------FOREACH------");

		for (Persona persona : lista) {
			System.out.println("prueba" + persona.getNombre());
		}

		List<Persona> lista2 = new LinkedList<Persona>();

		lista2.add(new Persona("Diela1", "Crespo ora", 0, "90098k"));
		lista2.add(new Persona("Daela2", "Cespo Mora", 0, "90098jk"));
		lista2.add(new Persona("Danla3", "Crespo Mora", 0, "9098jk"));
		lista2.add(new Persona("Danie4l", "Cre¡po Mora", 0, "0098jk"));
		lista2.add(new Persona("Danila5", "CrespoMora", 0, "998jk"));
		lista2.add(new Persona("niela6", "Crspo Mora", 0, "90098j"));

		// remover en ArrayList
		lista.remove(1); // borra posicion 1

		// borrar en LinkedList

		String nombreBorrar = "daela2";

		for (Persona persona : lista2) {
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
