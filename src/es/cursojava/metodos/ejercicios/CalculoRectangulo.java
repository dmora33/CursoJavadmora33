package es.cursojava.metodos.ejercicios;

import java.util.Arrays;

public class CalculoRectangulo {

	public static void main(String[] args) {
		// 
//int [] medidas= {2,6};

		//double[] valores = calculoRectangulo(2, 6);
		//System.out.println(Arrays.toString(valores) );
		
		// utilizo el metodo dentro del foreach!!!!!!
		for (double dato : calculoRectangulo(2,6)) {
			System.out.println(dato);
		}
	}

	public static double[] calculoRectangulo(double base, double altura) {
		//double [] resultado = new doble[3];
		double area = base * altura;
		double perimetro = 2 * (base + altura);
		//metodo pow (nombre valor, 2 es al cuadrado)
		double diagonal = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
		
		double[] resultado = { area, perimetro, diagonal };
		
		return resultado;

	}

}
