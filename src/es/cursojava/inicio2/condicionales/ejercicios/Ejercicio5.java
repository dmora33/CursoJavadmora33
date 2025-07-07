package es.cursojava.inicio2.condicionales.ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		double costeSinIva = 0.0;
		String turno = "";
		double horaLlamada = 0.0;
		double costeLlamada = 1;
		// dia de la semana falta hacer DOMINGO + 3% coste llamda
		double impuestoDomingo = 0.03;
		// EL RESTO DE LA SEMANA:
		// turno maÃ±ana 15% falta variable de 06:00 a 12:00
		double impuestoManana = 0.15;
		// turno tarde 10% falta variable de 12:00 a 23:00
		double impuestoTarde = 0.10;
		// turno noche -10% falta variable de 23:00 a 05:59;
		double impuestoNoche = -0.10; // CUIDADO QUE ES RESTAR!!!!!!

		Scanner scan = new Scanner(System.in);

		System.out.println("Tiempo de llamada en minutos");
		int minutosLlamada = scan.nextInt();
		System.out.println(minutosLlamada);

		scan = new Scanner(System.in);

		System.out.println("Dia de la semana, lunes, martes.... domingo");
		String dia = scan.nextLine();// di es domingo impuestoDomingo
		System.out.println(dia);

		scan = new Scanner(System.in);

		System.out.println("dime la hora de la llamada con el formato: HH,MM");
		horaLlamada = scan.nextDouble();
		System.out.println(horaLlamada);

		scan = new Scanner(System.in);

		if (minutosLlamada < 5) {
			// minutos del 0 al 5
			costeSinIva = 1.0;
			costeLlamada = costeSinIva * impuestoDomingo;
		} else if (minutosLlamada < 9) {
			costeSinIva = 1 + (minutosLlamada - 5) * 0.80;
		} else if (minutosLlamada < 11) {
			costeSinIva = 1 + 3 * 0.80 + (minutosLlamada - 8) * 0.70;
		} else {
			costeSinIva = 1 + 3 * 0.80 + 2 * 0.70 + (minutosLlamada - 10) * 0.50;
		}
		if (dia.equalsIgnoreCase("domingo")) {
			costeLlamada = costeSinIva + (costeSinIva * 0.3);
			if (horaLlamada >= 6 && horaLlamada < 12) {
				turno = "domingo mañana";
			} else if (horaLlamada >= 12 && horaLlamada < 23) {
				turno = "domingo tarde";
			} else {
				turno = "domingo noche";
			}
		} else if (horaLlamada >= 6 && horaLlamada < 12) {
			costeLlamada = costeSinIva + costeSinIva * impuestoManana;
			turno = "mañana";
		} else if (horaLlamada >= 12 && horaLlamada < 23) {
			costeLlamada = costeSinIva + costeSinIva * impuestoTarde;
			turno = "tarde";
		} else {
			costeLlamada = costeSinIva - costeSinIva * impuestoNoche;
			turno = "noche";
		}

		// TODO Auto-generated method stub
		System.out.println("turno: " + turno);
		System.out.println("minutos llamada: " + minutosLlamada);
		System.out.println("coste llamada sin impuestos: " + costeSinIva);

	}

}
