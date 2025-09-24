package es.cursojava.oo.herencia.ejercicios.hospital;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Hospital {
	private static final Logger log = LoggerFactory.getLogger(Hospital.class);
	private String nombre;
	private Habitacion[] habitaciones = new Habitacion[2];
	private Paciente[] salaDeEspera = new Paciente[3];
	private EmpleadosHospital[] empleados = new EmpleadosHospital[2];

	public Hospital(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Habitacion[] getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(Habitacion[] habitaciones) {
		this.habitaciones = habitaciones;
	}

	public Paciente[] getSalaDeEspera() {
		return salaDeEspera;
	}

	public void setSalaDeEspera(Paciente[] salaDeEspera) {
		this.salaDeEspera = salaDeEspera;
	}

	public EmpleadosHospital[] getEmpleados() {
		return empleados;
	}

	public void setEmpleados(EmpleadosHospital[] empleados) {
		this.empleados = empleados;
	}

	public void abrirHospital() {

		Paciente pac1 = new Paciente("Pepo", 34, null);
		Paciente pac2 = new Paciente("Clarisse", 37, null);
		Paciente pac3 = new Paciente("Carlitos", 55, null);
		Enfermo enfer1 = new Enfermo("Estefan", 42, "huevitis");
		Enfermero enfermero1 = new Enfermero("Marcos", 27, "tarde", 0);
		Doctor doc1 = new Doctor("Sebastián", 42, "Tarde", "cadiología");

		salaDeEspera[0] = pac1;
		salaDeEspera[1] = pac2;
		salaDeEspera[2] = pac3;

		empleados[0] = enfermero1;
		empleados[1] = doc1;

	}

	public void ficharEmpleados(EmpleadosHospital[] empleados) {
		for (EmpleadosHospital empleado : empleados) {
			empleado.fichar();
		}
	}

	public void horaComer(Paciente[] pacientes, Enfermo[] enfermos, EmpleadosHospital[] empleados) {
		for (Paciente paciente : pacientes) {
			paciente.comer();
		}
		for (EmpleadosHospital empleado : empleados) {
			empleado.comer();
		}
		for (Enfermo enfermo : enfermos) {
			enfermo.comer();
		}
	}

	public void pasarConsultas(Paciente[] salaDeEspera) {
		for (Paciente paciente : salaDeEspera) {
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
