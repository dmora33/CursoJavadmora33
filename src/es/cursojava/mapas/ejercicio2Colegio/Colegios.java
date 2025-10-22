package es.cursojava.mapas.ejercicio2Colegio;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import es.cursojava.oo.Alumno;

public class Colegios {

	public static void main(String[] args) {
		Map<String, List<Alumno>> aulas1 = generaAlulasRandom();
		Map<String, List<Alumno>> aulas2 = generaAlulasRandom();
		Map<String, List<Alumno>> aulas3 = generaAlulasRandom();

		Colegio colegio1 = new Colegio("colegio1", "Getafe", aulas1);

		Colegio colegio2 = new Colegio("colegio2", "Getafe", aulas2);
		Colegio colegio3 = new Colegio("colegio3", "Getafe", aulas3);

	}

	private static List<Alumno> generaAlumnosRandom() {
		Alumno alumno1 = new Alumno("paco" + Math.random() * 100, "1157533S", Math.random() * 10);
		Alumno alumno2 = new Alumno("paco" + Math.random() * 100, "2157533S", Math.random() * 10);
		Alumno alumno3 = new Alumno("paco" + Math.random() * 100, "3157533S", Math.random() * 10);
		Alumno alumno4 = new Alumno("paco" + Math.random() * 100, "4157533S", Math.random() * 10);
		Alumno alumno5 = new Alumno("paco" + Math.random() * 100, "5157533S", Math.random() * 10);
		Alumno alumno6 = new Alumno("paco" + Math.random() * 100, "6157533S", Math.random() * 10);
		Alumno alumno7 = new Alumno("paco" + Math.random() * 100, "7157533S", Math.random() * 10);

		List<Alumno> alumnos = Arrays.asList(alumno1, alumno2, alumno3, alumno4, alumno5, alumno6, alumno7);

		return alumnos;
	}

	private static Map<String, List<Alumno>> generaAlulasRandom() {

		List<Alumno> alumnos1 = generaAlumnosRandom();

		Map<String, List<Alumno>> aulas1 = new HashMap<>();
		// divido los 7 alumnos en aulas.
		aulas1.put("aula1", alumnos1.subList(0, 2));
		aulas1.put("aula2", alumnos1.subList(2, 3));
		aulas1.put("aula3", alumnos1.subList(3, 7));

		return aulas1;
	}
}
