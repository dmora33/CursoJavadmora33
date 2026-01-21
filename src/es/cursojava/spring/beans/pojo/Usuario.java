package es.cursojava.spring.beans.pojo;

public class Usuario {
	private String nombre;
	private String rol; // "ADMIN" o "USER"

	public Usuario(String nombre, String rol) {
		this.nombre = nombre;
		this.rol = rol;
	}

	public String getNombre() {
		return nombre;
	}

	public String getRol() {
		return rol;
	}

	@Override
	public String toString() {
		return "Usuario{" + "nombre='" + nombre + '\'' + ", rol='" + rol + '\'' + '}';
	}
}
