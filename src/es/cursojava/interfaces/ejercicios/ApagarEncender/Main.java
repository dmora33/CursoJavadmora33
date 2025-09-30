package es.cursojava.interfaces.ejercicios.ApagarEncender;

import es.cursojava.interfaces.ejercicios.Frigorifico;

public class Main {
	public void encendible(Encendible enciende) {
		enciende.encender();
	}

	public void apagable(Apagable apaga) {
		apaga.apagar();
	}

	public static void main(String[] args) {

		Frigorifico frigo = new Frigorifico("Frigolito", 10, "10/10/2023");

	}

}
