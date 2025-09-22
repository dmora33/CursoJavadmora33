package es.cursojava.oo.herencia.ejercicios.hospital;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sun.org.apache.xerces.internal.parsers.XPointerParserConfiguration;

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
		Enfermo enfermo = new Enfermo(, getEdad(), especialidad)
		boolean enfermo = false;
		if ((int) (Math.random() * 10) > 8) {
			log.info("El paciente " + paciente.getNombre() + " esta enfermo");
			enfermo = true;
		} else {
			log.info("El paciente " + paciente.getNombre() + " no esta enfermo se marcha a casa");
		}
		return enfermo;
	}

}
