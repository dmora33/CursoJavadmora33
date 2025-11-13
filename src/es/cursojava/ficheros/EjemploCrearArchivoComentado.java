package es.cursojava.ficheros;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class EjemploCrearArchivoComentado {
    public static void main(String[] args) {
        // Obtenemos la fecha y hora local usando la API moderna (java.time)
        LocalDateTime datetime = LocalDateTime.now();
        // Imprimimos el objeto LocalDateTime en su representación por defecto (ej: 2025-11-13T14:23:45.123)
        System.out.println(datetime);
        // Imprimimos el año extraído del LocalDateTime (ej: 2025)
        System.out.println(datetime.getYear());
        // Imprimimos el valor numérico del mes (1..12). Ej: noviembre -> 11
        System.out.println(datetime.getMonthValue());
        // Línea comentada: getMonth() devolvería la enumeración Month (ej: NOVEMBER)
        //System.out.println(datetime.getMonth());
        
        // Construcción de una cadena con año+mes+día concatenados directamente.
        // Se convierte cada parte a String implícitamente concatenando con "" al inicio.
        // Resultado ejemplo: "20251113" (pero atención: si mes o día < 10 se concatenan sin ceros)
        String fechaStr = ""+ datetime.getYear() + datetime.getMonthValue() + datetime.getDayOfMonth();

        // Obtenemos sólo la fecha (sin hora) con la API moderna
        LocalDate date = LocalDate.now();
        // Conversión implícita a String usando toString() de LocalDate, produce "YYYY-MM-DD"
        String fechaStr2 = ""+date;

        // Obtenemos un instante en UTC (momento absoluto), distinto a LocalDateTime que es en zona local
        Instant instant = Instant.now();
        // Imprimimos el Instant en formato ISO-8601 con sufijo Z para indicar UTC
        System.out.println(instant);
        // Comentario: la línea anterior y la variable "instant" sirven para mostrar distintos tipos
        // de representación temporal (fecha/hora local vs instante UTC). Aquí no se usan para más.

        // Ruta relativa a la carpeta del proyecto (comentario suelto en el código original)

        // Creación de un objeto Date (API antigua) con la fecha/hora actual
        Date fecha = new Date();
        // Se crea un formateador de fecha de la API antigua. El patrón "dd-mm-yy" se pasa tal cual
        // al constructor de SimpleDateFormat. (Aquí solamente se crea y se usará para formatear.)
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yy"); //PELIGRO!!! mm son minutos... MM son meses
        // Se formatea la fecha actual según el patrón anterior y se guarda en una cadena
        String fechaStr3 = df.format(fecha);

        // Construcción del nombre de archivo concatenando la carpeta relativa, un prefijo y la fecha formateada
        // Ejemplo de nombre resultante: "./recursos/joseluis_13-23-25.txt" (según el patrón usado)
        String nombreArchivo = "./recursos/joseluis_"+ fechaStr3 +".txt";
        
        
        // Se crea una instancia de la clase ArchivoServicio (no incluida en este fichero)
        ArchivoServicio service = new ArchivoServicio();
        // Línea comentada: existe un método para mostrar contenido de directorio que en este caso
        // se dejó comentado. Si se descomenta, mostraría el contenido del directorio indicado.
        //service.mostrarContenidoDirectorio("C:\\Users\\Tardes\\");
        // Llamada al método crearArchivo3 pasándole el nombre de archivo construido previamente.
        // El efecto exacto depende de la implementación de ArchivoServicio.crearArchivo3.
		service.crearArchivo(nombreArchivo);
    }
}
