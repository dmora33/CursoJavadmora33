package es.cursojava.interfaces.ejercicios.Suscriciones;
// cambianmos la class a abstrac par que no implemente los metods de la interfaz en la clase!!!
public abstract class Cliente implements ISuscripcionGratuita {
	
	private String nombre;

	public Cliente(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
