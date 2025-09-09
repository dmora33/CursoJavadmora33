package es.cursojava.oo.ejercicios.tiendaRopa;

public class Tienda {
	public String nombre;

	public String getNombre() {
		return nombre;

	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Tienda(String nombre) {
		super();
		this.nombre = nombre;
	}

	public Maniqui[] abrirTienda() {
		Boton botonNegro = new Boton("negro", 2, "grande");
		Boton botonMarrron = new Boton("marron", 2, "grande");
		// lo más preciso es crear un boton para cada uno, b1,b2,b3,b4....
		Boton[] botones3Negro = { botonNegro, botonNegro, botonNegro };
		Boton[] botones3Marron = { botonMarrron, botonMarrron, botonMarrron };

		Pantalon pantalonMarron = new Pantalon("marron", 10, "campana", "L");
		Camisa camisaLargaNegra = new Camisa("negro", 12, "L", botones3Negro);
		Vestido vestidoRojo = new Vestido("rojo", 20, "M");

		Maniqui maniqui1 = new Maniqui(1);
		Maniqui maniqui2 = new Maniqui(pantalonMarron, camisaLargaNegra, 2);
		Maniqui maniqui3 = new Maniqui(vestidoRojo, 3);

		Maniqui[] maniquis = new Maniqui[3];
		maniquis[0] = maniqui1;
		maniquis[1] = maniqui2;
		maniquis[2] = maniqui3;
		return maniquis;
	}

	public void mostrarEscaparate(Maniqui[] maniquis) {
		for (Maniqui maniqui : maniquis) {
			maniqui.mostrarManiqui();
		}
	}

	public void vestirManiqui(Maniqui[] maniquis) {

	}

	public static void main(String[] args) {

		Tienda tienda = new Tienda("tienda1");
		Maniqui[] ms = tienda.abrirTienda(); /// recuperamos el fuck array de maniquis que esta en un obj y lo añadimos
												/// en un ms en la tienda.... joder...

	}
}
