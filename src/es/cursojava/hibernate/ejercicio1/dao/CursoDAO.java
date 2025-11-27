package es.cursojava.hibernate.ejercicio1.dao;

import java.time.LocalDate;
import java.util.List;

import es.cursojava.hibernate.ejercicio1.entites.Curso;

public interface CursoDAO {
	public void guardarCurso(Curso curso);

	public void eliminarCurso(Long id);

	public void actualizarCurso(Curso curso);

	public Curso obtenerCursoPorId(Long id);

	public List<Curso> obtenerTodosLosCursos();

	public List<Curso> obtenerLosCursosActivos(String nombre);

	public List<Curso> obtenerCursosPorNombre(String nombre);

	public List<Curso> informacionPorCategoriaYFechaIncio(String categoria, LocalDate fechaInicio);

	public List<Curso> informacionPorNivelYHorasYFechainicio(String nivel, Integer horasTotales, LocalDate fechaInicio);

}
