package es.cursojava.hibernate.ejercicios.ejercicio1.dao;

import java.util.List;

import org.hibernate.Session;

import es.cursojava.hibernate.ejercicios.ejercicio1.entitys.Curso;

public class CursoDAO {
	private Session sesion;

	public void guadarCurso(Curso curso) {
		sesion.persist(curso); // Guardar el curso en la base de datos

	}

	public void eliminarCurso() {

	}

	public void actualizarCurso() {

	}

	public void obtenerCursoPorId() {

	}

	public List<Curso> obtenerTodosLosCursos() {
		return sesion.createQuery("from Curso", Curso.class).list();

	}

}
