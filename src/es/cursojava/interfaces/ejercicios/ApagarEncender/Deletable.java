package es.cursojava.interfaces.ejercicios.ApagarEncender;

public interface Deletable extends Insertable, Updatable {
	void delete(IdGenerator id);

}
