package es.cursojava.hibernate.ejercicio2.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import es.cursojava.hibernate.ejercicio2.entites.Empleado;
import es.cursojava.utils.HibernateUtil;

public class empleadoDAO implements Empleabilidad {
	private Session session;
	private Transaction transaction;

	public empleadoDAO() {
		session = HibernateUtil.getSessionFactory();
		transaction = session.beginTransaction();
	}

	@Override
	public void altaEmpleado() {
		// TODO Auto-generated method stub

	}

	@Override
	public void actualizacionSalario() {
		// TODO Auto-generated method stub

	}

	@Override
	public Empleado busquedaPorNIF() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Empleado> listaEmpleadosDepartamentos() {
		// TODO Auto-generated method stub
		return null;
	}

}
