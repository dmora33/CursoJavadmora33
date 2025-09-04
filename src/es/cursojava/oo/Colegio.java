package es.cursojava.oo;

public class Colegio {
	
	
	
	
	public void estudiarAlumnos(Alumno[] alumnos) {
		for (Alumno alumno : alumnos) {
			alumno.estudiar();
		}
	}
	

	public static void main(String[] args) {
		// crear tres alumnos y ponerlos a estudiar.
		
		
		
		Alumno alumno1 = new Alumno();
		Alumno alumno2 = new Alumno();
		Alumno alumno3 = new Alumno();
		String asignaturas [] = {"Programación","Bases de datos","Sistemas","Lenguajes de Programación"};
		
		alumno1.setNombre("Márcos");
		alumno1.setDni("11111A");
		alumno1.setAsignaturas(asignaturas);
		alumno1.setNotaMedia(4.5);
		
		alumno2.setNombre("Dani");
		alumno2.setDni("11111A");
		alumno2.setAsignaturas(asignaturas);
		alumno2.setNotaMedia(9.6);
		
		alumno3.setNombre("Alba");
		alumno3.setDni("11111A");
		alumno3.setAsignaturas(asignaturas);
		alumno3.setNotaMedia(7.5);
		
		alumno1.estudiar();
		alumno2.estudiar();
		alumno3.estudiar();
		

//		crear método estudiarAlumnos al que le pasais los 3 alumnos y se pone a todos a estudiar
		// creamos un array de objetos alumno
		
		Alumno[] alumnos = {alumno1,alumno2,alumno3};
		
		// creamos un objeto colegio para poder llamar el metodo estudiarAlumnos
		Colegio c = new Colegio();
		c.estudiarAlumnos(alumnos);

		
		
		
	}

}
