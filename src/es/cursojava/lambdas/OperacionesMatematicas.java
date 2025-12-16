package es.cursojava.lambdas;

public class OperacionesMatematicas {

	public static void main(String[] args) {
		// Usando una clase que implementa la interfaz operacion
		Operacion suma = new Suma();
		System.out.println("Suma: " + suma.operar(5, 3));
		//puees llamar directamente al metodo operar de la interfaz!!!!!
		Operacion suma3 = (a, b) -> a + b; //Implementación de la interfaz usando una expresión lambda

		// Usando una expresión lambda para la resta
	Operacion resta = (a, b) -> a - b;
	ejecutarOperacion(6, 2,resta);

//		System.out.println("Resta: " + resta.operar(5, 3));

		// Usando una expresión lambda para la multiplicación
//		Operacion multiplicacion = (a, b) -> a * b;
//		System.out.println("Multiplicación: " + multiplicacion.operar(5, 3));

		// Usando una expresión lambda para la división
//		Operacion division = (a, b) -> a / b;
//		System.out.println("División: " + division.operar(6, 3));
		ejecutarOperacion(6, 2,suma);
	
	}
public static int ejecutarOperacion(int a, int b, Operacion operacion) {
		return operacion.operar(a, b);
	}
}
