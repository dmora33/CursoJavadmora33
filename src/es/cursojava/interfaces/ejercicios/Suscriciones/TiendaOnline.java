package es.cursojava.interfaces.ejercicios.Suscriciones;

import java.util.ArrayList;
import java.util.List;

public class TiendaOnline {
	private String url;

	public static void main(String[] args) {
		// Cliente c = new Cliente("cliente1");
		ISuscripcionGratuita gratis = new ClienteBasico("cliente3", "notas3");

		// List<String> listados = new ArrayList<String>();

		ClienteBasico cb = new ClienteBasico("cliente2", "notas2");
		leerInformes(cb);
		crearInformes(cb);
		// enviarInformes(cb); // da error por que no tiene pagado esa funcionalidad de
		// vip , solo

		Piloto p1 = new Piloto("piloto1", 1200);// y qui me he quedado no se para que creamos este ogjeto...

		leerInformes(p1);

		ClienteVip vip = new ClienteVip("vip1", "mensual");
		// gracias a la interfaz tiene acceso a todos los metodos
		leerInformes(vip);
		crearInformes(vip);
		enciarInformes(vip);

	}

	// al utilzar la ininterfaz como clase le obligamos a implementer y se puede
	// usar el metodo...una puta rallada
	private static void leerInformes(ISuscripcionGratuita cliente) {
		cliente.leerInformes();

	}

	private static void crearInformes(ISuscripcionBasica cliente) {
		cliente.crearInformes();
	}

	private static void enciarInformes(ISuscripcionPremiun cliente) {
		cliente.enviarInforme();
	}

}
