package es.cursojava.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import es.cursojava.spring.beans.service.CalculadoraService;

public class MainCalculadora {
	public static void main(String[] args) {
		System.out.println("Iniciando calculadora con Spring");
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        CalculadoraService calculadora =
                context.getBean(CalculadoraService.class);

        System.out.println("Suma: " + calculadora.calcular("+", 5, 3));
        System.out.println("Resta: " + calculadora.calcular("-", 5, 3));
        System.out.println("Multiplicación: " + calculadora.calcular("*", 5, 3));
        System.out.println("División: " + calculadora.calcular("/", 10, 2));
    }
}
