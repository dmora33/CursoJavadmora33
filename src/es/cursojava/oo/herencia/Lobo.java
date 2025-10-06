package es.cursojava.oo.herencia;

public final class Lobo extends Animal {
	// final es para que no se pueda heredar de ella.

	private int numColmillos;
	// para que no de error hay que añadir el constructor DE LA SUPER CLASE

	public Lobo(String nombre, double peso, long identificador) {
		super(nombre, peso, identificador);
		// TODO Auto-generated constructor stub
	}

	// HAY QUE AÑADIR UN CONSTRUC CON COLMILLO CON EL CONSTRUC NORMAL

	public Lobo(String nombre, double peso, long identificador, int numColmillos) {
		super(nombre, peso, identificador);
		this.numColmillos = numColmillos;
	}

	public int getNumColmillos() {
		return numColmillos;
	}

	public void setNumColmillos(int numColmillos) {
		this.numColmillos = numColmillos;
	}

	public void comer() {
		System.out.println("El animal " + "ha cazado");
	}

}
