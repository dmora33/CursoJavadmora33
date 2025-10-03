package es.cursojava.interfaces.ejercicios.ApagarEncender.Utils;

import es.cursojava.interfaces.ejercicios.ApagarEncender.Interfaces.Consultable;
import es.cursojava.interfaces.ejercicios.ApagarEncender.Interfaces.Deletable;
import es.cursojava.interfaces.ejercicios.ApagarEncender.Interfaces.Insertable;
import es.cursojava.interfaces.ejercicios.ApagarEncender.Interfaces.Updatable;

public class MetodosEstaticos {

	/**
	 * @param obj de tipo Consultable
	 */

	public static void selectObject(Consultable obj) {
		obj.select();
	}

	/**
	 * @param obj de tipo Insertable
	 */
	public static void insertObject(Insertable obj) {
		obj.insert();
	}

	/**
	 * @param obj de tipo Updatable
	 */
	public static void updateObject(Updatable obj) {
		obj.update();
	}

	/**
	 * @param obj de tipo Deletable
	 */
	public static void deleteObject(Deletable obj) {
		obj.delete();
	}

}
