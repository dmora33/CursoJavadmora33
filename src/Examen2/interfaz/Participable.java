package Examen2.interfaz;

@FunctionalInterface
public interface Participable {
	String getIdentificador();

	default public void participar() {
		System.out.println("Participable");
	}

}
