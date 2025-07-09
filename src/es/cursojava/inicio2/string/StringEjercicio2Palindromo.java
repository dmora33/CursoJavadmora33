package es.cursojava.inicio2.string;

import java.util.Scanner;

/**
 * Escribe un programa que determine si un String ingresado por el usuario es un
 * palíndromo (se lee igual de izquierda a derecha que de derecha a izquierda,
 * ignorando mayúsculas y espacios).
 * 
 */
public class StringEjercicio2Palindromo {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("dime un palindromo");
//		String palindromo = scan.nextLine();
		String palindromo ="radar";
		String palindromoInvertido = "";
		
		for (int i= palindromo.length()-1; i>=0;i--) {
			palindromoInvertido += palindromo.charAt(i);
		}
		System.out.println("palabra invertida" + palindromoInvertido);
		if (palindromo.toLowerCase().equals(palindromoInvertido.toLowerCase())) {
			
		}
//		
//		
//		int palindromoPosiciones = palindromo.length();
//		
//			for (int i = 0,int j=palindromoPosiciones; i <= palindromoPosiciones /2, j >=palindromoPosiciones/2 ; i++,j--) {
//				char caracterPrincipio = palindromo.charAt(i);
//				char caracterFinal = palindromo.charAt(j);
//				if ( caracterFinal == caracterPrincipio) { 
//					System.out.println(caracterPrincipio +""+caracterFinal+"son iguales.");
//					
//				}
//				
//			}
//			
//		
//		//for (int z = 0; z < (palindromo.length() - 1) / 2 -1; z++) {
//		//	System.out.println(palindromo.charAt(z) + "del principio");
//		//	caracterPrincipio=palindromo.charAt(z);
//		//}
////		//for (int i = palindromo.length() - 1; i >= (palindromo.length() - 1-1) / 2; i--) {
////			System.out.println(palindromo.charAt(i)+ "del final");
////			caracterFinal=palindromo.charAt(i);
////
//		//}
//	
	}

}
