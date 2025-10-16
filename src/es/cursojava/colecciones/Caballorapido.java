package es.cursojava.colecciones;

public class FastHorse extends Horse {

    public FastHorse(String name, int speed, int energy) {
        super(name, speed, energy);
    }

    @Override
    public int runStep() {
        if (energy <= 0) return 0; // ya no puede correr
        int distance = speed + (int)(Math.random() * 5); //esta 5 se camnia por un 2 para los lentos
        energy -= 2; // gasta más energía
        return distance;
    }
}
