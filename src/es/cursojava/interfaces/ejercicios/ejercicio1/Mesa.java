package es.cursojava.interfaces.ejercicios.ejercicio1;

public class Mesa extends Mueble {

	String forma;

	public Mesa(String color, String forma) {
		super(color);
		this.forma = forma;
	}

	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}

	@Override
	public void limpiar() {
		// TODO Auto-generated method stub
		
	}

}
