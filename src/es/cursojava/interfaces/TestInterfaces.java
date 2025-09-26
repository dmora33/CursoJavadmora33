package es.cursojava.interfaces;

public class TestInterfaces {

	public static void main(String[] args) {

		ClasePrueba p1 = new ClasePrueba();
		p1.metodo3(null);
		
		ClaseInterfaces i1 = new ClaseInterfaces();
		
		i1.metodo1();
		i1.metodo3(null);
		
		//las interfaces puedes ser tipo tb la clase del obj. tiene que implementar la interface que estamos igualando., como int o como string
		//creo un variable i2 de tipo Interface2
		Interface2 i2 = new ClasePrueba(); //creo una variable
		
		//creo un array 
		
		Interface2[] objetos = {p1,i1};
			
	}
	public static void prueba (Interface2 i2) {
		i2.metodo3(null);
	}
}
