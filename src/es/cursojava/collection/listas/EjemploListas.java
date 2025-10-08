package es.cursojava.collection.listas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import es.cursojava.oo.PersonaOO;

public class EjemploListas {

	public static void main(String[] args) {

// creo un obj de tipo ArrayList y añado con nombreObjeto.add(lo que quieres añadir)
		// metemos solo obj de clase persona.
		List<PersonaOO> list = new ArrayList();

//		list.add("Amarillo");
//		list.add(100.5);
		
		
		list.add(new PersonaOO());
		for (int i = 0; i < 10000; i++) {
			//añadimos boolean para saber si hace bien el cambio
			boolean aniadido = list.add(new PersonaOO()); // añadimos 10000 objPersona a la lista
			System.out.println(aniadido); // verdaderp o falso is añade
		}
// si fuera de tipo object,,, generico,, tendriamos que 
//		for (Object object : list) {
//			if (object instanceof Persona) {
//				Persona p = (Persona) object;
//				p.getNombre();
//			}
//		}
		

		System.out.println(list.size()); // no devuelve el numero de objetos
// arraylist generico para meter lo que sea.
		
		List list3 = new ArrayList();
		list3.add("Amarillo");
		list3.add(100.5);
		list3.add(new PersonaOO());
		
		List<PersonaOO> lista2 = new LinkedList<PersonaOO>();

		lista2.add(new PersonaOO("Diela1", "Crespo ora", 0, "90098k"));
		lista2.add(new PersonaOO("Daela2", "Cespo Mora", 0, "90098jk"));
		lista2.add(new PersonaOO("Danla3", "Crespo Mora", 0, "9098jk"));
		lista2.add(new PersonaOO("Danie4l", "Cre¡po Mora", 0, "0098jk"));
		lista2.add(new PersonaOO("Danila5", "CrespoMora", 0, "998jk"));
		lista2.add(new PersonaOO("niela6", "Crspo Mora", 0, "90098j"));

		// remover en ArrayList 
		// si es un obj no lo borra y nos lo da por si queremos salvarlo en otra list
		//si es una posición nos devuelve boolean.
		lista2.remove(1); // borra posicion 1
		
		// lista2.remove(p1); borraria el obj p1 de la lista
		
		// borrar en LinkedList

				String nombreBorrar = "daela2";

				for (PersonaOO persona : lista2) {
					if (persona.getNombre().equals(nombreBorrar)) {
						lista2.remove(persona);
						break;
					}
				}
				
				// borrar toda la lista


				lista2.clear();

				// mostrar primer elemento

				lista2.getFirst().toString();
				// último elemento

				lista2.getLast().toString();

				// mostrar si esta vaci

				lista2.isEmpty(); // boolean
				
				// falta metodo constrains
				

	}

}
