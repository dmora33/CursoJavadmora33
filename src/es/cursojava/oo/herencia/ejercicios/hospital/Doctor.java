package es.cursojava.oo.herencia.ejercicios.hospital;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Doctor extends EmpleadosHospital {

	private static final Logger log = LoggerFactory.getLogger(Doctor.class);

	private String especialidad;

	public Doctor(String nombre, int edad, String turno, String especialidad) {
		super(nombre, edad, turno);
		this.especialidad = especialidad;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	@Override
	public String toString() {
		return "Doctor [especialidad=" + especialidad + ", getTurno()=" + getTurno() + ", getNombre()=" + getNombre()
				+ ", getEdad()=" + getEdad() + "]";
	}

	public Enfermo diagnosticarPaciente(Paciente paciente) {
		Enfermo enfermo = new Enfermo(null, 0);
		boolean estaEnfermo = Math.random() * 10 > 8;
		if (estaEnfermo) {
			log.info("El paciente " + paciente.getNombre() + " esta enfermo");
			enfermo.setNombre(paciente.getNombre());
			enfermo.setEdad(paciente.getEdad());
			enfermo.setEnfermedad(true);

		} else {
			log.info("El paciente " + paciente.getNombre() + " no esta enfermo se marcha a casa");
		}
		return enfermo;
	}

}
