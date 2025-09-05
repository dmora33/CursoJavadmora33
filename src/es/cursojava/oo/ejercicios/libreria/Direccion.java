package es.cursojava.oo.ejercicios.libreria;

public class Direccion {
	private String street;
	private String city;
	private int zipCode;

	public Direccion() {

	}

	public Direccion(String street, String city, int zipCode) {
		super();
		this.street = street;
		this.city = city;
		this.zipCode = zipCode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setPostalCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public String showAddress() {
		return "Address[ street= " + street + "city=" + city + "";
	}
}
