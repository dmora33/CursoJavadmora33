package es.cursojava.colecciones;

import java.util.LinkedList;
import java.util.List;

import es.cursojava.oo.Persona;

public class LinkedListsTeoria {
	public static void main(String[] args) {

		List<Persona> lista2 = new LinkedList<Persona>();

		lista2.add(new Persona("Diela1", "Crespo ora", 0, "90098k"));
		lista2.add(new Persona("Daela2", "Cespo Mora", 0, "90098jk"));
		lista2.add(new Persona("Danla3", "Crespo Mora", 0, "9098jk"));
		lista2.add(new Persona("Danie4l", "Cre¡po Mora", 0, "0098jk"));
		lista2.add(new Persona("Danila5", "CrespoMora", 0, "998jk"));
		lista2.add(new Persona("niela6", "Crspo Mora", 0, "90098j"));
// agreagar al principio

		lista2.add(0, new Persona("Diela7", "Crespo ora", 0, "90098k"));
		lista2.add(3, new Persona("Diela8", "Crespo ora", 0, "90098k"));

		System.out.println("-------FOREACH------");

		for (Persona persona : lista2) {
			System.out.println("prueba" + persona.getNombre());
		}
	}
}
