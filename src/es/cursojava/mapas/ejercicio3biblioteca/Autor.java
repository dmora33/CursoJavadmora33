package es.cursojava.mapas.ejercicio3biblioteca;

import java.util.Objects;

public class Autor {
	private String nombre;
	private String nacionalidad;
	public Autor() {
	}
	public Autor(String nombre, String nacionalidad) {
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	@Override
	public String toString() {
		return "Autor [nombre=" + nombre + ", nacionalidad=" + nacionalidad + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(nacionalidad, nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Autor other = (Autor) obj;
		return Objects.equals(nacionalidad, other.nacionalidad) && Objects.equals(nombre, other.nombre);
	}
	
	
	
	
	

}
