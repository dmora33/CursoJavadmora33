package es.cursojava.interfaces.ejercicios.Pokemon.pojos;

import es.cursojava.interfaces.ejercicios.Pokemon.Interfaces.Planta;

public class Bulbasaur extends Pokemon implements Planta {
	

	public Bulbasaur() {
		super();
	}

	@Override
	public void atacarPlacaje() {
		System.out.println("Hola soy Bulbasaur y este es mi ataque placaje");
	}

	@Override
	public void atacarAraniazo() {
		System.out.println("Hola soy Bulbasaur y este es mi ataque arañazo");
	}

	@Override
	public void atacarMordisco() {
		System.out.println("Hola soy Bulbasaur y este es mi ataque mordisco");
	}

	@Override
	public void atacarDrenaje() {
		System.out.println("Hola soy Bulbasaur y este es mi ataque drenaje");
	}

	@Override
	public void atacarParalizar() {
		System.out.println("Hola soy Bulbasaur y este es mi ataque paralizar");
	}
}
