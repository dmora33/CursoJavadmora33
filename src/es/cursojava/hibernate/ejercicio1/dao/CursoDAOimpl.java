package es.cursojava.hibernate.ejercicio1.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import es.cursojava.hibernate.ejercicio1.entites.Curso;
import es.cursojava.utils.HibernateUtil;
import org.hibernate.query.*;

public class CursoDAOimpl implements CursoDAO {

	private Session session;
	private Transaction transaction;

	public CursoDAOimpl() {
		session = HibernateUtil.getSession();
		transaction = session.beginTransaction();
	}

	public void guardarCurso(Curso curso) {
		session.persist(curso);
	}

	public void eliminarCurso() {

	}

	public void actualizarCurso() {

	}

	public Curso obtenerCursoPorId(Long id) {

		return session.get(Curso.class, id);
	}

	public List<Curso> obtenerTodosLosCursos() {

		return session.createQuery("from Curso", Curso.class).list();

	}

	public void commitTransaction() {
		transaction.commit();
	}

	@Override
	public void eliminarCurso(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actualizarCurso(Curso curso) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Curso> obtenerLosCursosActivos(String nombre) {
		// Si no se proporciona nombre, devolvemos solo los activos.
		if (nombre == null || nombre.trim().isEmpty()) {
			Query<Curso> query = session.createQuery("from Curso where activo = true", Curso.class);
			return query.list();
		}

		// Si se proporciona nombre, filtramos por nombre (like)
		Query<Curso> query = session.createQuery("from Curso where activo = true and nombre like :nombreParam",
				Curso.class);
		query.setParameter("nombreParam", "%" + nombre.trim() + "%");

		return query.list();
	}

	@Override
	public List<Curso> obtenerCursosPorNombre(String nombre) {
		// Si no se proporciona nombre, devolvemos todos los cursos
		if (nombre == null || nombre.trim().isEmpty()) {
			return obtenerTodosLosCursos();
		}

		// En HQL no se deben poner los comodines (%) dentro de la cadena de la consulta
		// junto al placeholder.
		// Uso correcto: '... where nombre like :nombreParam' y paso '%valor%' al
		// parámetro.
		Query<Curso> query = session.createQuery("from Curso where nombre like :nombreParam", Curso.class);
		query.setParameter("nombreParam", "%" + nombre.trim() + "%");

		return query.list();
	}

	@Override
	public List<Curso> informacionPorCategoriaYFechaIncio(String categoria, LocalDate fechaInicio) {
		System.out.println("Categoria: " + categoria + ", Fecha Inicio: " + fechaInicio);
//		Query<Curso> query = session.createQuery(
//				"from Curso where categoria = :categoriaParam and fechaInicio >= :fechaInicioParam", Curso.class);
//		query.setParameter("categoriaParam", categoria);
//		query.setParameter("fechaInicioParam", fechaInicio);

		Query<Curso> query = session.createQuery("from Curso c where c.fechaInicio >= :fechaInicioParam", Curso.class);
		query.setParameter("fechaInicioParam", fechaInicio);

		return query.list();
	}

	public List<Curso> buscarPorRangoFechaInicio(java.time.LocalDate desde, java.time.LocalDate hasta) {
		System.out.println("Buscando cursos desde " + desde + " hasta " + hasta);

		return session
				.createQuery("from Curso c where c.fechaInicio >= :desde and c.fechaInicio <= :hasta", Curso.class)
				.setParameter("desde", desde).setParameter("hasta", hasta).getResultList();

	}

	@Override
	public List<Curso> informacionPorNivelYHorasYFechainicio(String nivel, Integer horasTotales,
			LocalDate fechaInicio) {
		Query<Curso> query = session.createQuery(
				"from Curso where nivel = :nivelParam and horasTotales = :horasTotalesParam and fechaInicio >= :fechaInicioParam",
				Curso.class);
		query.setParameter("nivelParam", nivel);
		query.setParameter("horasTotalesParam", horasTotales);
		query.setParameter("fechaInicioParam", fechaInicio);
		return query.list();

	}

	public List<Curso> obtenerNobreDescripcionCurso() {
		// devuelve un listado de arrays donde cadaposc es el campo que vamos pidiendo
		// en su orden.0 c.nombre 1 c.descrip...... de cada array, un array por cada
		// registro.
		// es un listado de arrays de objet .... que engloba todos los tipos de campos.

		List<Object[]> datos = session.createQuery("select c.nombre, c.descripcion from Curso c").list();
		List<Curso> cursos = new ArrayList<>();
		for (Object[] fila : datos) {
			String nombre = (String) fila[0];
			String descripcion = (String) fila[1];
			Curso curso = new Curso(nombre, descripcion);
			cursos.add(curso);
			System.out.println("Nombre: " + nombre + ", Descripcion: " + descripcion);
		}
		return cursos;
	}
	
	// Método que devuelve una lista de objetos Curso con solo nombre y descripción
	public List<Curso> obtenerNombreDescripcionCursos2() {
	    
	    // Se construye una consulta HQL (Hibernate Query Language).
	    // La consulta usa "select new ..." para crear instancias de la clase Curso
	    // pero solo inicializando los atributos nombre y descripción.
	    // Esto requiere que la clase Curso tenga un constructor que reciba (String nombre, String descripcion).
	    String hqlQuery = "select new " 
	        + "es.cursojava.hibernate.ejercicio1.entites.Curso(c.nombre, c.descripcion ) "
	        + "from Curso c order by c.nombre asc";
	    
	    // Se ejecuta la consulta HQL en la sesión de Hibernate.
	    // - session.createQuery(hqlQuery, Curso.class): crea la consulta tipada para devolver objetos Curso.
	    // - setMaxResults(3): limita el resultado a un máximo de 3 registros.
	    // - list(): obtiene la lista de resultados.
	    List<Curso> cursos = session.createQuery(hqlQuery, Curso.class)
	                                .setMaxResults(3)
	                                .list();
	    
	    // Se devuelve la lista de cursos obtenida.
	    return cursos;
	}


}