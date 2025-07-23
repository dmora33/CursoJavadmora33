package es.cursojava.metodos;

public class EjemplosMetodos {

	public static void main(String[] args) {

		System.out.println("empeiza");
		metodo1();
		String name = "juan";
		System.out.println(name);
		metodo2(name);
		System.out.println(name);

		System.out.println("temina");
	}

	// declaracion de metodo1
	public static void metodo1() {
		System.out.println("llamado método1");
	}

//par que guardar el nombre de maria en todo el programa.. necesito devolver el nombre de maira al string inicial
	public static String metodo2(String nombre) {
		System.out.println(nombre);
		nombre = "maria";
		System.out.println(nombre);
		return nombre;

	}

	public static void metodo3(int numero) {
		System.out.println(numero);
		numero = 7;
		System.out.println(numero);
	}
}
