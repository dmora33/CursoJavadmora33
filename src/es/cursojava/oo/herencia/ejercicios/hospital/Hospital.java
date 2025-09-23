package es.cursojava.oo.herencia.ejercicios.hospital;

public class Hospital {

	private String nombre;
	private Habitacion[] habitaciones;// [2]
	private Habitacion[] salaDeEspera;// [3]

	public void abrirHospital() {

		Paciente pac1 = new Paciente("Pepo", 34, null);
		Paciente pac2 = new Paciente("Clarisse", 37, null);
		Paciente pac3 = new Paciente("Carlitos", 55, null);
		Enfermo enfer1 = new Enfermo("Estefan", 42, "huevitis");
		Doctor doc1 = new Doctor("Sebastián", 42, "Tarde", "cadiología");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
