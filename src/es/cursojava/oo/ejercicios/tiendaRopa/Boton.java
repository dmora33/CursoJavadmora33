package es.cursojava.oo.ejercicios.tiendaRopa;

public class Boton {
	private String color;
	private double tamanio;
	private String forma;

	public Boton(String color, double tamanio, String forma) {
		super();
		this.color = color;
		this.tamanio = tamanio;
		this.forma = forma;
	}

	
	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public double getTamanio() {
		return tamanio;
	}


	public void setTamanio(double tamanio) {
		this.tamanio = tamanio;
	}


	public String getForma() {
		return forma;
	}


	public void setForma(String forma) {
		this.forma = forma;
	}


	public void mostrarBoton() {
		System.out.println("\ncolor:\t" + this.color + "\ntamanio:\t" + this.tamanio + "\nforma:\t" + this.forma);
	}
}
