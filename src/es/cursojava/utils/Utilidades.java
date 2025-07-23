package es.cursojava.utils;
//pasar un año y clacular la edad 
public class Utilidades {
	
	/**
	 * @param anioNacimiento int
	 * @return edad desde el año 2025 int
	 */
	public static int calculaEdad (int anioNacimiento) {
		
		int edad =0; 
		edad = 2025 - anioNacimiento;
		
		return edad;
	}
}
