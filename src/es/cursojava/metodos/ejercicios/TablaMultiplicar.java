package es.cursojava.metodos.ejercicios;

public class TablaMultiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("tabla de mútiplicar par el 5");
		tablaMulti1Param(5);
		System.out.println("tabla de múltipicar del 2 al 8");
		tablaMulti2Param(2, 8);
	}

	public static void tablaMulti1Param(int num) {
		for (int i = num; i <= 10; i++) {
			for (int j = 0; j <= 10; j++) {
				System.out.println(i + "x" + j + "=" + (i * j));
			}
		}
	}
	public static void tablaMulti2Param (int num1, int num2) {
		for (int i = num1; i <= num2; i++) {
			for (int j = 0; j <= 10; j++) {
				System.out.println(i + "x" + j + "=" + (i * j));
			}
		}
	}

}
