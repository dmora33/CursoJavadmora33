package es.cursojava.inicio2.arrys;

public class ArraysBidimensionales {

	public static void main(String[] args) {

		// el primer [] indica el n de filas y el segundo [] las columnas.
		int[][] numeros = new int[2][3];
		numeros[1][2] = 10;
		System.out.println(numeros[1][1]); // como es un primitivo se inicialia en cero!!!!

		System.out.println(numeros.length); // nos dice el numero de filas que tiene ese array!!!!

		System.out.println(numeros[0]); // accede a la fila cero
		int[] fila0 = numeros[0];
		System.out.println(fila0.length); // numero de columnas
		System.out.println(numeros[0].length);// numero de columnas igual a lo anterior

		for (int i = 0; i < numeros.length; i++) {
			// System.out.print(" fila: " + i);

			for (int j = 0; j < numeros[i].length; j++) {
				// System.out.print(" \tcolumna: " + i);
				System.out.print("posicion (" + i + "," + j + ")");
				System.out.println("\t" + numeros[i][j]);
				//System.out.print(numeros[i][j]+"\t");
			}
		}
		
		

	}

}
