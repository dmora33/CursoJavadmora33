package es.cursojava.spring.beans.security;

import es.cursojava.spring.beans.pojo.Usuario;

//Lógica:
//
//Usamos un campo static para simplificar: toda la app ve el mismo “usuario actual”.
//
//En una app real se usaría algo más sofisticado (por hilo, por sesión, etc.), pero para el ejercicio es perfecto.
//
//El Aspecto preguntará aquí: “¿Quién es el usuario actual? ¿Qué rol tiene?”.

public class SecurityContext {
	private static Usuario usuarioActual;

	public static void setUsuarioActual(Usuario usuario) {
		usuarioActual = usuario;
	}

	public static Usuario getUsuarioActual() {
		return usuarioActual;
	}
}
