package es.cursojava.spring.beans.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.cursojava.spring.Operacion;
import es.cursojava.spring.beans.aspects.SoloAdmin;

@Service
public class CalculadoraService {
	private final Map<String, Operacion> operaciones = new HashMap<>();  // hacemos el new par que no de error por que si esta final tiene que inicializarse
	
	@Autowired
	public CalculadoraService(List<Operacion> operacionesList) {
		for (Operacion operacion : operacionesList) {
			operaciones.put(operacion.getSimbolo(), operacion);
		}
	}
	@SoloAdmin
	public double calcular(String simbolo, double a, double b) {
		Operacion operacion = operaciones.get(simbolo);
		if (operacion == null) {
			throw new IllegalArgumentException("Operación no soportada: " + simbolo);
		}
		return operacion.calcular(a, b);
	}
}
