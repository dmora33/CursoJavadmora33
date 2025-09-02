package es.cursojava.inicio2.libroDeJercicios;
import java.util.Scanner;
/**
 * Leer los datos correspondiente a dos tablas de 12 elementos numéricos, y mezclarlos en una tercera de la
 * forma: 3 de la tabla A, 3 de la B, otros 3 de A, otros 3 de la B, etc.
 */
public class MezclarTablas {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int tabla1[]= new int[12];
		int tabla2[]= new int[12];
		int tablaResultado[]= new int[24];
		
		System.out.println("Tabla1 \n");
		for (int i = 0; i < tabla1.length; i++) {
			tabla1[i] = (int) (Math.random()*100);
			System.out.print(tabla1[i]+",");
			
		}
		System.out.println("");
		System.out.println("Tabla2 \n");
		for (int i = 0; i < tabla2.length; i++) {
			tabla2[i] = (int) (Math.random()*100);
			System.out.print(tabla2[i]+",");

		}
		
		// 

	}

}
