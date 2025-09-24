package es.cursojava.oo.herencia.ejercicios.hospital;

public class Enfermero extends EmpleadosHospital {

	private int planta;

	public Enfermero(String nombre, int edad, String turno, int planta) {
		super(nombre, edad, turno);
		this.planta = planta;
	}

	public int getPlanta() {
		return planta;
	}

	public void setPlanta(int planta) {
		this.planta = planta;
	}

	@Override
	public String toString() {
		return "Enfermero [planta=" + planta + ", getTurno()=" + getTurno() + ", getNombre()=" + getNombre()
				+ ", getEdad()=" + getEdad() + "]";
	}

//	public Paciente  atenderPaciente (Paciente[] salaDeEspera) {
//		
//		for
//		
//	}
}
