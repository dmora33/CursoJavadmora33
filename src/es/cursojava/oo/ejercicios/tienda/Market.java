package es.cursojava.oo.ejercicios.tienda;
//En una clase llamada Tienda con main:
//
//Crea al menos 3 objetos Producto usando el constructor.
//
//Guarda los objetos en un array de productos.
//

//
public class Market {

	public static void main(String[] args) {
		Producto product1 = new Producto("Cacao", 5, 55);
		Producto product2 = new Producto("Banana", 7, 35);
		Producto Product3 = new Producto("chocolate", 10, 25);
		
		Producto[] products = {product1,product2,Product3};
		//Muestra la información de cada producto.
		
		for (Producto producto : products) {
			producto.showInfo();
		}
		//Calcula y muestra el valor total del inventario usando el método estático.

		
	double inventary= UtilityMarket.totalValue(products);
		System.out.println("valor total del inventario: "+inventary);
	}

}
