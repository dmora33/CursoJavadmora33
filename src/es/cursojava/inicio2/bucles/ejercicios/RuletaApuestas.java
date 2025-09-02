package es.cursojava.inicio2.bucles.ejercicios;

import java.util.Scanner;

public class RuletaApuestas {

	public static void main(String[] args) {

		System.out.println("Di con cuanto dinero quieres empezar");
		Scanner scan = new Scanner(System.in);
		int dinero = scan.nextInt();
		int opcion = 0;
		int numeroApuesta = 0;
		int ingreso = 0;
		do {

			int numeroGanador = 0;
			do {
				numeroGanador = (int) (Math.random() * 100);// poner aqui el numero ramdon del 1 al 36 inclidos
				// SI MULTIPLICAMOS * 37 TENDREMOS Y NO POR 100 TENDREMOS QUE QUITAR LA
				// CONDICION, GENERAMOS EL NUMRO ENTRE 0 Y 36
			} while (numeroGanador < 37);
			System.out.println("Dime como quieres hacer:");
			System.out.println("******************************************************");

			System.out.println("1.Apostar a un numero. Tu apuesta: x36");
			System.out.println("2.Apostar a la primera docena: apuesta x3");
			System.out.println("3.Apostar a la segunda docena: apuesta x3");
			System.out.println("4.Apostar a la tercera docena: apuesta x3");
			System.out.println("5.Apostar Par apuesta x2");
			System.out.println("6.Apostar Impar apuesta x2");
			System.out.println("7.Dejar de aportar");
			System.out.println("8.Igresar saldo");
			System.out.println("9.Saber saldo");
			System.out.println("******************************************************");

			opcion = scan.nextInt();
			switch (opcion) {
			case 1 -> {
				System.out.println("A que número quieres apostar?");
				numeroApuesta = scan.nextInt();	
				if (numeroApuesta>=36 || numeroApuesta==0) {
					System.out.println("número incorrecto tiene que ser 36 o menor hata 1 !!!!!!!! LOCOOOO");
					continue;}

				// copiar del ejerc resulto!!!!!!!!
				// hay q añadir una comprovación del numero para que no sea mayor de 36
				System.out.println("tu saldo es: " + dinero);
				System.out.println("Cuanto quieres apostar");
				int apuesta = scan.nextInt();

				if (apuesta <= dinero) {
					if (numeroApuesta == numeroGanador) {
						dinero += (dinero - apuesta) + apuesta * 36; // IMPORTANTE HAY QUE RESTAR A SALDO LA APUSTA
																		// ANTES DE SUMAR!!!!!!
						System.out.println("Felicidades has ganado!!!");
						System.out.println("El numero ganador a sido:" + numeroGanador);
						System.out.println("Has ganado:" + apuesta * 36);
						System.out.println("Te queda:" + dinero);
						System.out.println("******************************************************");

					} else {
						dinero -= apuesta;
						System.out.println("Pringao que te creias....");
						System.out.println("Has perdido:" + apuesta);
						System.out.println("Te queda:" + dinero);
						System.out.println("******************************************************");

					}
				} else {
					System.out.println("No puedes apostar más del dinero que tienes");
					System.out.println("tu saldo es: " + dinero);
					System.out.println("******************************************************");

					continue;
				}
			}
			case 2 -> {
				System.out.println("Has escogido la primera docena, 1 al 12");
				System.out.println("tu saldo es: " + dinero);
				System.out.println("Cuanto quieres apostar");
				int apuesta = scan.nextInt();
				for (int i = 25; i <= 36; i++) {
					numeroApuesta = i;
					if (apuesta <= dinero) {
						if (numeroApuesta == numeroGanador) {
							dinero += (dinero - apuesta) + apuesta * 3;
							System.out.println("Felicidades has ganado!!!");
							System.out.println("El numero ganador a sido:" + numeroGanador);
							System.out.println("Has ganado:" + apuesta * 3);
							System.out.println("Te queda:" + dinero);
							System.out.println("******************************************************");

						}
					} else {
						System.out.println("No puedes apostar más del dinero que tienes");
						System.out.println("tu saldo es: " + dinero);
						System.out.println("******************************************************");

						continue;
					}

				}
				if (numeroApuesta != numeroGanador) {
					dinero -= apuesta;
					System.out.println("Lo tuyo es la petanca ....");
					System.out.println("Has perdido:" + apuesta);
					System.out.println("Te queda:" + dinero);
					System.out.println("******************************************************");

				}
			}
			case 3 -> {
				System.out.println("Has escogido la primera docena, 13 al 25");
				System.out.println("tu saldo es: " + dinero);
				System.out.println("Cuanto quieres apostar");
				int apuesta = scan.nextInt();
				for (int i = 25; i <= 36; i++) {
					numeroApuesta = i;
					if (apuesta <= dinero) {
						if (numeroApuesta == numeroGanador) {
							dinero += (dinero - apuesta) + apuesta * 3;
							System.out.println("Felicidades has ganado!!!");
							System.out.println("El numero ganador a sido:" + numeroGanador);
							System.out.println("Has ganado:" + apuesta * 3);
							System.out.println("Te queda:" + dinero);
							System.out.println("******************************************************");

						}
					} else {
						System.out.println("No puedes apostar más del dinero que tienes");
						System.out.println("tu saldo es: " + dinero);
						System.out.println("******************************************************");

						continue;
					}

				}
				if (numeroApuesta != numeroGanador) {
					dinero -= apuesta;
					System.out.println("Lo tuyo es la petanca ....");
					System.out.println("Has perdido:" + apuesta);
					System.out.println("Te queda:" + dinero);
					System.out.println("******************************************************");

				}
			}
			case 4 -> {
				System.out.println("Has escogido la primera docena, 25 al 36");
				System.out.println("tu saldo es: " + dinero);
				System.out.println("Cuanto quieres apostar");
				int apuesta = scan.nextInt();
				for (int i = 25; i <= 36; i++) {
					numeroApuesta = i;
					if (apuesta <= dinero) {
						if (numeroApuesta == numeroGanador) {
							dinero += (dinero - apuesta) + apuesta * 3;
							System.out.println("Felicidades has ganado!!!");
							System.out.println("El numero ganador a sido:" + numeroGanador);
							System.out.println("Has ganado:" + apuesta * 3);
							System.out.println("Te queda:" + dinero);
							System.out.println("******************************************************");

						}
					} else {
						System.out.println("No puedes apostar más del dinero que tienes");
						System.out.println("tu saldo es: " + dinero);
						System.out.println("******************************************************");

						continue;
					}

				}
				if (numeroApuesta != numeroGanador) {
					dinero -= apuesta;
					System.out.println("Lo tuyo es la petanca ....");
					System.out.println("Has perdido:" + apuesta);
					System.out.println("Te queda:" + dinero);
					System.out.println("******************************************************");

				}
			}
			// falla 5 y 6
			case 5 -> {
				System.out.println("Has apostado a números Par");
				System.out.println("tu saldo es: " + dinero);
				System.out.println("Cuanto quieres apostar");
				int apuesta = scan.nextInt();

				if (apuesta <= dinero) {
					if (numeroGanador % 2 == 0) {
						dinero += (dinero - apuesta) + apuesta * 2;
						System.out.println("Felicidades has ganado!!!");
						System.out.println("El numero ganador a sido:" + numeroGanador);
						System.out.println("Has ganado:" + apuesta * 2);
						System.out.println("Te queda:" + dinero);
						System.out.println("******************************************************");

					} else {
						dinero -= apuesta;
						System.out.println("Lo tuyo es la petanca ....");
						System.out.println("Has perdido:" + apuesta);
						System.out.println("Te queda:" + dinero);
						System.out.println("******************************************************");

					}

				} else {
					System.out.println("tu saldo es: " + dinero);
					System.out.println("no puedes apostar más del dinero que tienes");
					System.out.println("******************************************************");
				}

			}

			case 6 -> {
				System.out.println("Has apostado a números Impar");
				System.out.println("tu saldo es: " + dinero);
				System.out.println("Cuanto quieres apostar");
				int apuesta = scan.nextInt();

				if (apuesta <= dinero) {
					if (numeroGanador % 2 != 0) {
						dinero += (dinero - apuesta) + apuesta * 2;
						System.out.println("Felicidades has ganado!!!");
						System.out.println("El numero ganador a sido:" + numeroGanador);
						System.out.println("Has ganado:" + apuesta * 2);
						System.out.println("Te queda:" + dinero);
						System.out.println("******************************************************");

					} else {
						dinero -= apuesta;
						System.out.println("Lo tuyo es la petanca ....");
						System.out.println("Has perdido:" + apuesta);
						System.out.println("Te queda:" + dinero);
					}

				} else {
					System.out.println("tu saldo es: " + dinero);
					System.out.println("no puedes apostar más del dinero que tienes");
					System.out.println("******************************************************");
				}

			}

			case 7 -> {
				System.out.println("Adios vuelve pronto");
				System.out.println("******************************************************");

				return;
			}
			case 8 -> {
				System.out.println("tu saldo es: " + dinero);
				System.out.println("Cuanto quieres ingresar");
				ingreso = scan.nextInt();
				dinero += ingreso;
				System.out.println("Tu saldo es: " + dinero);
				System.out.println("******************************************************");

			}
			case 9 -> System.out.println("tu saldo es: " + dinero);
			default -> {
				System.out.println("Opción incorrecta");
				System.out.println("******************************************************");
			}

			}
		} while (dinero >= 0);
		// 

	}
}