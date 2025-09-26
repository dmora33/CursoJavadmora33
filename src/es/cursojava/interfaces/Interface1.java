package es.cursojava.interfaces;
// se utilizan para dar funcionlidad a las clases, para obligar a las clas que tengan una obligada funcionalidad.

// la clase que implemente una interface esta obligada a sobre escribir los metodos de la interface.

//encontramos metodos abstracto (metodo vacio) , variables estaticas y finales aunque no lo especifiquemos

public interface Interface1 extends Interface2, Interface3 {
	int numero = 9;

	public void metodo1();

	public void metodo2(String nombre);

	// aunq no hemos puesto static final lo es por estar en una interface!!!!
}
