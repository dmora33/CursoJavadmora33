package es.cursojava.ficheros.ejercicios.ejercicio3;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import es.cursojava.ficheros.ArchivoServicio;

public class EjemploCrearArchivo {
	public static void main(String[] args) {
		LocalDateTime datetime = LocalDateTime.now();
		System.out.println(datetime); // 2025-11-13T16:45:21.090498100

		System.out.println(datetime.getYear()); // 2025
		System.out.println(datetime.getMonthValue()); // 11

		// System.out.println(datetime.getMonth());

		String fechaStr = "" + datetime.getYear() + datetime.getMonthValue() + datetime.getDayOfMonth();

		LocalDate date = LocalDate.now();
		String fechaStr2 = "" + date;

		Instant instant = Instant.now();
		System.out.println(instant);
		// Ruta relativa a la carpeta del proyecto

		Date fecha = new Date();
		SimpleDateFormat df = new SimpleDateFormat("ddMMyyyy"); // PELIGRO!!! mm son minutos... MM son meses
		String fechaStr3 = df.format(fecha);

		String nombreArchivo = "./recursos/joseluis_" + fechaStr3 + ".txt";

		ArchivoServicio service = new ArchivoServicio();
		// service.mostrarContenidoDirectorio("C:\\Users\\Tardes\\");
		service.crearArchivo3(nombreArchivo, "ña");
	}
}
