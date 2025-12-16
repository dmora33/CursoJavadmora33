package es.cursojava.lambdas.ejemplo;

import java.util.ArrayList;
import java.util.List;

public class MainComparaCadenas {

	public static void main(String[] args) {

		
		ComparaCadenas comparaLongitud = (s1) -> s1.length() > 5;
		ComparaCadenas comparaTeto = (s1) -> s1.contains("Hola");  // si tiene mas de una linea de codigo
		                                                        // se usan llaves {} ejemplo:
																// ComparaCadenas comparaTeto = (s1) -> { s1 = s1.toLowerCase();		
																//    return s1.contains("Hola");	
																// };
			
		String cadena = "Holi Mundo";
		String cadena2 = "Hola";
		
		System.out.println("La cadena: \"" + cadena + "\" tiene más de 5 caracteres? " + comparaLongitud.coparar(cadena));
		System.out.println("La cadena: \"" + cadena2 + "\" tiene más de 5 caracteres? " + comparaLongitud.coparar(cadena2));
		
		System.out.println("La cadena: \"" + cadena + "\" contiene la palabra 'Hola'? " + comparaTeto.coparar(cadena));
		System.out.println("La cadena: \"" + cadena2 + "\" contiene la palabra 'Hola'? " + comparaTeto.coparar(cadena2));
		
		GeneraMensaje generaMensaje = () -> System.out.println("Hola desde el interfaz funcional GeneraMensaje"); 	// si solo es una linea de codigo no hacen falta llaves {}
			generaMensaje.mensaje();
			
			
			List<String> listaColores = new ArrayList<>();
			listaColores.add("Rojo");
			listaColores.add("Verde");
			listaColores.add("Az");
			
			listaColores.forEach(color -> System.out.println("Color: " + color)); //"color: " es el parametro que recibe el lambda expression
			
			listaColores.removeIf(color -> color.startsWith("V")); // elimina los colores que empiecen por "V"
			
			listaColores.stream()
				.filter(color -> color.length() > 3) // filtra los colores que tienen mas de 3 letras
				.forEach(color -> System.out.println("Color filtrado: " + color));
			

		
	}

}
