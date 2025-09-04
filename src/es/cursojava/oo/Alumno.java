package es.cursojava.oo;

import java.util.Arrays;

//crear metodo: estudiar ("el estudiante" + nombre + y tiene las asignaturas...
// y si su notaMedia es < 5 ha estudiado poco, si es >5 ha estudiado mucho, si
// notaMedia>9 es un genio )
public class Alumno {
	private String nombre;
	private String dni;
	private double notaMedia;
	private String[] asignaturas;

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

	public String[] getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(String[] asignaturas) {
		this.asignaturas = asignaturas;
	}

	public void datosAlumno(String comentario) {
		System.out.println("el estudiante: " + this.nombre + "\nque tiene las asignaturas:"
				+ Arrays.toString(asignaturas) + "\n" + comentario);
	}
	

	public void estudiar() {
		if (notaMedia < 5) {
			datosAlumno("ha estudiado poco");
		} else if (notaMedia > 5 && notaMedia <= 9) {
			datosAlumno("ha estudiado mucho");
		} else {
			datosAlumno("es un genio");
		}
	}

	

}
