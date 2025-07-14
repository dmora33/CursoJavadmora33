package es.cursojava.inicio2.arrys;

import java.util.Arrays;

/**
 * Que hacemos con un arrays Almacenamos datos del mismo tipo con un número
 * fijo.
 * 
 */
public class TeoriaArrays {

	public static void main(String[] args) {
		// Como crear

		/**
		 * crear un array clase String, String [] los corchetes son los arrays una, dos
		 * dimensiones [][], tres [][][]....tec el número dentro los corchetes nos da el
		 * tamaño fijo [5] del tamño es 5. new Strting llamamos el constructor y le
		 * indicamos el tamaño.
		 */
		String[] colores = new String[4];

		// Como rellenar -- introducir datos

		// escogemos la posición 0
		colores[0] = "Azul";
		colores[1] = "Verde";

		// última posicion de un array , length -1 "-1 por que estamos hablando de
		// posiciones" sin () por que no es el metodo, es una propiedad
		colores[colores.length] = "naranja";
		System.out.println(colores[3] + "color4");

		// ahroa,,, y si quiero meter los datos todo seguido?? el tamaño del array lo
		// asigna automatico.

		int[] numeros = { 7, 4, 2, 4, 5, 29 };

		// tengo 15 alumnos pero no se las notas todabía.... se inicializa todo en 0
		double[] notas = new double[15];

		// Leer datos del array

		System.out.println(numeros[4]);

		// los tipo primitivos no declarados, se inicializan SIEMPRE EN 0
		System.out.println(notas[9]); // saldría 0

		// para imprimir los datos de un array sin recorerlo hay que usar toString,
		// sacara.. una cadena de texto con el contenido del array.
		System.out.println(Arrays.toString(numeros)); // saca todos los datos del array numeros.

		// bucle for each for ( "pirmero el tipo de dato" double "ahora la variable
		// donde los quiero meter" nota : y ahora el nombre array notas){}

		for (int numero : numeros) {
			System.out.println(numero);

		}

	}

}
