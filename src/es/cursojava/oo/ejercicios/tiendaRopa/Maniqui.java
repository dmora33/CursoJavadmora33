package es.cursojava.oo.ejercicios.tiendaRopa;

public class Maniqui {
	private int id;
	private Pantalon pantalon;
	private Camisa camisa;
	private Vestido vestido;
	private boolean estaVestido; // true con vestido false paralon y camisa

	public Maniqui() {
		super();
	}

	public Maniqui(Pantalon pantalon, Camisa camisa) {
		super();
		this.pantalon = pantalon;
		this.camisa = camisa;
	}

	public Maniqui(Vestido vestido) {
		super();
		this.vestido = vestido;
	}

	public void desvestirManiqui() {

		// me encantaría llamar al constructor por defecto!!!

		this.pantalon = null;
		this.camisa = null;
		this.vestido = null;
	}

	public void vestirManiqui(Pantalon pantalon, Camisa camisa) {
		if (!estaVestido) {
			this.pantalon = pantalon;
			this.camisa = camisa;
		} else {
			desvestirManiqui();
			this.pantalon = pantalon;
			this.camisa = camisa;
		}
		// TODO: si no ... desvestir y luego vertir de nuevo
	}

	public void vestirManiqui(Vestido vestido) {
		if (estaVestido) {

			this.vestido = vestido;
		} else {
			desvestirManiqui();
			this.vestido = vestido;
		}
	} // TODO: si no ... desvestir y luego vertir de nuevo

}
