package es.cursojava.oo;

public class TestPersona {

	public static void main(String[] args) {
		// creamos el objeto y persona1 apunta a ese objto

		Persona persona1 = new Persona();// instanciar:
											// lo inicializa todo por defecto
		// new genera el espacio en memoria y el constructor, Persona lo inicializa todo
		// por defect.

		// doy valores a los atributos
		persona1.nombre = "Raúl";
		persona1.apellidos = "Pérez";
		persona1.edad = 26;
		persona1.dni = "111A";
		System.out.println(persona1.nombre);
		System.out.println(persona1.dni);

		// persona 2
		Persona persona2 = new Persona();
		persona2.nombre = "Rala";
		persona2.apellidos = "Paz";
		persona2.edad = 2;
		persona2.dni = "222B";
		System.out.println(persona2.nombre);
		System.out.println(persona2.dni);

			// Pregunta de examen que imprime persona1.nombre??
		persona1.nombre = "marta";

		Persona persona3 = persona1;

		persona3.nombre = "loli";
		// por que persona3 a modificado el obj que las dos variables apuntan al
		// mismo.... y se queda el último valor.
		System.out.println(persona1.nombre); // loli
	}

}
