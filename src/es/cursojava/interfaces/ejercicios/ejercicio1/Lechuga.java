package es.cursojava.interfaces.ejercicios.ejercicio1;

public class Lechuga extends Verdura {
	String tipo;

	public Lechuga(String procedencia, String tipo) {
		super(procedencia);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
