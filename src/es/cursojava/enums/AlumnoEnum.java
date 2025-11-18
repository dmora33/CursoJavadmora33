package es.cursojava.enums;

public enum AlumnoEnum {
	ALUMNO1("ALUM1", "DNI", 7.5), ALUMNO2("ALUM12", "DNI2", 2.5), ALUMNO3("ALUM31", "DNI3", 5.5),
	ALUMNO4("ALUM14", "DN4I", 8.5), ALUMNO51("ALUM15", "5DNI", 2.5), ALUMNO61("6ALUM1", "6DNI", 6.5),
	ALUMNO71("ALUM17", "DNI7", 7.5), ALUMNO81("8ALUM1", "8DNI", 9.5);

	private String nombre;
	private String dni;
	private double notaMedia;

	private AlumnoEnum(String nombre, String dni, double notaMedia) {
		this.nombre = nombre;
		this.dni = dni;
		this.notaMedia = notaMedia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public double getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}

}
