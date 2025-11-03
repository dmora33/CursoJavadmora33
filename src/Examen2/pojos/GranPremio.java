package Examen2.pojos;

import java.util.ArrayList;
import java.util.List;

public class GranPremio {

	private String nombre;
	private List<Carrera> carreras;
	private List<Apostante> apostantes;

	public GranPremio(String nombre, List<Carrera> carreras) {
		super();
		this.nombre = nombre;
		this.carreras = carreras;
		this.apostantes = new ArrayList<Apostante>();

	}

	public GranPremio(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Carrera> getCarreras() {
		return carreras;
	}

	public void setCarreras(List<Carrera> carreras) {
		this.carreras = carreras;
	}

	public List<Apostante> getApostantes() {
		return apostantes;
	}

	public void setApostantes(List<Apostante> apostantes) {
		this.apostantes = apostantes;
	}

	@Override
	public String toString() {
		return "GranPremio [nombre=" + nombre + ", carreras=" + carreras + ", apostantes=" + apostantes + "]";
	}

}
