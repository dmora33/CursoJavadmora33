package es.cursojava.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import es.cursojava.spring.beans.pojo.Usuario;
import es.cursojava.spring.beans.security.SecurityContext;
import es.cursojava.spring.beans.service.CalculadoraService;

public class MainCalcuAdmin {
	public static void main(String[] args) {
		// Crear el contexto de Spring
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		// Obtener el bean de la calculadora
		CalculadoraService calculadora = context.getBean(CalculadoraService.class);
		// Caso 1: usuario ADMIN
		Usuario admin = new Usuario("Ana", "ADMIN");
		SecurityContext.setUsuarioActual(admin);
		try {
			double resultado = calculadora.calcular("+", 10, 5);
			System.out.println("Resultado para ADMIN: " + resultado);
		} catch (SecurityException e) {
			System.out.println("Error de seguridad (ADMIN): " + e.getMessage());
		}
		// Caso 2: usuario USER
		Usuario user = new Usuario("Luis", "USER");
		SecurityContext.setUsuarioActual(user);
		try {
			double resultado = calculadora.calcular("*", 10, 5);
			System.out.println("Resultado para USER: " + resultado);
		} catch (SecurityException e) {
			System.out.println("Error de seguridad (USER): " + e.getMessage());
		}
		context.close();
	}
}
