package es.cursojava.mapas.ejercicio2Colegio;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import es.cursojava.oo.Alumno;

public class Colegios {

	public static void main(String[] args) {
		Map<String, List<Alumno>> aulas1 = generaAulasRandom();
		Map<String, List<Alumno>> aulas2 = generaAulasRandom();
		Map<String, List<Alumno>> aulas3 = generaAulasRandom();

		Colegio colegio1 = new Colegio("colegio1", "Getafe", aulas1);

		Colegio colegio2 = new Colegio("colegio2", "Getafe", aulas2);
		Colegio colegio3 = new Colegio("colegio3", "Getafe", aulas3);

		// Crear 3 colegios -> Meterlos en una lista y:
		// + recorrer la lista de colegios para mostrar los datos de cada colegio, el
		// nombre de cada aula del colegio y por cada aula, el nombre, el apellido y la
		// nota media de sus alumnos
		List<Colegio> colegios = Arrays.asList(colegio3, colegio2, colegio1);

		// en null ponemos colegio1,2 o 3.

		// colegios.get(0).setAulas(null);

		// Añadir un nuevo alumno a un aula existente ESTA MAL EL CODIGO DE AÑADIR!!!!!!
//		colegio2.getAulas().get("aula1").add(new Alumno("Nuevo", "9999999X", 8.5));
//
//		// Añadir un aula nueva con alumnos
//		colegio2.getAulas().put("aula4", generaAlumnosRandom());

		// enseñar datos colegios
		mostrarTodoColegios(colegios);

		mostrarColegioConMejorNotaMedia(colegios);

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

	private static Map<String, List<Alumno>> generaAulasRandom() {

		List<Alumno> alumnos1 = generaAlumnosRandom();

		Map<String, List<Alumno>> aulas1 = new HashMap<>();
		// divido los 7 alumnos en aulas.
		aulas1.put("aula1", alumnos1.subList(0, 2));
		aulas1.put("aula2", alumnos1.subList(2, 3));
		aulas1.put("aula3", alumnos1.subList(3, 7));

		return aulas1;
	}

//	private static void mostrarTodoColegios(List<Colegio> colegios) {
//
//		for (Colegio colegio : colegios) {
//			System.out.println(colegio);// como tenemos metodo sobrecargado toString lo usa por defecto.
//			Map<String, List<Alumno>> aulas = colegio.getAulas();
//
//			Set<String> nombresAulas = colegio.getAulas().keySet();// sacamos un listado de los nombres de las aulas
//																	// guardado en un set
//			for (String aula : nombresAulas) {
//				System.out.println("\t" + aula); // nombre del aula que es la clave del mapa aulas
//				List<Alumno> alumnos = aulas.get(aula);
//				for (Alumno alumno : alumnos) {
//					System.out.println("\t\t" + alumno);
//				}
//			}
//
//		}
//	}
	private static void mostrarTodoColegios(List<Colegio> colegios) {
		for (Colegio colegio : colegios) {
			System.out.println(colegio); // Usa toString del colegio
			Map<String, List<Alumno>> aulas = colegio.getAulas();

			for (String aula : aulas.keySet()) {
				System.out.println("\tAula: " + aula);
				List<Alumno> alumnos = aulas.get(aula);
				for (Alumno alumno : alumnos) {
					System.out.println("\t\t" + alumno); // Usa toString del alumno
				}
			}
		}
	}

	private static void mostrarColegioConMejorNotaMedia(List<Colegio> colegios) {
		Colegio mejorColegio = null;
		double mejorMedia = -1;

		for (Colegio colegio : colegios) {
			double sumaNotas = 0;
			int totalAlumnos = 0;

			Map<String, List<Alumno>> aulas = colegio.getAulas();
			Collection<List<Alumno>> listadosAlumnos = aulas.values();
			for (List<Alumno> alumnos : listadosAlumnos) {
				for (Alumno alumno : alumnos) {
					sumaNotas += alumno.getNotaMedia();
					totalAlumnos++;
				}
			}

			double mediaColegio;
			if (totalAlumnos > 0) {
				mediaColegio = sumaNotas / totalAlumnos;
			} else {
				mediaColegio = 0;
			}

			// Redondear la media a dos decimales
			// double mediaRedondeada = Math.round(mediaColegio * 100.0) / 100.0;

			System.out.println("Media de " + colegio.getNombre() + ": " + mediaColegio);

			if (mediaColegio > mejorMedia) {
				mejorMedia = mediaColegio;
				mejorColegio = colegio;
			}
		}

		if (mejorColegio != null) {
			// Redondear la mejor media también
		//	double mejorMediaRedondeada = Math.round(mejorMedia * 100.0) / 100.0;

			System.out.println("El colegio con mejor nota media es: " + mejorColegio.getNombre() + " (Media: "
					+ mejorMedia + ")");
		} else {
			System.out.println("No hay datos suficientes para calcular la nota media.");
		}
	}

}
