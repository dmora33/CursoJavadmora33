package es.cursojava.interfaces.ejercicios.ejercicio1;

public class Silla extends Mueble {

	String materia;

	public Silla(String color, String materia) {
		super(color);
		this.materia = materia;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	@Override
	public void limpiar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void desinfectar() {
		// TODO Auto-generated method stub
		
	}

	

}
