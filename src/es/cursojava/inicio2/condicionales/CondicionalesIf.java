package es.cursojava.inicio2.condicionales;

public class CondicionalesIf {
	public static void main(String[] args) {
		int numero = (int) (Math.random() * 10); // todo entre parentesis para que cambie a int el resultado de
													// (Math.random * 100)
		System.out.println(numero);

		if (numero >= 5) {
			System.out.println("el número es mayor de 5, " + numero);

		}
		if (numero >= 5 && numero > 7) {
			System.out.println("el número es mayor que cinco y menor que 7, ");

		} else if (numero >= 2 || numero > 4) {
			System.out.println("el número es ....2,3,4, ");

		} else {
			System.out.println("el número es menos de 5, " + numero);
		}

	}

}
