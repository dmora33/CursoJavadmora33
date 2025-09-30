package es.cursojava.interfaces.ejercicios.ApagarEncender;

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
