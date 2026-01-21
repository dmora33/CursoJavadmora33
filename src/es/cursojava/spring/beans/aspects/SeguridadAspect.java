package es.cursojava.spring.beans.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import es.cursojava.spring.beans.pojo.Usuario;
import es.cursojava.spring.beans.security.SecurityContext;

@Aspect
@Component
public class SeguridadAspect {
	@Around("@annotation(SoloAdmin)")
	public Object comprobarSoloAdmin(ProceedingJoinPoint joinPoint) throws Throwable {
		Usuario usuario = SecurityContext.getUsuarioActual();
		if (usuario == null) {
			throw new SecurityException("No hay usuario autenticado. Acceso denegado.");
		}
		if (!"ADMIN".equalsIgnoreCase(usuario.getRol())) {
			String metodo = joinPoint.getSignature().toShortString();
			throw new SecurityException("Acceso denegado al método " + metodo + " para el usuario "
					+ usuario.getNombre() + " con rol " + usuario.getRol());
		}
		// Si es ADMIN, dejamos que el método se ejecute
		return joinPoint.proceed();
	}
}
//Lógica paso a paso:
//
//@Aspect: indica que esta clase define un Aspecto AOP.
//
//@Component: para que Spring la detecte como bean.
//
//@Around("@annotation(SoloAdmin)"):
//
//Es un pointcut: “intercepta cualquier método que tenga la anotación @SoloAdmin”.
//
//@Around significa que el Aspecto se ejecuta antes y después del método, y decide si el método se ejecuta o no.
//
//ProceedingJoinPoint:
//
//Representa la llamada al método original.
//
//joinPoint.proceed() → ejecuta el método real.
//
//Flujo dentro del método:
//
//Obtenemos el usuarioActual del SecurityContext.
//
//Si no hay usuario → lanzamos SecurityException.
//
//Si hay usuario pero su rol no es "ADMIN" → lanzamos SecurityException con mensaje claro.
//
//Solo si el rol es "ADMIN" → llamamos a joinPoint.proceed() y devolvemos el resultado.
//
//Clave conceptual:  
//El servicio no sabe nada de esto. La seguridad es una preocupación transversal (cross-cutting concern) que se aplica desde fuera.