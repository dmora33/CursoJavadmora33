package es.cursojava.oo.herencia.ejercicios.hospital;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmpleadosHospital extends Persona {

	private String turno;
	public static final Logger log = LoggerFactory.getLogger(EmpleadosHospital.class);

	public EmpleadosHospital(String nombre, int edad, String turno) {
		super(nombre, edad);
		this.turno = turno;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	@Override
	public String toString() {
		return "Empleados [turno=" + turno + ", getNombre()=" + getNombre() + ", getEdad()=" + getEdad() + "]";
	}

	@Override
	public void comer() {
		log.info("El empleado " + getNombre() + " esta coiendo en el comedor");
		;
	}

	public void fichar() {
		log.info("el empleado " + getNombre() + " esta fichando");
	}

}
