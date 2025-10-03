package es.cursojava.interfaces.ejercicios.ApagarEncender.pojos;

import es.cursojava.interfaces.ejercicios.ApagarEncender.Interfaces.Apagable;
import es.cursojava.interfaces.ejercicios.ApagarEncender.Interfaces.Encendible;

public abstract class VehiculosMotorizado extends Vehiculo implements Apagable, Encendible {
	
	

	
	public VehiculosMotorizado(String motor) {
		super();
		this.motor=motor;
		// TODO Auto-generated constructor stub
	}


	private String motor;

	
	


	public String getMotor() {
		return motor;
	}


	public void setMotor(String motor) {
		this.motor = motor;
	}
	
	
	
}
