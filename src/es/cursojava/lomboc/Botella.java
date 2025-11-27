package es.cursojava.lomboc;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.ToString.Exclude;

@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Botella {

	public Botella(int i, String string, String string2, String string3) {
		// TODO Auto-generated constructor stub
	}
	private double capacidad;
	private String material;
	private String forma;
	@Exclude
	private String contenido;

	
	
	
	
	
}
