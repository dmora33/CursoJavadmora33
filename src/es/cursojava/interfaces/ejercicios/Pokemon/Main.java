package es.cursojava.interfaces.ejercicios.Pokemon;

import es.cursojava.interfaces.ejercicios.Pokemon.pojos.Bulbasaur;
import es.cursojava.interfaces.ejercicios.Pokemon.pojos.Charmander;
import es.cursojava.interfaces.ejercicios.Pokemon.pojos.Pikachu;
import es.cursojava.interfaces.ejercicios.Pokemon.pojos.Squirtle;

public class Main {
	public static void main(String[] args) {

		Squirtle squirtle = new Squirtle();
		Charmander charmander = new Charmander();
		Bulbasaur bulba = new Bulbasaur();
		Pikachu pika = new Pikachu();

		squirtle.atacarAraniazo();
		squirtle.atacarHidrobomba();
		charmander.atacarAraniazo();
		charmander.atacarLanzallamas();
		bulba.atacarAraniazo();
		bulba.atacarDrenaje();
		pika.atacarAraniazo();
		pika.atacarImpactrueno();

	}

}
