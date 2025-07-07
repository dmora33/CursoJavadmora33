package es.cursojava.inicio2.bucles.ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("dime un número");
		int num = scan.nextInt();

		for (int i = 1; i <= num; i++) {
			System.out.println("Tabla del: " + i);
			for (int z = 1; z <= 10; z++) {
				System.out.println(i + "*" + z + "=" + (i * z));
			}
			System.out.println("*****************************"); // para separar las tablas.
		}
		scan.close();
	}
}
