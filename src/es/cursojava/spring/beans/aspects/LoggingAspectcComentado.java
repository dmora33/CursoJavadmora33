package es.cursojava.spring.beans.aspects;
// Paquete donde se encuentra este aspecto de logging.

import org.aspectj.lang.JoinPoint;
// JoinPoint representa un punto de ejecución (método) donde se aplica el aspecto.

import org.aspectj.lang.ProceedingJoinPoint;
// ProceedingJoinPoint se usa en @Around para ejecutar el método original.

import org.aspectj.lang.annotation.*;
// Importa todas las anotaciones de AspectJ: @Aspect, @Before, @After, etc.

import org.springframework.stereotype.Component;
// Permite que Spring detecte esta clase como un bean gestionado.

@Aspect
// Indica que esta clase contiene lógica AOP (aspectos).

@Component
// Permite que Spring registre este aspecto en el contenedor.
public class LoggingAspectcComentado {

    // ============================
    // DEFINICIÓN DEL POINTCUT
    // ============================

    // Pointcut: todos los métodos dentro del paquete "service" y subpaquetes.
    // "execution(* paquete..*(..))" significa:
    // - * : cualquier tipo de retorno
    // - paquete.. : paquete y subpaquetes
    // - *(..) : cualquier método con cualquier número de argumentos
    @Pointcut("execution(* es.cursojava.spring.beans.service..*(..))")
    public void serviceLayer() {}
    // Este método no se ejecuta; solo sirve como etiqueta para el pointcut.

    // ============================
    // BEFORE ADVICE
    // ============================

    @Before("serviceLayer()")
    // Se ejecuta ANTES de cada método del pointcut.
    public void before(JoinPoint jp) {
        // jp.getSignature() → nombre del método
        // jp.getArgs() → argumentos recibidos
        System.out.println("[BEFORE] -> " + jp.getSignature() +
                " args=" + java.util.Arrays.toString(jp.getArgs()));
    }

    // ============================
    // AFTER ADVICE
    // ============================

    @After("serviceLayer()")
    // Se ejecuta SIEMPRE después del método, haya o no excepción.
    public void after(JoinPoint jp) {
        System.out.println("[AFTER]  -> " + jp.getSignature() +
                " (siempre, haya o no excepción)");
    }

    // ============================
    // AFTER RETURNING ADVICE
    // ============================

    @AfterReturning(pointcut = "serviceLayer()", returning = "result")
    // Se ejecuta SOLO si el método termina correctamente (sin excepción).
    public void afterReturning(JoinPoint jp, Object result) {
        System.out.println("[AFTER_RETURNING] -> " + jp.getSignature() +
                " result=" + result);
    }

    // ============================
    // AFTER THROWING ADVICE
    // ============================

    @AfterThrowing(pointcut = "serviceLayer()", throwing = "ex")
    // Se ejecuta SOLO si el método lanza una excepción.
    public void afterThrowing(JoinPoint jp, Throwable ex) {
        System.out.println("[AFTER_THROWING] -> " + jp.getSignature() +
                " ex=" + ex.getClass().getSimpleName() +
                " msg=" + ex.getMessage());
    }

    // ============================
    // AROUND ADVICE (el más poderoso)
    // ============================

    @Around("serviceLayer()")
    // Permite ejecutar código antes, después, capturar excepciones y medir tiempos.
    public Object around(ProceedingJoinPoint pjp) throws Throwable {

        long t0 = System.currentTimeMillis(); // Marca de tiempo inicial

        try {
            System.out.println("[AROUND - BEFORE] -> " + pjp.getSignature());

            // Ejecuta el método real del servicio
            Object res = pjp.proceed();

            System.out.println("[AROUND - AFTER RETURN] -> " + pjp.getSignature());
            return res; // Devuelve el resultado original

        } catch (Throwable ex) {
            // Si el método lanza excepción, se captura aquí
            System.out.println("[AROUND - AFTER THROW] -> " + pjp.getSignature());
            throw ex; // Se relanza la excepción para no alterar el flujo normal

        } finally {
            // Siempre se ejecuta, haya o no excepción
            long t1 = System.currentTimeMillis();
            System.out.println("[AROUND - FINALLY] -> " + pjp.getSignature() +
                    " timeMs=" + (t1 - t0));
        }
    }
}
