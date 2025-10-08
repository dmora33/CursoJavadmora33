package es.cursojava.collection.ejercicioSupermercado.Alimentos;

public class Salmon extends Alimentos {

	public Salmon(String origen, double coste) {
		super(origen, coste);
	}

	@Override
	public String toString() {
		return "Salmon [getCoste()=" + getCoste() + ", getOrigen()=" + getOrigen() + "]";
	}

	

}
