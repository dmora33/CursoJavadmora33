package es.cursojava.inicio2.condicionales.ejercicios;

public class Ejercicio2 {

	public static void main(String[] args) {
		String asignatura = "Matemáticas";
		String nombreAlumno = "Daniel Mora";
		int nota = 7;
		if (nota>=0 && nota <5) {
			System.out.println("El alumno " + nombreAlumno + "en la asignatura " + asignatura + "tiene un suspenso");
		}
		else if (nota >=5 && nota<7) { // la comprobacion de 5 sobra!!!!!
			System.out.println("El alumno " + nombreAlumno + "en la asignatura " + asignatura + "tiene un aprobado");
		}
		else if (nota >=7 && nota <9) {// la comprobacion de 5 sobra!!!!!
			System.out.println("El alumno " + nombreAlumno + "en la asignatura " + asignatura + "tiene un notable");
		}else if (nota ==10 ) {
			System.out.println("El alumno " + nombreAlumno + "en la asignatura " + asignatura + "tiene un sobresaliente");
		}else { System.out.println("La nota esta equivocada.");}
		// TODO Auto-generated method stub

	}

}
