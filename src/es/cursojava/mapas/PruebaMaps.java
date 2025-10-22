package es.cursojava.mapas;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import es.cursojava.oo.PersonaOO;
import es.cursojava.utils.Utilidades;

public class PruebaMaps {

	public static void main(String[] args) {
		// CADA ELEMENTO QUE ESTA EN EL MAPA TIENE UNA ETIQUETA PARA RECURAR SIN
		// RECORRER TODo!!
		Map<String, PersonaOO> personas = new HashMap(); // LA ETIQUETA ES STRING!!!!

		PersonaOO p = new PersonaOO("N1", "A1", 18, "111A");
		personas.put(p.getDni(), p);
		PersonaOO p2 = new PersonaOO("N2", "A2", 38, "111A");
		PersonaOO p3 = personas.put(p2.getDni(), p2);
		System.out.println(p3.getNombre());

		PersonaOO p4 = new PersonaOO("N2", "A2", 38, "222B");
		personas.put(p4.getDni(), p2);

		// Recupero los datos de una persona
		String dni = Utilidades.pideDatoCadena("Introduce un dni");
		PersonaOO persona = personas.get(dni);
		System.out.println(persona.getNombre());

		System.out.println("========== Todas las claves ==============");
		// Obtengo todas las claves
		Set<String> dnis = personas.keySet();
		for (String dniPersona : dnis) {
			System.out.println(dniPersona);
		}

		System.out.println("========== Todos los valores a partir de las claves ==============");
		// Obtengo todos los valores a partir de las claves
		for (String dniPersona : dnis) {
			PersonaOO personaValor = personas.get(dni);
			System.out.println(personaValor.getNombre());
		}

		System.out.println("========== Todos los valores de manera directa ==============");
		// Obtengo todos los valores sin usar la clave
		Collection<PersonaOO> colPersonas = personas.values();
		for (PersonaOO persona2 : colPersonas) {
			System.out.println(persona2.getNombre());
		}

// devue un set de objetos entry
		Set<Entry<String, PersonaOO>> entries = personas.entrySet();
		for (Entry<String, PersonaOO> entry : entries) {
			System.out.println(entry.getKey() + " " + entry.getValue().getNombre());
		}

		personas.remove("222B");

	}

}
