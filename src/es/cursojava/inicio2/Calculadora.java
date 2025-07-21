package es.cursojava.inicio2;

// el programa funciona mejor si grabas la primera posición y haces los calculos desde la segunda posición del String. 
//hay q mirarlo!!!!! no funcionaaaa
public class Calculadora {
//me cago en to que solo funciona la suma...  todo para arreglar, hacer con el metodo de arriba empzamos de la posición 2 y inicializamos al variable suma con la posición 1.
	public static void main(String[] parametros) {
		int resultadoMultip = 1;
		int resultado = 0;
		if (parametros.length < 3) {
			System.err.println(
					"no se han intoducido correctamente los parametros, introduce suma, resta, múltiplicay como mínimo dos números.");
		} else {
			int[] numeros = new int[parametros.length ];
			for (int i = 1; i < parametros.length; i++) {
				numeros[i] = Integer.parseInt(parametros[i]);
				if (parametros[0].equalsIgnoreCase("suma")) {
					// suma todo en numeros[0]
					resultado += numeros[i];

					System.out.println("la operacion es suma " + numeros[i] + " =" + resultado);

				} else if (parametros[0].equalsIgnoreCase("resta")) {
					// resta todo en numeros[0]

					resultado -= numeros[i];
					System.out.println("la operacion es resta " + numeros[i] + " =" + resultado);
				} else if (parametros[0].equalsIgnoreCase("multiplica")) {
					// multiplica con resultadoMultip inicializado a 1
					resultadoMultip *= numeros[i];
					System.out.println("la operacion es multiplicar" + numeros[i] + " =" + resultadoMultip);
				}

			}

		}
	}

}
