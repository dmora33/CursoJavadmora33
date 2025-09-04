package es.cursojava.oo;

public class Persona {
	// variables de instancia HAY Q PONERLAS EN PRIVATE!!!!! AQUI NO PARA QUE NO DE
	// ERRORES
	String nombre;
	String apellidos;
	int edad;
	String dni;

	// metodo de instancia, pertenece a cada objeto. NO STATIC!!
	public void correr() {
		System.out.print(nombre + " está corriendo");
		if (edad < 70) {
			System.out.println(" rápido");
		} else {
			System.out.println(" despacio");
		}
	}

	// METODOS GETTER Y SETTER
	public String getNombre() {
		return this.nombre; // creamos el metodo para devolver el nombre
	}

	public void setNombre(String nombre) {
		this.nombre = nombre; // creamos el metodo para modificar el nombre
	}

}
