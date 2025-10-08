package es.cursojava.collection.setColecciones;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import es.cursojava.oo.PersonaOO;

/**
 * Clase de prueba que demuestra el uso de la colección Set (HashSet) con
 * objetos de tipo PersonaOO.
 * 
 * Un Set es una colección que no permite elementos duplicados. En este ejemplo,
 * se crean varias instancias de PersonaOO y se añaden al conjunto. Luego, se
 * recorren e imprimen los datos de cada persona.
 * 
 * Para que el Set funcione correctamente y evite duplicados, la clase PersonaOO
 * debería sobrescribir los métodos equals() y hashCode().
 * 
 * Autor: [Tu Nombre] Fecha: [Fecha Actual]
 */
public class PruebaSet {

	/**
	 * Método principal: crea un conjunto de personas, las añade y las recorre.
	 * 
	 * @param args argumentos de línea de comandos (no se usan en este ejemplo)
	 */
	public static void main(String[] args) {
		// Se crea un conjunto (Set) de tipo PersonaOO.
		// HashSet no garantiza ningún orden específico de los elementos.
		Set<PersonaOO> conjunto = new HashSet<>();

		// Se crea una instancia de PersonaOO (aunque no se utiliza más adelante).
		PersonaOO p = new PersonaOO();

		// Bucle que añade 10 personas distintas al conjunto.
		// Cada persona tiene nombre "a" y edad desde 0 hasta 9.
		for (int i = 0; i < 10; i++) {
			// El método add() devuelve true si el elemento se ha añadido con éxito,
			// o false si ya existía un elemento igual (según equals() y hashCode()).
			boolean aniadido = conjunto.add(new PersonaOO("a", i));
		}

		// Se obtiene un iterador para recorrer el conjunto de personas.
		Iterator<PersonaOO> ite = conjunto.iterator();

		// Mientras haya más elementos en el conjunto...
		while (ite.hasNext()) {
			// Se obtiene la siguiente persona del conjunto
			PersonaOO persona = ite.next();

			// Se imprime el nombre y la edad concatenados
			System.out.println(persona.getNombre() + persona.getEdad());
		}
	}
}
//Explicación rápida

//Set: interfaz que representa una colección sin elementos duplicados.

//HashSet: implementación concreta basada en una tabla hash.

//Iterator: permite recorrer los elementos del conjunto sin necesidad de índices.

//equals() y hashCode() (en PersonaOO): deben estar bien definidos para que HashSet pueda evitar duplicados correctamente.

//El bucle for añade 10 objetos distintos porque la edad cambia en cada iteración.

//La impresión final muestra cada objeto agregado al conjunto.