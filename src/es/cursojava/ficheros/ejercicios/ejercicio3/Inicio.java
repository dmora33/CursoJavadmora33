package es.cursojava.ficheros.ejercicios.ejercicio3;

public class Inicio {

	public static void main(String[] args) {
// solución cutre ideal para saturar el programa con objetos string!!!!!!!!!!!!!!!!!!!
		String lista = ConsultaProductos.consultaProductos();
		String sinEspacios = lista.replace(" ", "");
		String listafinal = sinEspacios.replace(",", "|");
		System.out.println(listafinal);
		ArchivoServicio.crearArchivo3("./recursos/productos.txt", listafinal);

	}

}
