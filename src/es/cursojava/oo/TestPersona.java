package es.cursojava.oo;

public class TestPersona {

	public static void main(String[] args) {
		// creamos el objeto y persona1 apunta a ese objto

		Persona persona1 = new Persona();// instanciar:
										// lo inicializa todo por defecto

		// doy valores a los atributos
		persona1.nombre = "Raúl";
		persona1.apellidos = "Pérez";
		persona1.edad = 26;
		persona1.dni = "111A";
	}

}
