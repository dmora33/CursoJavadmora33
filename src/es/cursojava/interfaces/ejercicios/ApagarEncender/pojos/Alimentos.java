package es.cursojava.interfaces.ejercicios.ApagarEncender.pojos;

public abstract class Alimentos extends Producto {
	private String fechaCaducidad;

	public Alimentos(String nombre, int precio, String fechaCaducidad) {
		super(nombre, precio);
		this.fechaCaducidad = fechaCaducidad;
		// TODO Auto-generated constructor stub
	}

	public String getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	@Override
	public String toString() {
		return "Alimentos [fechaCaducidad=" + fechaCaducidad + ", getNombre()=" + getNombre() + ", getPrecio()="
				+ getPrecio() + ", getClass()=" + getClass() + "]";
	}

}
