package es.cursojava.spring.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PrototypeBean {
	public PrototypeBean() {
		System.out.println("CREADO PrototypeBean: " + this);
	}
}
//POR DEFECTO, LOS BEANS SON SINGLETONS EN SPRING PERO SI ES PROTOTYPE SE USA @Scope("prototype") CREA SIEMPRE UNA NUEVA INSTANCIA, CREA UN OBJETO NUEVO CADA VEZ QUE SE PIDE AL CONTEXTO.