package es.cursojava.enums;

import java.util.HashMap;
import java.util.Map;

import es.cursojava.examenmodulo2.pojos.Caballo;
import es.cursojava.examenmodulo2.pojos.Jinete;

public class CrearCuadra {

	public static void main(String[] args) {
		CaballosEnum[] cuadra = CaballosEnum.values();// lo metemos todo
		Map<Jinete, Caballo> cuadraMap = new HashMap<>();

		for (CaballosEnum caballo : cuadra) {
			// leer lso datos y generar los datos del jinete y del caballo
			System.out.println(caballo.getAniosExperiencia() + caballo.getIdentificador());
			Jinete jinete = new Jinete(caballo.getIdentificador(), caballo.getAniosExperiencia());
			System.out.println(jinete.getIdentificador() + jinete.getAniosExperiencia());
			Caballo caballito = new Caballo(caballo.getNombre(), caballo.getPeso(), caballo.getVelocidad(),
					caballo.getExperiencia(), jinete);
			cuadraMap.put(jinete, caballito);

		}
		for (Map.Entry<Jinete, Caballo> entry : cuadraMap.entrySet()) {
			System.out.println("Jinete: " + entry.getKey());
			System.out.println("Caballo: " + entry.getValue());
			System.out.println("---------------------");
		}

	}

}
