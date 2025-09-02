package es.cursojava.metodos.ejercicios;

public class BuscaNomConLetras {

	public static void main(String[] args) {
		//
		String[] nombres = { "adantiel", "marcos", "carlos", "leches", "amparito" };
		buscaNomLetras(nombres);
	}

	public static int buscaNomLetras(String[] nombres) {
		int contador = 0;
		for (String n : nombres) {
			if (n.contains("t") && n.charAt(0) == 'a') {
				System.out.println(n);

				contador++;
			}

		}
		System.out.println("el numero de nombres que \ntiene esas caracteristicas es:\t" + contador);

		return contador;

	}

}
