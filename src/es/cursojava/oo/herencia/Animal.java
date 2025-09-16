package es.cursojava.oo.herencia;

public class Animal {

	private String nombre;
	private double peso;
	private long identificador;

//	public Animal () {
//		
//	}
	public Animal(String nombre, double peso, 
			long identificador) {
		super(); //super: llamada por def al constructor objetc
		this.nombre = nombre;
		this.peso = peso;
		this.identificador = identificador;
	}
	

	public void comer() {
		System.out.println("El animal " + this.nombre + "está comiendo");
	}

	public String getNombre() {
		return nombre;
	}

	public double getPeso() {
		return peso;
	}

	public long getIdentificador() {
		return identificador;
	}
	
}
