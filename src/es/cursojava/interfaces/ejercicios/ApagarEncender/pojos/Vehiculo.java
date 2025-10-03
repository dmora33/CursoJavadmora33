package es.cursojava.interfaces.ejercicios.ApagarEncender.pojos;

import es.cursojava.interfaces.ejercicios.ApagarEncender.Utils.IdGenerator;

public abstract class Vehiculo extends IdGenerator {

    private long id;

	public Vehiculo() {
		this.id = IdGenerator.getNextId();
	}

	

    
    
}
