package es.cursojava.inicio2.libroDeJercicios;

import java.util.Scanner;

public class NumerosAlReves {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		// 
		int t[]=new int[5];
		for (int i=0;i<5;i++)
		{
		System.out.print("Introduzca un número: ");
		t[i]=scan.nextInt();
		}
		System.out.println("Los números (en orden inverso):");
		for (int i=4;i>=0;i--)
		System.out.println(t[i]);
		scan.close();

	}
	

}
