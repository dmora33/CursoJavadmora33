package es.cursojava.interfaces.ejercicios.ApagarEncender;

public abstract class Producto extends IdGenerator {
	private long id;
	private String nombre;
	private int precio;

	public Producto(String nombre, int precio) {
		this.nombre = nombre;
		this.precio = precio;
		this.id = IdGenerator.getNextId();
	}

	public String getNombre() {
		return nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public long getId() {
		return id;
	}

}
