package es.cursojava.inicio2.arrys.ejercicios;

import java.util.Scanner;

/**
 * crear un array de alumnos con sus notas indicar cuantos alumnos han aprobado
 * indicar la nota media de todos los alumnos
 * 
 */
public class ArraysEjercicio1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("dime el numero de alumnos:");
		int numeroAlumnos = scan.nextInt();
		String error = "";
		if (numeroAlumnos <= 0) {
			error += "el número de alumnos tiene que ser mayor de 0";
		} else {
			double[] alumnos = new double[numeroAlumnos];
			double sumaNotas = 0;
			int contadorAprobados = 0;
			double notaAlumno = 0;
			for (int i = 0; i < alumnos.length; i++) {
				System.out.println("dime la nota del alumno" + i + " con el formato x,x");
				notaAlumno = scan.nextDouble();
				alumnos[i] = notaAlumno;
				sumaNotas += notaAlumno;
				if (notaAlumno >= 5) {
					contadorAprobados++;
				}
			}

			double notaMedia = sumaNotas / numeroAlumnos;
			System.out.println("la nota media de la clase es:" + notaMedia);
			for (int i = 0; i < alumnos.length; i++) {
				if (alumnos[i] >= 5) {
					System.out.print("el alunmo " + i + " tiene la nota: " + alumnos[i] + "\n");
				}
		}
			// bucle foreach
			
			for (double nota : alumnos) {
				System.out.println("nota");
	
			
			}
			System.out.println("el número de alumnos aprobados es: " + contadorAprobados);
		}
		scan.close();

	}

}
