import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HolaMundo {
	// poner el nombre de la clase en el log

	private static final Logger log = LoggerFactory.getLogger(HolaMundo.class);

	/**
	 * @param args "hola mundo loco", numero y edad;
	 */
	public static void main(String[] args) {

		log.warn("Que pasa loco mundo");
		System.out.println("Hola mundo LOCOOO335!!!!");
		System.out.println("Hola mundo LOCOOO33!");

		// declara una variable;
		// tipo y nombre(camelCase) de la variable;
		int numero;
		// incialización de la variable;
		numero = 9;
		// int numero = 9;
		int edad = 35;
		// concatenar distintas clases "si son todas int lo suma CUIDADO";
		System.out.println("10" + numero + edad);
		// el codigo entre parentesis se eje. antes;
		System.out.println("resultado:" + " " + (numero + edad));
		System.out.println("Hola mundo LOOO233!!!!");

	}

}
