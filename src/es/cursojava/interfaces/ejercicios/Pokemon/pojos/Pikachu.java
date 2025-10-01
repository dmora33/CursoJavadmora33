package es.cursojava.interfaces.ejercicios.Pokemon.pojos;

import es.cursojava.interfaces.ejercicios.Pokemon.Interfaces.Electrico;

public class Pikachu extends Pokemon implements Electrico {
	public Pikachu() {
		super();

	}

	@Override
	public void atacarPlacaje() {
		System.out.println("Hola soy Pikachu y este es mi ataque placaje");
	}

	@Override
	public void atacarAraniazo() {
		System.out.println("Hola soy Pikachu y este es mi ataque arañazo");
	}

	@Override
	public void atacarMordisco() {
		System.out.println("Hola soy Pikachu y este es mi ataque mordisco");
	}

	@Override
	public void atacarImpactrueno() {
		System.out.println("Hola soy Pikachu y este es mi ataque impactrueno");
	}

	@Override
	public void atacarPunioTrueno() {
		System.out.println("Hola soy Pikachu y este es mi ataque puño trueno");
	}
}
