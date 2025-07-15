package es.cursojava.inicio2.arrys.ejercicios;

import java.util.Scanner;

/**
 * crear un coletio con 2 aulas y 3 puestos en cada aula.
 * 
 * crear un menu con :
 * 
 * insertar Alumnos: -> va a solicitar el nombre de los añumnos para las aulas
 * que tengan puestos disponibles. mostrar Alumnos: -> Muesta los alumnos por
 * aula, si un puesto no tiene alumno, mostrar (vacio) buscar Alumnos: ->
 * Solicitar texto, "tiene que contener lo que pasemos...." mostrar aula y
 * puesto en el que se encuentra el alumno que contenga el texto introducido.
 * borrar Alumnos: -> Solicitar nombre, y se borra a todos los alumnos que
 * tengan ese nombre. salir :
 */
public class ArrayAlumnos {

	public static void main(String[] args) {

		String colegio[][] = new String[2][3];

		int opcion = 0;

		// entrada y salda del menu
		Scanner scan = new Scanner(System.in);
		colegio[0][1] = "Daniel";
		colegio[1][2] = "Juan";
		colegio[1][1] = "Elisa";
		colegio[1][0] = "Pruebada";

		do {
			System.out.println("*******************************************************\n"
					+ "1.Insertar Alumnos: \n2.Mostrar Alumnos: \n3.Buscar Alumnos: \n4.Borrar Alumnos: \n5.Salir: ");

			opcion = scan.nextInt();

			switch (opcion) {
			case 1: {
				for (int i = 0; i < colegio.length; i++) {
					for (int j = 0; j < colegio[i].length; j++) {
						if (colegio[i][j] == null) {
							scan = new Scanner(System.in);
							System.out.println(" | Aula: " + i + " | puesto" + j);
							System.out.println("Añadir nombre del Alumno:");
							String nombre = scan.nextLine();
							// si pulsamos enter sin introducir datos y quitamos los espacios en blanco
							// salto a otro espacio
							if (nombre.trim().isEmpty()) {
								System.out.println("Campo vacio pasamos al siguente vacio");
							} else {
								colegio[i][j] = nombre;
								System.out.println("Has añadido a" + nombre + " | Aula: " + i + " | puesto" + j);

							}
						}

					}
				}
			}

				break;
			case 2: {
				for (int i = 0; i < colegio.length; i++) {
					for (int j = 0; j < colegio[i].length; j++) {
						if (colegio[i][j] == null) {
							System.out.println("\nNombre del Alumno: " + "vacio" + "\t" + "  | Aula: " + i
									+ "\t | puesto" + j + "\n");

						} else {
							System.out.print("\nNombre del Alumno: " + "| " + colegio[i][j] + "\t" + " | Aula: " + i
									+ "\t | puesto" + j + "\n");
						}
					}
				}
			}
				break;

			case 3: {
				System.out.println("Introduce el texto que quieres buscar:");
				scan = new Scanner(System.in);
				int contador = 0;
				Boolean encontrado = false;

				String texto = scan.nextLine();
				for (int i = 0; i < colegio.length; i++) {
					for (int j = 0; j < colegio[i].length; j++) {
						if (colegio[i][j] != null && colegio[i][j].toLowerCase().contains(texto.toLowerCase())) {
							contador++; // Incrementa el contador
							System.out.println("\nAula: " + i + " | Puesto: " + j + " | Alumno: " + colegio[i][j]);
							encontrado = true;
						}
					}
				}
				if (!encontrado) {
					System.out.println("no se han encontrador coincidencias");
				}
			}
				break;
			case 4: {
				System.out.println("Introduce el nombre del alumno que quieres borrar:");
				scan = new Scanner(System.in);
				String nombre = scan.nextLine();
				boolean eliminado = false;

				for (int i = 0; i < colegio.length; i++) {
					for (int j = 0; j < colegio[i].length; j++) {

						if (!nombre.trim().isEmpty() && colegio[i][j]!=null && colegio[i][j].equalsIgnoreCase(nombre) ) {
							colegio[i][j] = null;
							System.out.println("Se ha borrado a " + "|" + nombre + " | Aula: " + i + " | puesto: " + j);
							eliminado = true;

						}
						// usamos if !=elimininado para cerrar
						

					}
				}
				if (!eliminado) {
					System.out.println("No se ha eliminado a ningún Alumno");
				}
			}
				break;

			default:
				System.out.println("Opción incorrecta");
				break;
			}

		} while (opcion != 5);
	}

}
