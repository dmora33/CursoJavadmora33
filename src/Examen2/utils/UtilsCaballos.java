package Examen2.utils;

import java.util.Random;

import Examen2.pojos.Caballo;
import Examen2.pojos.Jinete;

public class UtilsCaballos {
	// → devuelve un caballo con atributos aleatorios razonables (peso, velocidad,
	// experiencia inicial).
	static Caballo crearCaballoAleatorio(String nombreBase, Jinete jinete) {
		Random random = new Random();
		double peso = random.nextDouble(200, 300);
		int velocidad = random.nextInt(30, 80);
		int experiencia = random.nextInt(1, 10);
		Caballo caballo = new Caballo(nombreBase, peso, velocidad, experiencia, 0);
		return caballo;
	}
}
