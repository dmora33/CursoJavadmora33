package es.cursojava.mapas.ejercicio1Aulas;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import es.cursojava.oo.Alumno;
import es.cursojava.utilsDani.Utilidades;

public class MapaColegio {

	public static void main(String[] args) {
		List<Alumno> alumnos = generaAlumnos();

		Map<String, List<Alumno>> aulas = new HashMap<>();

		aulas.put("aula1", alumnos.subList(0, 2));
		aulas.put("aula2", alumnos.subList(2, 3));
		aulas.put("aula3", alumnos.subList(3, 7));

//		- Indicar cuantas aulas tiene el colegio

		System.out.println("número de alulas: " + aulas.size());
		System.out.println("========================================================");
// 		- Mostrar por cada aula los datos de los alumnos

		Collection<List<Alumno>> listaAlumnos = aulas.values();
		for (List<Alumno> list : listaAlumnos) {
			System.out.println(list.toString());
		}

		System.out.println("==================================================");
//		- Mostrar por cada aula cuantos alumnos hay

		for (List<Alumno> list : listaAlumnos) {
			System.out.println(list.size());
		}

		// - Solicitar el nombre de 1 aula y mostrar todos los alumnos del
		// aula si el aula existe

		String pideAula = Utilidades.pideDatoCadena("que aula quieres ver:" + "\n aula1,	aula2,	aula3.");

		// Comprobamos si el aula existe
		if (aulas.containsKey(pideAula.toLowerCase())) {
			System.out.println("existe");
			for (Alumno alumno : aulas.get(pideAula.toLowerCase())) {
				System.out.println(" - " + alumno);
			}
		} else {
			System.out.println("El aula \"" + pideAula + "\" no existe.");
		}
		// - Indicar cual es el aula que tiene el alumno con la nota media más alta

		
		
	}

	private static List<Alumno> generaAlumnos() {
		Alumno alumno1 = new Alumno("paco1", "1157533S", 7.5);
		Alumno alumno2 = new Alumno("paco2", "2157533S", 7);
		Alumno alumno3 = new Alumno("paco3", "3157533S", 2.5);
		Alumno alumno4 = new Alumno("paco4", "4157533S", 5.5);
		Alumno alumno5 = new Alumno("paco5", "5157533S", 9.5);
		Alumno alumno6 = new Alumno("paco6", "6157533S", 7.5);
		Alumno alumno7 = new Alumno("paco7", "7157533S", 7.5);

		List<Alumno> alumnos = Arrays.asList(alumno1, alumno2, alumno3, alumno4, alumno5, alumno6, alumno7);

		return alumnos;
	}

}
