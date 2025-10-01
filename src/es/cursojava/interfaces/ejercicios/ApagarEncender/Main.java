package es.cursojava.interfaces.ejercicios.ApagarEncender;

public class Main {
	public void encendible(Encendible enciende) {
		enciende.encender();
	}

	public void apagable(Apagable apaga) {
		apaga.apagar();
	}

	public static void main(String[] args) {

		Frigorifico frigo = new Frigorifico("Frigolito", 10, "10/10/2023");
		Ramen ramen1 = new Ramen("ramen1", 5, "12/01/20352");
		Micro micro = new Micro("microhondas", 250, "12/01/2020");
		HarleyDavidson motacaMolona = new HarleyDavidson("1200cc");

		MetodosEstaticos.selectObject(ramen1);
		MetodosEstaticos.insertObject(frigo);
		MetodosEstaticos.deleteObject(motacaMolona);
		MetodosEstaticos.selectObject(micro);
		MetodosEstaticos.updateObject(motacaMolona);
	}

}
