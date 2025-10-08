package es.cursojava.collection.ejercicioSupermercado.pojos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import es.cursojava.collection.ejercicioSupermercado.Alimentos.Alimentos;

public class Supermercado {

	private String nombre;
	private Set<ClienteSupermercado> clientes = new HashSet<ClienteSupermercado>();
	private ArrayList<ArrayList<Alimentos>> carritoCompra = new ArrayList<ArrayList<Alimentos>>();

}
