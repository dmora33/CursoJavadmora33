package es.cursojava.interfaces.ejercicios.ejercicio1;

public class JudiasVerdes extends Verdura {
	String tipoVaina;

	public JudiasVerdes(String procedencia, String tipoVaina) {
		super(procedencia);
		this.tipoVaina = tipoVaina;
	}

	public String getTipoVaina() {
		return tipoVaina;
	}

	public void setTipoVaina(String tipoVaina) {
		this.tipoVaina = tipoVaina;
	}

}
