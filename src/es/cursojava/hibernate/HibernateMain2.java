package es.cursojava.hibernate;

import java.util.Calendar;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class HibernateMain2 {
	public static void main(String[] args) {
		
		
		Transaction tx = null;
		try {
			SessionFactory sessionFactory = new Configuration().configure() // Carga hibernate.cfg.xml
					.buildSessionFactory(); // define la sesion
			Session session = sessionFactory.openSession(); // abrimos la sesion
			System.out.println("conectado");
			tx = session.beginTransaction();

			Empresa empresa1 = new Empresa("SolucionaCagadas", "00215445f", "solucion", "solucion",
					Calendar.getInstance().getTime());
			Empresa empresa2 = new Empresa("SASA.", "DSD", "56454231S", "apenasalgo", Calendar.getInstance().getTime());
			session.persist(empresa1);
			session.persist(empresa2);
			
			tx.commit();
			
			Query<Empresa> query = session.createQuery("from Empresa", Empresa.class); // esto es UNA CONSULTA Y LA
																						// GRABA EN QUERY
			List<Empresa> empresas = query.list(); // grabamos la tabla en una lista....
			// esto sirve para importar la información de la base de datos.
			for (Empresa empresa : empresas) {
				System.out.println(empresa);
			}

		} catch (Throwable ex) {
			try {
				tx.rollback();
			} catch (NullPointerException e) {
				System.out.println("transaccion no creada"); // NO HAY CONEXION EN LA BASE DE DATOS.
			}
			System.err.println("Error al crear la SessionFactory." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}
}
