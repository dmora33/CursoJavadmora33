package es.cursojava.inicio2.string;
/**
 * copiar el ejercicio no esta bien resuelto.... sin comentarios, menudo churro de solución
 */
public class StringEjercicio4PalabraMasLarga {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase = "Enasd un lugar de la Mancha de "
				+ "cuyo nombre no puedo acordarme";
		// como los marcadores de las palabras usamos el espacio
		// añadimos uno al final para delimitar la última palabra.
		frase+= " ";
		
		String palabraMasLarga = "";
		// mientras longitud de frase sea mayor que la última palabra
		while (frase.length()>palabraMasLarga.length()){
			// posicion del espacio
			int  posicionBlanco = frase.indexOf(" ");
			// subfrase y 
			String palabra = frase.substring(0,posicionBlanco);
			// contamos y si es mayor la grabamos.
			if (palabra.length()>palabraMasLarga.length()) {
				palabraMasLarga = palabra;
			}
			frase = frase.substring(posicionBlanco+1);
			//System.out.println("'"+frase+"'");
			
		}
		System.out.println("La palabra más larga es: "+palabraMasLarga);

		
		
	
	}

		

		// y luego substring

	}


