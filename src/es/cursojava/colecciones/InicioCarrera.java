package es.cursojava.colecciones;

public class InicioCarrera {

	public class MainRace {
		public static void main(String[] args) {
			Race race = new Race();

			race.addHorse(new FastHorse("Relámpago", 10, 20));
			race.addHorse(new StrongHorse("Trueno", 7, 30));
			race.addHorse(new FastHorse("Centella", 9, 25));

			race.startRace(); // inicia la aplicación
		}
	}

}
