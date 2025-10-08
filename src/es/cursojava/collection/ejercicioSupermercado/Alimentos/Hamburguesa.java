package es.cursojava.collection.ejercicioSupermercado.Alimentos;

public class Hamburguesa extends Alimentos {

	public Hamburguesa(String origen, double coste) {
		super(origen, coste);
	}

	@Override
	public String toString() {
		return "Hamburguesa [getCoste()=" + getCoste() + ", getOrigen()=" + getOrigen() + "]";
	}

}
