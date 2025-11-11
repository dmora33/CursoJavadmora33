package es.cursojava.excepciones.ejercicios.ejercicio1;

import java.util.ArrayList;
import java.util.List;

import es.cursojava.utilsDani.Utilidades;

public class Ejecutor1 {

	// solicite al usuario ingresar los datos de 5 alumnos.
//crear un bucle que haga cinco alumnos
//meter los alumnosexc  en una lista
	public static List<AlumnoException> crearListaAlumnos() {
		List<AlumnoException> pollitos = new ArrayList<AlumnoException>();
		for (int i = 0; i < 5; i++) {
			try {
				pollitos.add(new AlumnoException(Utilidades.NombreAleatorio(), null,
						Utilidades.numeroAleatorio(-10, 10), Utilidades.numeroAleatorio(0, 20)));
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NotaInvalidaExecption e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return pollitos;
	}

	public static void main(String[] args) {
// solicite al usuario ingresar los datos de 5 alumnos.

		List<AlumnoException> pollitosLista = crearListaAlumnos();
		System.out.println(pollitosLista.toString());

	}
}