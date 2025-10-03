package es.cursojava.interfaces.ejercicios.Pokemon.pojos;

import es.cursojava.interfaces.ejercicios.Pokemon.Interfaces.Agua;

public class Squirtle extends Pokemon implements Agua {

	public Squirtle() {
		super();
	}

	@Override
	public void atacarPlacaje() {
		System.out.println("Hola soy Squirtle y este es mi ataque placaje");
	}

	@Override
	public void atacarAraniazo() {
		System.out.println("Hola soy Squirtle y este es mi ataque arañazo");
	}

	@Override
	public void atacarMordisco() {
		System.out.println("Hola soy Squirtle y este es mi ataque mordisco");
	}

	@Override
	public void atacarHidrobomba() {
		System.out.println("Hola soy Squirtle y este es mi ataque hidrobomba");
	}

	@Override
	public void atacarBurbuja() {
		System.out.println("Hola soy Squirtle y este es mi ataque burbuja");
	}

	@Override
	public void atacarPistolaAgua() {
		System.out.println("Hola soy Squirtle y este es mi ataque pistola agua");
	}

}
