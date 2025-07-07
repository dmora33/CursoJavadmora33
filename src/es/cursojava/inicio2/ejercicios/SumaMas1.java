package es.cursojava.inicio2.ejercicios;

public class SumaMas1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 7;
		System.out.println(num);
		num = num + 1;
		System.out.println(); // 8

		num += 1;
		System.out.println(num); // 9

		System.out.println(num++);// 9 primero lo imprime y luego suma 1 SI EL ++ ESTA A LA DERCH
		System.out.println(num);// 10 aqui ya sumado 1
		System.out.println(++num); // 11 ++ A LA IZQ primero suma luego imprime

	}

}
