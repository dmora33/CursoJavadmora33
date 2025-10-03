package es.cursojava.interfaces.ejercicios.ApagarEncender.pojos;

import es.cursojava.interfaces.ejercicios.ApagarEncender.Interfaces.Apagable;
import es.cursojava.interfaces.ejercicios.ApagarEncender.Interfaces.Encendible;

public abstract class ProductosElectronicos extends Producto implements Apagable, Encendible {
	private String fechaFabricacion;

	public ProductosElectronicos(String nombre, int precio,String fechaFabricacion) {
		super(nombre, precio);
		this.fechaFabricacion=fechaFabricacion;
		// TODO Auto-generated constructor stub

	}

}
