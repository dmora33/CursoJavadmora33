package es.cursojava.oo.ejercicios.tiendaRopa;


public class Maniqui {
	private int id;
	private Pantalon pantalon;
	private Camisa camisa;
	private Vestido vestido;

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
		
		//me encantaria llamar al constructor por defecto!!!
		this.pantalon=null;
		this.camisa=null;
		this.vestido=null;
	}
	public void vestirManiqui(Pantalon pantalon, Camisa camisa) {
		this.pantalon=pantalon;
		this.camisa=camisa;
		}

}
