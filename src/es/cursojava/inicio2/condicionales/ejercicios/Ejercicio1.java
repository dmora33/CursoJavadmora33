package es.cursojava.inicio2.condicionales.ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		System.out.println("di un número");
		Scanner scan = new Scanner(System.in);
		int numero = scan.nextInt();
		if (numero%2==0) {
			System.out.println("el número " + numero + " es par.");
		}else {
			System.out.println("el número " + numero + " es impar.");
		}
		scan.close();
		
		// 

	}

}
