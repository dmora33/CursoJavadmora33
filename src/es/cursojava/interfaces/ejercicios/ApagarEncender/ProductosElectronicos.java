package es.cursojava.interfaces.ejercicios.ApagarEncender;

public abstract class ProductosElectronicos extends Producto implements Apagable, Encendible {
	private String fechaFabricacion;

	public ProductosElectronicos(String nombre, int precio,String fechaFabricacion) {
		super(nombre, precio);
		this.fechaFabricacion=fechaFabricacion;
		// TODO Auto-generated constructor stub

	}

}
