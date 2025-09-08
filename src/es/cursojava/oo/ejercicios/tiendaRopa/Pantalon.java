package es.cursojava.oo.ejercicios.tiendaRopa;

public class Pantalon {
	private String color;
	private double tamanio;
	private String forma;
	private double talla;

	public Pantalon(String color, double tamanio, String forma, double talla) {
		super();
		this.color = color;
		this.tamanio = tamanio;
		this.forma = forma;
		this.talla = talla;
	}

	public void mostrarPantalon() {
		System.out.println("\ncolor:\t" + this.color + "\ntamanio:\t" + this.tamanio + "\nforma:\t" + this.forma
				+ "\ntalla:\t" + talla);

	}

}
