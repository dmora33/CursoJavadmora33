package es.cursojava.colecciones;
//➡️ Explicación:
//
//Usa una lista (ArrayList) para guardar los caballos.
//
//Usa un bucle para simular la carrera, acumulando las distancias.
//
//Se detiene cuando un caballo supera los 100 metros o todos se quedan sin energía.
public class LaCarrera {
	import java.util.ArrayList;
	import java.util.List;

	public class Race {
	    private List<Horse> horses;

	    public Race() {
	        horses = new ArrayList<>();
	    }

	    public void addHorse(Horse horse) {
	        horses.add(horse);
	    }

	    public void startRace() {
	        System.out.println("🏁 ¡Comienza la carrera!\n");

	        boolean running = true;
	        int[] distances = new int[horses.size()];

	        while (running) {
	            running = false;

	            for (int i = 0; i < horses.size(); i++) {
	                Horse h = horses.get(i);
	                int step = h.runStep();
	                distances[i] += step;

	                System.out.println(h.getName() + " avanza " + step + " metros (total: " + distances[i] + ")");

	                if (distances[i] >= 100) {
	                    System.out.println("\n🎉 ¡" + h.getName() + " ha ganado la carrera!");
	                    return;
	                }

	                if (h.getEnergy() > 0) running = true;
	            }

	            System.out.println("----------------------------");
	            try { Thread.sleep(500); } catch (InterruptedException e) {}
	        }

	        System.out.println("😴 Todos los caballos se han cansado. ¡No hay ganador!");
	    }
	}

}
