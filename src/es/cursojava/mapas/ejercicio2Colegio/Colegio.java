package es.cursojava.mapas.ejercicio2Colegio;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import es.cursojava.oo.Alumno;

public class Colegio {
	private String nombre;
	private String dirección;
	private Map<String, List<Alumno>> aulas;

//constructor
	public Colegio(String nombre, String dirección, Map<String, List<Alumno>> aulas) {
		this.nombre = nombre;
		this.dirección = dirección;
		this.aulas = aulas;
	}

	public Colegio(String nombre, String dirección) {
		super();
		this.nombre = nombre;
		this.dirección = dirección;
		this.aulas = new HashMap<>(); // siempre inicializar con HashMap

	}

//get y set
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDirección() {
		return dirección;
	}

	public void setDirección(String dirección) {
		this.dirección = dirección;
	}

	public Map<String, List<Alumno>> getAulas() {
		return aulas;
	}

	public void setAulas(Map<String, List<Alumno>> aulas) {
		this.aulas = aulas;
	}

	@Override
	public String toString() {
		return "Colegio [nombre=" + nombre + ", dirección=" + dirección + ", aulas=" + aulas + "]";
	}

}
