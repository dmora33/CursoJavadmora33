package es.cursojava.spring.beans.operacionesCalculadora;

import org.springframework.stereotype.Component;

import es.cursojava.spring.Operacion;
@Component("multiplicacion")
public class Multipicacion implements Operacion {

	@Override
	public double calcular(double a, double b) {
		// TODO Auto-generated method stub
		return a * b;
	}

	@Override
	public String getSimbolo() {
		// TODO Auto-generated method stub
		return "*";
	}

}
