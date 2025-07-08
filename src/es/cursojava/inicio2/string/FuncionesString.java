package es.cursojava.inicio2.string;
/**
 * Funciones e inicializar un String
 */
public class FuncionesString {

	public static void main(String[] args) {

		String nombre = "marta";
		String nombre2 = "eva";
		String nombre3 = null; //inicializamos sin objeto... ya se declarará más tarde...
		
		System.out.println(nombre3.toUpperCase()); // null pointed exception!!!!!! java.lang.NullPointerException

	}

}
