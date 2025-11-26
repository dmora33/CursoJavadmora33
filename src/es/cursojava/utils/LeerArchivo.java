package es.cursojava.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LeerArchivo {
	public static List<String> leerFichero(String ruta) {
		Path path = Paths.get(ruta);

		List<String> lines = null;
		try {
			lines = Files.readAllLines(path); 
			//el metodo readAllLines devuelve un List<String>
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return lines;
	}

}
