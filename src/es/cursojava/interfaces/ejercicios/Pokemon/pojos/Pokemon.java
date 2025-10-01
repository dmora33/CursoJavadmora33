package es.cursojava.interfaces.ejercicios.Pokemon.pojos;

public abstract class Pokemon {

	private int numPokedex;
	private String nombre;
	private double peso;
	private String sexo;
	private int temporada;

	public abstract void atacarPlacaje();

	public abstract void atacarAraniazo();

	public abstract void atacarMordisco();
}
