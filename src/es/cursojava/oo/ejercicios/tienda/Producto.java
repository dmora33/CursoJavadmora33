package es.cursojava.oo.ejercicios.tienda;

public class Producto {

	private String name;
	private double price;
	private int amount;

	public Producto(String name, double price, int amount) {
		this.name = name;
		this.price = price;
		this.amount = amount;
	}
// no hace falta introducir product por que ya esta en la misma clase tiene acceso.
	public  void  showInfo() {
		// con el this hacemos incapie en que son los datos del mismo produc.
		System.out.println(this.name + this.amount + this.amount);
			}

		//FIXME quiero cambiarlo para que me devuelva el valor no un syso,
	// seguimos utilizando this no necesito introducri nada ni darle datos.
	// recuerda qeu el metodo esta instanciado en el objeto, tiene acceso a sus datos
	public double calculateFullPrice() {
		// todo este chorro de codigo es innecesario......
//		System.out.println(this.name + "the price unit is:" + this.price + "\nproduct units:" + this.amount
//				+ "\n full prices: " + (this.amount * this.price));
//		double fullPrice = (this.amount * this.price);
//		return fullPrice;
		return this.amount*this.price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

}
