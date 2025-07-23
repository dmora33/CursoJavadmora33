package es.cursojava.metodos.ejercicios;

public class BuscaNomConLetras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] nombres = { "daniel", "marcos", "carlos", "leches", "amparito" };
		buscaNomLetras(nombres);
	}

	public static void buscaNomLetras(String[] nombres) {

		for (String n : nombres) {
			if (n.contains("t") && n.charAt(0) == 'a') {
				System.out.println(n);
			}
		}
	}

}
