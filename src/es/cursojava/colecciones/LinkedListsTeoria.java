package es.cursojava.colecciones;

import java.util.LinkedList;
import java.util.List;

import es.cursojava.oo.PersonaOO;

public class LinkedListsTeoria {
	public static void main(String[] args) {

		List<PersonaOO> lista2 = new LinkedList<PersonaOO>();

		lista2.add(new PersonaOO("Diela1", "Crespo ora", 0, "90098k"));
		lista2.add(new PersonaOO("Daela2", "Cespo Mora", 0, "90098jk"));
		lista2.add(new PersonaOO("Danla3", "Crespo Mora", 0, "9098jk"));
		lista2.add(new PersonaOO("Danie4l", "Cre¡po Mora", 0, "0098jk"));
		lista2.add(new PersonaOO("Danila5", "CrespoMora", 0, "998jk"));
		lista2.add(new PersonaOO("niela6", "Crspo Mora", 0, "90098j"));
// agreagar al principio

		lista2.add(0, new PersonaOO("Diela7", "Crespo ora", 0, "90098k"));
		lista2.add(3, new PersonaOO("Diela8", "Crespo ora", 0, "90098k"));

		System.out.println("-------FOREACH------");

		for (PersonaOO persona : lista2) {
			System.out.println("prueba" + persona.getNombre());
		}
	}
}
