package es.cursojava.collection.ejercicioSupermercado.Alimentos;

public class Platanos extends Alimentos {

	public Platanos(String origen,double coste) {
		super(origen, coste);
	}

	@Override
	public String toString() {
		return "Platanos [getCoste()=" + getCoste() + ", getOrigen()=" + getOrigen() + "]";
	}

	

}
