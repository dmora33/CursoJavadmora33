package es.cursojava.collection.ejercicioSupermercado.Alimentos;

public abstract class Alimentos {

	private String origen;
	private double coste;

	

	public Alimentos(String origen, double coste) {
		this.origen = origen;
		this.coste = coste;
	}

	public double getCoste() {
		return coste;
	}

	public void setCoste(double coste) {
		this.coste = coste;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	@Override
	public String toString() {
		return "Alimentos [origen=" + origen + ", coste=" + coste + "]";
	}

	

}
