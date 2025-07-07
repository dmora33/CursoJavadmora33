package es.cursojava.inicio2.condicionales.ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		System.out.println("ELIGE UNA OPCIÓN:");
		System.out.println("**********************************");
		System.out.println("1. Pintar Cuadro");
		System.out.println("2. Validar email");
		System.out.println("3. Añadir alumno");
		System.out.println("4. SALIR");

		Scanner scan = new Scanner(System.in);
		int opcion = scan.nextInt();

		if (opcion == 1) {
			System.out.println("Has escogido: Pintar Cuadro");
		}
		else if (opcion == 2) {
			System.out.println("Has escogido: Validar email");
		}
		else if (opcion == 3) {
			System.out.println("Has escogido: Añadir alumno");

		}
		else if (opcion == 4) {
			System.out.println("Has escogido: SALIR");

		}
		//else if (opcion != 1 && opcion != 2 && opcion != 3 && opcion != 4) {
		else {
			System.out.println("TE HAS EQUIVOCADO");
		}
		scan.close();
		// TODO Auto-generated method stub

	}

}
