//🧠 Qué está demostrando este código
//Este MainCalculadora sirve para probar:
//
//✔️ Creación del contexto Spring
//Usando AnnotationConfigApplicationContext(AppConfig.class).
//
//✔️ Inyección y obtención de beans
//CalculadoraService es gestionado por Spring.
//
//✔️ Ejecución de lógica de negocio
//El método calcular() recibe un operador y dos números.
//
//✔️ Integración con AOP (si tienes LoggingAspect activo)
//Cada llamada a calcular() será interceptada por tu aspecto:
//
//@Before
//
//@After
//
//@AfterReturning
//
//@AfterThrowing
//
//@Around
//
//Esto convierte este ejemplo en un caso perfecto para ver AOP en acción.
package es.cursojava.spring;
// Paquete donde se encuentra esta clase principal.

import org.springframework.context.ApplicationContext;
// ApplicationContext es el contenedor principal de Spring: gestiona beans, dependencias, etc.

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
// Implementación de ApplicationContext que usa configuración basada en anotaciones (@Configuration).

import es.cursojava.spring.beans.service.CalculadoraService;
// Importa el servicio que contiene la lógica de cálculo.

public class MainCalculadora {

    public static void main(String[] args) {

        // Mensaje inicial para indicar que la aplicación arranca.
        System.out.println("Iniciando calculadora con Spring");

        // ============================================
        // CREACIÓN DEL CONTEXTO SPRING
        // ============================================
        // Se crea un ApplicationContext basado en la clase AppConfig.
        // AppConfig debe estar anotada con @Configuration y contener @Bean o @ComponentScan.
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        // ============================================
        // OBTENCIÓN DEL BEAN CalculadoraService
        // ============================================
        // Spring crea automáticamente una instancia de CalculadoraService
        // (si está anotado con @Service o definido como @Bean en AppConfig).
        CalculadoraService calculadora =
                context.getBean(CalculadoraService.class);

        // ============================================
        // USO DEL SERVICIO
        // ============================================
        // Se llama al método calcular() pasando el operador y los operandos.
        // Cada operación será interceptada por los aspectos AOP si están configurados.
        System.out.println("Suma: " + calculadora.calcular("+", 5, 3));
        System.out.println("Resta: " + calculadora.calcular("-", 5, 3));
        System.out.println("Multiplicación: " + calculadora.calcular("*", 5, 3));
        System.out.println("División: " + calculadora.calcular("/", 10, 2));
    }
}
