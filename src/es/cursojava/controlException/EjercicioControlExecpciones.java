package es.cursojava.controlException;

import java.sql.Array;

import es.cursojava.utils.Utilidades;

public class EjercicioControlExecpciones {

	public static void main(String[] args) {
		boolean correcto = false;
		do {
			try {
				int tamañoArray = Utilidades.pideDatoNumerico("dime el tamaño del array");
				int[] array = new int[tamañoArray];
				for (int i = 0; i < array.length; i++) {
					int datoPosicion = Utilidades.pideDatoNumerico("dime dime el dato de la ");
					array[i] = datoPosicion;
				}
				// String frase = Utilidades.pideDatoCadena("dime una frase");
				correcto = true;

				int posicionMostrar = Utilidades.pideDatoNumerico(
						"dime la posición que deseas mostrar" + "posicon hasta la posicion " + array.length);
				System.out.println(array[posicionMostrar]);
			} catch (java.util.InputMismatchException e) {
				correcto = false;
				System.out.println("maldito pon numeros " + "\n" + e.getClass().descriptorString());
			} catch (java.lang.ArrayIndexOutOfBoundsException a) {
				correcto = false;
				System.out.println("te saliste de madre array" + "\n" + a.getClass().descriptorString());
			}
		} while (!correcto);
		
		try {
			String[] cajadesastre = frasesEnLaCaja();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}
	
	public static String[] frasesEnLaCaja () {
		int posiciones=Utilidades.pideDatoNumerico("cuantas frases vas a grabar?pon el numero.");
		String[] cajaDesastre = new String[posiciones];
		for (int i = 0; i < cajaDesastre.length; i++) {
			String frase= Utilidades.pideDatoCadena("dime una frase");
			cajaDesastre[i] = frase;
		}
		
		return cajaDesastre;
	}
// error letras java.util.InputMismatchException
	// fuera del array java.lang.ArrayIndexOutOfBoundsException
}
