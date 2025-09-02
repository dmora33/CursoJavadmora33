package es.cursojava.inicio2.ejercicios;

import java.util.Scanner;

public class PideDatos {

	public static void main(String[] args) {
		// importamos consola
		Scanner scan = new Scanner(System.in);
		// solicito dato: Solicitar dirección:
		// - nombre de calle,
		// - número
		// - población
		System.out.println("dime el nombre de la calle:");
		String nombreCalle = scan.nextLine();
		System.out.println(nombreCalle);

		System.out.println("dime el número:");
		scan = new Scanner(System.in);
		int numCalle = scan.nextInt();
		System.out.println(numCalle);

		System.out.println("dime la población:");
		scan = new Scanner(System.in);
		String poblacion = scan.nextLine();
		System.out.println(poblacion);
		// + Mostrar los datos recogidos por consola
		System.out.println("tu direccion es:");
		System.out.println(nombreCalle + " " + numCalle + ",  " + poblacion);
		// + Mostrar: "La calle es grande ": <true o false>, si el número de la calle es
		// mayor de 100 "true" en caso contrario "false"
		System.out.println(
				"La calle es grande : <true o false>, si el número de la calle es mayor de 100 en caso contrario "
						+ "false");

		boolean cond = numCalle > 100;
		System.out.println(numCalle);
		System.out.println("La calle es grande :" + cond);

		// + Generar número aleatorio e indicar el numero que se genera y si es > de 0,5
		// (poniendo true o false)
//		System.out.println("Genera un número aleatorio e indicar si el numero que se genera es mayor que 0,5");
//		double aleatorio = Math.random();// podemos añadir la condicion la podemos añadir en double aleatorio = (Math.random()>0.5)
//		boolean consAlea = aleatorio > 0.5;
//		System.out.println(aleatorio);
//		System.out.println(consAlea);
		scan.close();

		boolean numeroParImp = numCalle % 2 == 0;
		System.out.println("el número de calle es par?: " + numeroParImp);// numCalle%2 muestra el
																			// resto......numCalle%2==0 nos dice si es
																			// par

		// 

	}

}
