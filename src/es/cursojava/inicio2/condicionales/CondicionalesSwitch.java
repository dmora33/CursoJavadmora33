package es.cursojava.inicio2.condicionales;

import java.util.Scanner;

public class CondicionalesSwitch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
				String mes = "";
				System.out.println("Di un mes del año");
		mes = scan.nextLine();
		switch (mes) {
		case "enero" : 
		
		case "febrero" : 
		
		case "marzo" : System.out.println("Primavera");
		break;
		case "abril" : System.out.println("Primavera");
		break;
		case "mayo" : System.out.println("Primavera");
		break;
		case "junio" : System.out.println("Verano");
		break;
		case "julio" : System.out.println("Verano");
		break;
		case "agosto" : System.out.println("Verano");
		break;
		case "septiembre" : System.out.println("Otoño");
		break;
		case "octubre" : System.out.println("Otoño");
		break;
		case "noviembre" : System.out.println("Otoño");
		break;
		case "diciembre" : System.out.println("invierto");
		default : System.out.println("Mes incorrecto");
		}
		System.out.println("Temina");
		
		// 

	}

}
