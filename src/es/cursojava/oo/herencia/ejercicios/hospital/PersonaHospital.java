package es.cursojava.oo.herencia.ejercicios.hospital;

public  class PersonaHospital {
	private String nombre;
	private int edad;

	// constructor
	public PersonaHospital(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

// constructor por defecto vacio
	public PersonaHospital() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}

	public  void comer() {

	}

}
