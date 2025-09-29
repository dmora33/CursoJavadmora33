package es.cursojava.interfaces.ejercicios.Suscriciones;

public class Piloto extends Cliente implements ISuscripcionGratuita {
	private int horasDeVuelo;

	public Piloto(String nombre, int horasDeVuelo) {
		super(nombre);
		this.horasDeVuelo = horasDeVuelo;
	}

	public int getHorasDeVuelo() {
		return horasDeVuelo;
	}

	public void setHorasDeVuelo(int horasDeVuelo) {
		this.horasDeVuelo = horasDeVuelo;
	}

	@Override
	public void leerInformes() {
		System.out.println("piloto " + getNombre() + "leyendo informe");
	}

}
