package es.cursojava.interfaces.ejercicios.Suscriciones;

public class ClienteVip extends Cliente implements ISuscripcionPremiun {
	String tipoFacturacion;// mensual o anual

	public ClienteVip(String nombre, String tipoFacturacion) {
		super(nombre);
		this.tipoFacturacion = tipoFacturacion;
	}

	public String getTipoFacturacion() {
		return tipoFacturacion;
	}

	public void setTipoFacturacion(String tipoFacturacion) {
		this.tipoFacturacion = tipoFacturacion;
	}

	@Override
	public void crearInformes() {
		System.out.println("cliente " + getNombre() + " creando informes");

	}

	@Override
	public void leerInformes() {
		System.out.println("cliente " + getNombre() + " leyendo informes");

	}

	@Override
	public void enviarInforme() {
		System.out.println("cliente " + getNombre() + " enviando informes");

	}

}
