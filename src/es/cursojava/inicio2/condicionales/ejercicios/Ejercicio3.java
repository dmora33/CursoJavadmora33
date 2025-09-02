package es.cursojava.inicio2.condicionales.ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		int numero1 = 0;
		int numero2 = 0;

		int valor = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("Dime un número:");
		numero1 = scan.nextInt();
		System.out.println(numero1);

		scan = new Scanner(System.in);

		System.out.println("Dime otro número:");
		numero2 = scan.nextInt();
		System.out.println(numero2);

		scan = new Scanner(System.in);

		System.out.println("dime que quieres hacer:");
		System.out.println("suma o +");
		System.out.println("resta o -");
		System.out.println(",*,");
		System.out.println(",/,");

		String accion = scan.nextLine();

		if (accion.equalsIgnoreCase("suma") || accion.equals("+")) {
			valor = numero1 + numero2;
			System.out.println("el resultado de: " + accion + " es: " + valor);

		}
		else if (accion.equalsIgnoreCase("resta") || accion.equals("-")) {
			valor = numero1 - numero2;
			System.out.println("el resultado de: " + accion + " es: " + valor);

		}
		else if (accion.equals("*")) {
			valor = numero1 * numero2;
			System.out.println("el resultado de: " + accion + " es: " + valor);
		} 
		else if (accion.equals("/")){
			valor = numero1 / numero2;
			System.out.println("el resultado de: " + accion + " es: " + valor);
		} else {System.out.println("TE HAS EQUIVOCADO");}

		// 

	}

}
