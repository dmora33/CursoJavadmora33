package es.cursojava.oo.herencia.ejercicios.bandaMusica;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Instrumento {
	private static final Logger log = LoggerFactory.getLogger(Instrumento.class);

	private String nombre;
	private String tipo;
	private boolean afinado;

	public Instrumento(String nombre, String tipo, boolean afinado) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.afinado = afinado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public boolean isAfinado() {
		return afinado;
	}

	public void setAfinado(Boolean afinado) {
		this.afinado = afinado;
	}

	// metodos

	// afinar() --> Afinando instrumento nombre, se afina o no de manera aleatoria
	// Math.random()> 0.4 --> El instrumento está afinado
	// modifico mierda de metodo para que afine hasta que el instrumento este
	// afinado.
	public void afinarTodosAfinados() {
		double valor;
		do {
			valor = Math.random();

			if (valor > 0.4) {
				log.info("El instrumento esta afinado" + getNombre());
				this.afinado = true;
			} else {
				log.info("El instrumento no esta afinado" + getNombre());
				this.afinado = false;
			}

		} while (valor < 0.4);
		setAfinado(true);
	}

	public void afinar() {
		double valor = Math.random();
		if (valor < 0.4) {
			log.info("El instrumento no esta afinado");
			this.afinado = false;
		} else {
			log.info("El instrumento esta afinado");
			this.afinado = true;
		}

	}

	// tocar() --> Tocando instrumento nombre
	public void tocar() {
		log.info("Tocando el instrumento" + this.nombre);
	}

}
