package es.cursojava.colecciones;

public abstract class AnimalCaballo implements Icorrer {
	    // Atributos comunes
	    private String nomre;
	    protected int velocidad;   // velocidad base
	    protected int energia;  // energía disponible

	    //hacer constructor, get y set y tostring
	    // Método abstracto: cada tipo de caballo correrá diferente
	    public abstract int runStep();
   }

	

