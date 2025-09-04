package es.cursojava.oo.ejercicios.tienda;

public class UtilityMarket {
	// + calcularValorInventario(Producto[] productos) → recibe un array de
	// productos y devuelve el valor total del inventario.

	
	// Producto[] products = {product1,product2,Product3}

	public static double totalValue(Producto[] products) {
		double fullValue = 0;
		for (Producto producto : products) {
			fullValue += producto.calculateFullPrice();
		}
		return fullValue;
	}
}
