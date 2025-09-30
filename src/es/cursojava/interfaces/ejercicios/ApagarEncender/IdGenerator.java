package es.cursojava.interfaces.ejercicios.ApagarEncender;
// creamos un generador de id unico!!!!!!
public class IdGenerator {

	private static long currentId = 0;

	public static synchronized long getNextId() {
		return ++currentId;
	}
}
