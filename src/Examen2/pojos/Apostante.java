package Examen2.pojos;

import Examen2.interfaz.Imprimible;

public class Apostante extends Persona implements Imprimible {
	private double saldo;

	public Apostante(String nombre, int edad, double saldo) {
		super(nombre, edad);
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Apostante [saldo=" + saldo + "]";
	}

	@Override
	public void imprimeDatos() {
		// TODO Auto-generated method stub

	}

}
