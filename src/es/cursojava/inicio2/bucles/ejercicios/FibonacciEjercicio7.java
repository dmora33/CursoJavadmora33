package es.cursojava.inicio2.bucles.ejercicios;

import java.util.Scanner;

/**
 * 7. Solicitar por consola el numero de números de la serie de Fibonacci que se
 * quieren mostrar Serie de Fibonacci: 0,1,1,2,3,5,8,13,21,34,55,....
 */

public class FibonacciEjercicio7 {
	public static void main(String[] args) {
		int num = 0;
		int num1 = 1;
		int sumnumnum1 = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("Dime el número de números que quieres de la serie de Fibonacci");
		int numeroFin = scan.nextInt();
//		System.out.print(num + "," + num1);
//		for (int i=0;i<numeroFin-2;i++) {
//			// tambien podemos poner i=2 por que damos los dos primero números nada mas empezar
//			sumnumnum1=num+num1;
//			System.out.print("," + sumnumnum1);
//			num=num1;
//			num1=sumnumnum1;
//		int i = 2;
//		while (i < numeroFin) {
//			sumnumnum1 = num + num1;
//			System.out.print("," + sumnumnum1);
//			num = num1;
//			num1 = sumnumnum1;
//			i++;
//		}
		int numP=0;
		int numA=0;
		int sum=0;
		for (int i=0;i<numeroFin;i++) {
			System.out.println(numP);
			sum = numP+numA;
			numP = numA;
			numA = sum;
		}
				
		scan.close();

	}

}
