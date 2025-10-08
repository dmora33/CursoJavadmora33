package es.cursojava.collection.ejercicioSupermercado;

import java.util.ArrayList;
import java.util.List;

import es.cursojava.collection.ejercicioSupermercado.Alimentos.Alimentos;
import es.cursojava.collection.ejercicioSupermercado.Alimentos.Hamburguesa;
import es.cursojava.collection.ejercicioSupermercado.Alimentos.Platanos;
import es.cursojava.collection.ejercicioSupermercado.Alimentos.Salmon;
import es.cursojava.collection.ejercicioSupermercado.metodos.Metodos;
import es.cursojava.collection.ejercicioSupermercado.pojos.ClienteSupermercado;


public class Inicio {

	public static void main(String[] args) {

		// creo una lista de platanos 11

		// List<Platanos> platanosStock = new ArrayList<Platanos>();
		// para que todos puedan entrar luego en una lista de alimentos hay q
		// empezar diceindo que son alimentos y luego como platano hereda de
		// alimento podemos introducirlo en el array.
		List<Alimentos> platanosStock = new ArrayList<>();
		Platanos platano = new Platanos("Espania", 2);
		for (int i = 0; i < 11; i++) {
			platanosStock.add(platano);
		}

		// creo lista salmones 22
		List<Alimentos> salmonesStrock = new ArrayList<>();
		Salmon salmon = new Salmon("Espania", 10);
		for (int i = 0; i < 22; i++) {
			salmonesStrock.add(salmon);
		}
		// creo lista hamburguesas 30

		List<Alimentos> hamburguesasStock = new ArrayList<>();
		Hamburguesa hamburguesa = new Hamburguesa("Espania", 7);
		for (int i = 0; i < 30; i++) {
			hamburguesasStock.add(hamburguesa);
		}

		// creo la lista de alimentosStock

		List<List<Alimentos>> alimentosStock = new ArrayList<List<Alimentos>>();
		alimentosStock.add(platanosStock);
		alimentosStock.add(hamburguesasStock);
		alimentosStock.add(salmonesStrock);

		// hacemos los clientes

		ClienteSupermercado clienteArmandoBronca = new ClienteSupermercado("Armando Bronca", null);
		ClienteSupermercado clienteSegunlaLeche = new ClienteSupermercado("Segunla Leche", null);

		Metodos.mostrarStock(alimentosStock);	
	}

}
