package es.cursojava.excepciones.ejercicios.ejercicio1;

import java.util.Arrays;
import java.util.Set;

import es.cursojava.excepciones.ejercicios.ejercicio1.NotaInvalidaExecption;

//crear metodo: estudiar ("el estudiante" + nombre + y tiene las asignaturas...
// y si su notaMedia es < 5 ha estudiado poco, si es >5 ha estudiado mucho, si
// notaMedia>9 es un genio )
public class AlumnoException {
	private String nombre;
	private String dni;
	private double notaMedia;
	private String[] asignaturas;
	private int edad;

	public AlumnoException() {

	}

	public AlumnoException(String nombre, String dni, int edad) throws IllegalAccessException, NotaInvalidaExecption {
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
		if (edad < 0) {
			IllegalAccessException iae = new IllegalAccessException("no puede ser menor de 0");
			throw iae;
		} else if (edad >= 0 && edad < 11) {
			NotaInvalidaExecption nie = new NotaInvalidaExecption("edad de 0 a diez");
			throw nie;
		}

	}

	public AlumnoException(int edad) throws IllegalAccessException, NotaInvalidaExecption {

		this.edad = edad;
		if (edad < 0) {
			IllegalAccessException iae = new IllegalAccessException("no puede ser menor de 0");
			throw iae;
		} else if (edad >= 0 && edad < 11) {
			NotaInvalidaExecption nie = new NotaInvalidaExecption("edad de 0 a diez");
			throw nie;
		}

	}

	public AlumnoException(String nombre, String dni, double notaMedia, String[] asignaturas) {
		this.nombre = nombre;
		this.dni = dni;
		this.notaMedia = notaMedia;
		this.asignaturas = asignaturas;
	}

	public AlumnoException(String nombre, String dni, double notaMedia) {
		super();
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

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", dni=" + dni + ", notaMedia=" + notaMedia + ", asignaturas="
				+ Arrays.toString(asignaturas) + "]";
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

	public static Set<AlumnoException> subList(double d) {
		// TODO Auto-generated method stub
		return null;
	}

}
