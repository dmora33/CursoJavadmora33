package es.cursojava.oo.ejercicios.tiendaRopa;

public class Vestido {
	private String color;
	private double precio;
	private double talla;

	public Vestido(String color, double precio, double talla) {
		super();
		this.color = color;
		this.precio = precio;
		this.talla = talla;
	}

	public void mostrarVestido() {
		System.out.println("\ncolor:\t" + color + "\nprecio\t" + precio + "\ntalla\t" + talla);
	}

}
