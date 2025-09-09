package es.cursojava.oo.ejercicios.tiendaRopa;

public class Pantalon {
	private String color;
	private double precio;
	private String forma;
	private String talla;
	

	public String getColor() {
		return color;
	}





	public void setColor(String color) {
		this.color = color;
	}





	public String getForma() {
		return forma;
	}





	public void setForma(String forma) {
		this.forma = forma;
	}





	public String getTalla() {
		return talla;
	}





	public void setTalla(String talla) {
		this.talla = talla;
	}





	public Pantalon(String color, double precio, String forma, String talla) {
		super();
		this.color = color;
		this.precio = precio;
		this.forma = forma;
		this.talla = talla;
	}
	

	


	public double getPrecio() {
		return precio;
	}





	public void setPrecio(double precio) {
		this.precio = precio;
	}





	public void mostrarPantalon() {
		System.out.println("\ncolor:\t" + this.color + "\ntamanio:\t" + this.precio + "\nforma:\t" + this.forma
				+ "\ntalla:\t" + talla);

	}

}
