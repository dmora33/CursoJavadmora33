package es.cursojava.interfaces.ejercicios.Suscriciones;

public class ClienteBasico extends Cliente implements ISuscripcionBasica {
private String notas;

public ClienteBasico(String nombre, String notas) {
	super(nombre);
	this.notas = notas;
}

public String getNotas() {
	return notas;
}

public void setNotas(String notas) {
	this.notas = notas;
}

@Override
public void leerInformes() {
System.out.println("cliente "+ getNombre() + " leyendo informes");	
}

@Override
public void crearInformes() {
	System.out.println("cliente "+ getNombre() + " leyendo informes");	
	
}






}
