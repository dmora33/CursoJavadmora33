package es.cursojava.inicio2.condicionales.ejercicios;

public class Ejercicio2Corregido {

/*
 * 
+ Declarar la variables asignatura de tipo String, nombreAlumno de tipo String 
	y nota de tipo int 
+ Inicializar las variables con valores inventados
+ El resultado a mostrar sería: El alumno Juan en la asignatura Matemáticas tiene un Notable

0 <5 suspenso
5 <7 aprobado
7 <9 notable
9-10 sobresaliente
 * 
 * 
 */



	public static void main(String[] args) {
		String asignatura = "Matemáticas";
		String nombreAlumno = "Marta";
		int notaAlumno = 7;
		
		String notaFinal = "";
		if (notaAlumno<5) {
			notaFinal = "suspenso";
		}else if (notaAlumno<7) {
			notaFinal = "aprobado";
		}else if (notaAlumno<9) {
			notaFinal = "notable";
		}else if (notaAlumno<=10) {
			notaFinal = "sobresaliente";
		}

		System.out.println("El alumno "+nombreAlumno + 
				" en " + asignatura + " tiene un "+ notaFinal);}
}
		
	


