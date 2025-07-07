package es.cursojava.inicio2.bucles;

import java.util.Scanner;

public class BucleDoWhile {
	public static void main(String[] args) {
		// primero ejecuta codigo y lo último evalua la condiciòn
		String respuesta = ""; // DECLARAMOS LA VARIABLE FUERA DEL BUCLE
		int contador = 0;
		do {
			System.out.println("Ejec como minimo 1 vez");
			System.out.println("Quieres continuar?");
			Scanner scan = new Scanner(System.in);
			respuesta = scan.nextLine();

			// a la tercera vez que se ejecuta sale;
			if (contador == 2) {
				break;
			}

			// el contador abajo para que sume despues de evaluar.
			contador++;
			scan.close();
		} while (respuesta.equals("si"));// condicion

		System.out.println("Termina");

	}

}
