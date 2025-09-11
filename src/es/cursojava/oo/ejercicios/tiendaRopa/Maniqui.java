package es.cursojava.oo.ejercicios.tiendaRopa;

import java.util.Arrays;

public class Maniqui {
	private int id;
	private Pantalon pantalon;
	private Camisa camisa;
	private Vestido vestido;
	private int estaVestido; // 0 desvestido 1 con vestido 2 paralon y camisa

	public Maniqui(int id) {
		super();

	}

	public Maniqui(Pantalon pantalon, Camisa camisa, int id) {
		super();
		this.pantalon = pantalon;
		this.camisa = camisa;
		this.estaVestido = 2;
	}

	public Maniqui(Vestido vestido, int id) {
		super();
		this.vestido = vestido;
		this.estaVestido = 1;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public Pantalon getPantalon() {
		return pantalon;
	}

	public void setPantalon(Pantalon pantalon) {
		this.pantalon = pantalon;
	}

	public Camisa getCamisa() {
		return camisa;
	}

	public void setCamisa(Camisa camisa) {
		this.camisa = camisa;
	}

	public Vestido getVestido() {
		return vestido;
	}

	public void setVestido(Vestido vestido) {
		this.vestido = vestido;
	}

	public int getEstaVestido() {
		return estaVestido;
	}

	public void setEstaVestido(int estaVestido) {
		this.estaVestido = estaVestido;
	}

	public void desvestirManiqui() {

		// me encantaría llamar al constructor por defecto!!!

		this.pantalon = null;
		this.camisa = null;
		this.vestido = null;
		this.estaVestido = 0;
	}

	public void vestirManiqui(Pantalon pantalon, Camisa camisa) {
		//NO NECESTIAS TOdO ESTO; ES MAS FACIL DESVEST DIRECTAMENTE SIN COMPRO ESTADO.
//		if (estaVestido == 0) {
//			this.pantalon = pantalon;
//			this.camisa = camisa;
//		} else {
			desvestirManiqui();
			this.pantalon = pantalon;
			this.camisa = camisa;
			this.estaVestido = 2;
	//	}

	}

	public void vestirManiqui(Vestido vestido) {
//		if (estaVestido == 0) {
//			this.vestido = vestido;
//		} else {
			desvestirManiqui();
			this.vestido = vestido;
			this.estaVestido = 1;
	//	}
	} // TODO: si no ... desvestir y luego vertir de nuevo
	public void mostrarManiqui () {

		if (getEstaVestido()==0) {
			System.out.println("\nEl maniqui esta desvestido.");
		}else if (getEstaVestido()==1) {
			System.out.println("\nVestido:\t" + getVestido());

		}else {
			System.out.println("\nCamisa\t" +  getCamisa());
			System.out.println("\nPantalon\t" + getPantalon());
			
		}
	
	}

}
