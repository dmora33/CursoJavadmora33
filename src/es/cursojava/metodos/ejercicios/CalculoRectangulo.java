package es.cursojava.metodos.ejercicios;

public class CalculoRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int [] medidas= {2,6};

		double[] valores = calculoRectangulo(2, 6);
	}

	public static double[] calculoRectangulo(double base, double altura) {
		double area = base * altura;
		double perimetro = 2 * (base + altura);
		double diagonal = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
		
		double[] resultado = { area, perimetro, diagonal };
		return resultado;

	}

}
