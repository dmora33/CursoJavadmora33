package es.cursojava.hibernate.ejercicio1;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import es.cursojava.hibernate.ejercicio1.dao.CursoDAOimpl;
import es.cursojava.hibernate.ejercicio1.entites.Curso;
import es.cursojava.utils.Utilidades;
import es.cursojava.utilsDani.LeerArchivoDani;

public class Ejercicio1Hibernate {

	public static void main(String[] args) {
//		insertarCursos();
		// listarCursos();
//		obtenerCursoPorId();
		System.out.println("Empezando");
		List<String> listaFicheroLeido = LeerArchivoDani
				.leerFichero("C:\\Users\\Tardes\\git\\CursoJavadmora33\\Enunciados\\Hibernate\\cursos.txt");
		// insertarCursos(listaFicheroLeido);
		// filtrarPorFechas();
		CursoDAOimpl cursoDAO = new CursoDAOimpl();
		// cursoDAO.commitTransaction();
		LocalDate fechaInicio = LocalDate.of(2025, 1, 1);
		List<Curso> cursos = cursoDAO.informacionPorCategoriaYFechaIncio("Programación", fechaInicio);
		for (Curso curso : cursos) {
			System.out.println("curso encontrado:" + curso.toString());
		}
		List<Curso> curso2 = cursoDAO.informacionPorNivelYHorasYFechainicio("Básico", 40, fechaInicio);
		for (Curso curso : curso2) {
			System.out.println(curso.toString());
		}
	}
	// YA LOS TENGO INSERTADOS

	private static void insertarCursos(List<String> listaFichero) {

		System.out.println("leer lista y separar");
		for (String linea : listaFichero) {
			String[] partes = linea.split("\\|");
			System.out.println(Arrays.toString(partes));
			Curso curso = new Curso();
			curso.setCodigo(partes[0].trim());
			curso.setNombre(partes[1].trim());
			curso.setDescripcion(partes[2].trim());
			curso.setHorasTotales(Integer.parseInt(partes[3].trim()));
			curso.setActivo(Boolean.valueOf(partes[4].trim()));
			curso.setNivel(partes[5].trim());
			curso.setCategoria(partes[6].trim());
			curso.setPrecio(new BigDecimal(partes[7])); // al añadirlo como un objeto un nuevo objeto si lo coge como
														// String
			curso.setFechaInicio(LocalDate.parse(partes[8].trim()));
			curso.setFechaFin(LocalDate.parse(partes[9].trim()));
			CursoDAOimpl cursoDAO = new CursoDAOimpl();
			cursoDAO.guardarCurso(curso);
//  el commit para que haga los cambios....
			cursoDAO.commitTransaction(); // confirmar cambios y subir a bbdd
			System.out.println("Cursos insertados correctamente");
		}

	}

	public static void filtrarPorFechas() {

		CursoDAOimpl dao = new CursoDAOimpl();

		// Definir el rango de fechas
		LocalDate fechaDesde = LocalDate.of(2025, 1, 1);
		LocalDate fechaHasta = LocalDate.of(2025, 2, 1);

		// Llamar al método
		List<Curso> cursos = dao.buscarPorRangoFechaInicio(fechaDesde, fechaHasta);

		// Mostrar resultados
		System.out.println("Cursos con fecha de inicio entre " + fechaDesde + " y " + fechaHasta + ":");
		cursos.forEach(System.out::println);
	}

	private static void listarCursos() {
		System.out.println("Listando cursos");
		CursoDAOimpl dao = new CursoDAOimpl();
		List<Curso> cursos = dao.obtenerTodosLosCursos();
		for (Curso curso : cursos) {
			System.out.println("Curso: " + curso.getCodigo() + " - " + curso.getNombre());
		}
		dao.commitTransaction();
	}

	private static void obtenerCursoPorId() {
		int id = Utilidades.pideDatoNumerico("Introduce el id del curso a buscar: ");
		CursoDAOimpl dao = new CursoDAOimpl();
		Curso curso = dao.obtenerCursoPorId(Long.valueOf(id));
		if (curso != null) {
			System.out.println("Curso encontrado: " + curso.getCodigo() + " - " + curso.getNombre());
		} else {
			System.out.println("No se ha encontrado ningun curso con id " + id);
		}
		dao.commitTransaction();
	}

}
