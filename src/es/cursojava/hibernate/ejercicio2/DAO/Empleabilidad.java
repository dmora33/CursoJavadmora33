package es.cursojava.hibernate.ejercicio2.DAO;

import java.util.List;

import es.cursojava.hibernate.ejercicio2.entites.Empleado;

public interface Empleabilidad {
	public void altaEmpleado();

	public void actualizacionSalario();

	public Empleado busquedaPorNIF();

	public List<Empleado> listaEmpleadosDepartamentos();
}
