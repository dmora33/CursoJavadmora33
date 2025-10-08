package es.cursojava.collection.ejercicioSupermercado.metodos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import es.cursojava.collection.ejercicioSupermercado.Alimentos.Alimentos;
import es.cursojava.collection.ejercicioSupermercado.Alimentos.Hamburguesa;
import es.cursojava.collection.ejercicioSupermercado.Alimentos.Platanos;
import es.cursojava.collection.ejercicioSupermercado.Alimentos.Salmon;
import es.cursojava.collection.ejercicioSupermercado.pojos.ClienteSupermercado;

public class Metodos {

	public static void mostrarStock(List<List<Alimentos>> alimentosStock) {

		for (List<Alimentos> lista : alimentosStock) {
			// nombre de la clase de los objetos metidos en la lista
			// con getsimplename solo devuelve el nombre.
			System.out.println(lista.get(0).getClass().getSimpleName());
			System.out.println(+lista.size());
			System.out.println("------------------------------");
		}
	}

	// seleccionamos producto 1.platano 2.hamburguesa 3.salmon y cantidad

	public static void comprar(List<List<Alimentos>> alimentosStock, ClienteSupermercado cliente) {
		System.out.println("Tenemos estos productos:");
		mostrarStock(alimentosStock);
		System.out.println("Escoge producto:\n1.platano \n2.hamburguesa \n3.salmon");
		Scanner scan = new Scanner(System.in);
		int producto = scan.nextInt();

		// validamos eleccion si no esta entre 1 y 3
		while (producto < 0 || producto > 3) {
			System.out.println("Dato erroneo!! \nIntruduce un numero del 1 " + "al 3 para elegir producto");
			System.out.println("Escoge producto:\n1.platano \n2.hamburguesa \n3.salmon");
			producto = scan.nextInt();
			// FIXME: VALIDAR CANTIDAD PRODUCTO ACCEDIENDO A LAS LISTA CON SIZE Y
			// CONPARANDO!!!!!!
		}
		boolean platanoValida = (producto == 1);
		boolean hamburguesaValida = (producto == 2);
		boolean salmonValida = (producto == 3);

//FIXME: HAY Q TERMINARLO HAY QUE METER LA LISTA EN LA LISTA DEL CLIENTE!!!!! 

		System.out.println("Cantidad:");
		int cantidad = scan.nextInt();
		// boolena validarCantidad =
		if (platanoValida) {
			Platanos platano = new Platanos("Espania", 2);
			for (int i = 0; i < cantidad; i++) {
				cliente.getListaCompra().add(platano);
			}
		}
		if (hamburguesaValida) {
			Hamburguesa hamburguesa = new Hamburguesa("Espania", 7);
			for (int i = 0; i < cantidad; i++) {
				cliente.getListaCompra().add(hamburguesa);
			}
		}
		if (salmonValida) {
			Salmon salmon = new Salmon("Espania", 10);
			for (int i = 0; i < cantidad; i++) {
				cliente.getListaCompra().add(salmon);
			}
		}

	}

//boolean catidadVSstock = (cantidad < alimentosStock.getClass());

}
