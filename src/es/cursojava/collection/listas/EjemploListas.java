package es.cursojava.collection.listas;

import java.util.ArrayList;
import java.util.List;

import es.cursojava.oo.Persona;

public class EjemploListas {

	public static void main(String[] args) {

// creo un obj de tipo ArrayList y añado con nombreObjeto.add(lo que quieres añadir)		
		List<Persona> list = new ArrayList();

//		list.add("Amarillo");
//		list.add(100.5);
		list.add(new Persona());
		for (int i = 0; i < 10000; i++) {
			list.add(new Persona()); // añadimos 10000 objPersona a la lista
		}

		for (Object object : list) {
			if (object instanceof Persona) {
				Persona p = (Persona) object;
				p.getNombre();
			}
		}

		System.out.println(list.size()); // no devuelve el numero de objetos

		List list2 = new ArrayList();
		list2.add("Amarillo");
		list2.add(100.5);
		list2.add(new Persona());
	}

}
