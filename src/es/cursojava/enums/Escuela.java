package es.cursojava.enums;

public class Escuela {

	public static void main(String[] args) {

	 System.out.println(AlumnoEnum.ALUMNO1.getNombre());	
	 System.out.println(AlumnoEnum.ALUMNO51.getNombre());	
	 
	 
//accedemos a todos los alumns y accedemos a su informa.
	 for (AlumnoEnum alumno : AlumnoEnum.values()) {
		
		 System.out.println(alumno.name());
		 System.out.println(alumno.ordinal()); // la posición que ocupa

	}
		System.out.println(AlumnoEnum.valueOf("ALUMNO1").getNombre()); // USAMOS EL NOMBRE COMO SI FUESE UNA LLAVE
	}

}
