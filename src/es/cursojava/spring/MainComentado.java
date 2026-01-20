package es.cursojava.spring;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
// Importa el tipo de ApplicationContext que usa configuración basada en anotaciones (@Configuration).

import es.cursojava.spring.beans.SingletonBean;

public class MainComentado {
    public static void main(String[] args) {

        // Se crea un ApplicationContext basado en la clase AppConfig.
        // try-with-resources garantiza que el contexto se cierre automáticamente al final.
        try (var ctx = new AnnotationConfigApplicationContext(AppConfig.class)) {

            System.out.println("Empezamos la aplicacion Spring");

            // ================================
            // PRUEBA DE BEAN SINGLETON
            // ================================
            // Obtiene dos veces el mismo bean SingletonBean.
            // Como el scope por defecto es singleton, ambas referencias deben ser iguales.
            var a1 = ctx.getBean(es.cursojava.spring.beans.SingletonBean.class);
            var a2 = ctx.getBean(es.cursojava.spring.beans.SingletonBean.class);

            System.out.println("Singleton mismo objeto? " + (a1 == a2));

            // ================================
            // PRUEBA DE BEAN PROTOTYPE (comentado)
            // ================================
            // Si PrototypeBean está anotado con @Scope("prototype"),
            // cada llamada a getBean devuelve una instancia nueva.
            /*
            System.out.println("Probano PrototypeBean:");
            var p1 = ctx.getBean(es.cursojava.spring.beans.PrototypeBean.class);
            var p2 = ctx.getBean(es.cursojava.spring.beans.PrototypeBean.class);
            System.out.println("Prototype mismo objeto? " + (p1 == p2));
            */

            // ================================
            // PRUEBA DE BEAN LAZY (comentado)
            // ================================
            // Si LazyBean tiene @Lazy, Spring NO lo crea al iniciar el contexto,
            // sino solo cuando se solicita explícitamente.
            // y  es SINGLETON por defecto.
            /*
            System.out.println("Contexto arrancado.");
            System.out.println("Pido LazyBean...");
            ctx.getBean(es.cursojava.spring.beans.LazyBean.class);
            */

            // ================================
            // PRUEBA DE AUTOWIRING (comentado)
            // ================================
            // Demuestra cómo Spring inyecta dependencias automáticamente.
            /*
            var ts = ctx.getBean(es.cursojava.spring.beans.TicketService.class);
            System.out.println(ts.newTicketId());

            try {
                Thread.sleep(5000); // Pausa para ver si el ID cambia con el tiempo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(ts.newTicketId());
            */

            // ================================
            // PRUEBA DE CONFIGURACIÓN POR JavaConfig (comentado)
            // ================================
            // En AppConfig se definen dos beans de tipo AlumnoSpring:
            // - alumnoSpring
            // - alumnoSpringOtro
            /*
            AlumnoSpring a1 = (AlumnoSpring) ctx.getBean("alumnoSpring");
            AlumnoSpring a2 = ctx.getBean("alumnoSpringOtro", AlumnoSpring.class);

            System.out.println("a1 = " + a1);
            System.out.println("a2 = " + a2);

            System.out.println("¿Misma instancia a1? " + (a1 == ctx.getBean("alumnoSpring")));
            System.out.println("¿a1 y a2 son el mismo? " + (a1 == a2));
            */

            // ================================
            // PRUEBA DE SERVICIOS CON @Service (comentado)
            // ================================
            // Para que funcione, AulaService debe estar anotado con @Service.
            /*
            AulaService aula = ctx.getBean(AulaService.class);
            aula.mostrarAlumnos();

            AulaService2 aula2 = ctx.getBean(AulaService2.class);
            aula2.mostrarAlumnos();
            */

        } // El contexto se cierra automáticamente aquí
    }
}
