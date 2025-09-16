package es.cursojava.oo.herencia;

public class Zoologico {

	public static void main(String[] args) {

		Animal animal = new Vaca("wendolin", 450, 555, 2);

		animal.comer();// estamos llamando al metodo comer de vaca,
		// el truco esta en que NEW es el que señala al metodo.

		// Vaca animal2 = new Animal("a1", 30, 646556464);
		// esto no funciona por que vaca esta por debajo de animal en la gerarquia....
		Lobo lobo = new Lobo("miguel", 50, 222);
		lobo.comer();
	}
}
