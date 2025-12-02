package es.cursojava.hibernate.ejercicio2.entites;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;

@Entity
public class Empleado {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer ID;
	@NotNull
	@Column(name = "NIF", unique = true)
	String NIF;

	@NotNull
	@Column(name = "NOMBRE")
	String NOMBRE;
	@NotNull
	@Column(name = "DEPARTAMENTO")
	String DEPARTAMENTO;
	@NotNull
	@DecimalMin(value = "0.0", inclusive = true)
	@Column(name = "SALARIO")
	BigDecimal SALARIO;

	public Empleado() {
		super();
	}

	public Empleado(Integer iD, @NotNull String nIF, @NotNull String nOMBRE, @NotNull String dEPARTAMENTO,
			@NotNull @DecimalMin(value = "0.0", inclusive = true) BigDecimal sALARIO) {
		super();
		ID = iD;
		NIF = nIF;
		NOMBRE = nOMBRE;
		DEPARTAMENTO = dEPARTAMENTO;
		SALARIO = sALARIO;
	}

	public Empleado(@NotNull String nIF, @NotNull String nOMBRE, @NotNull String dEPARTAMENTO,
			@NotNull @DecimalMin(value = "0.0", inclusive = true) BigDecimal sALARIO) {
		super();
		NIF = nIF;
		NOMBRE = nOMBRE;
		DEPARTAMENTO = dEPARTAMENTO;
		SALARIO = sALARIO;
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getNIF() {
		return NIF;
	}

	public void setNIF(String nIF) {
		NIF = nIF;
	}

	public String getNOMBRE() {
		return NOMBRE;
	}

	public void setNOMBRE(String nOMBRE) {
		NOMBRE = nOMBRE;
	}

	public String getDEPARTAMENTO() {
		return DEPARTAMENTO;
	}

	public void setDEPARTAMENTO(String dEPARTAMENTO) {
		DEPARTAMENTO = dEPARTAMENTO;
	}

	public BigDecimal getSALARIO() {
		return SALARIO;
	}

	public void setSALARIO(BigDecimal sALARIO) {
		SALARIO = sALARIO;
	}

	@Override
	public String toString() {
		return "Empleado [ID=" + ID + ", NIF=" + NIF + ", NOMBRE=" + NOMBRE + ", DEPARTAMENTO=" + DEPARTAMENTO
				+ ", SALARIO=" + SALARIO + "]";
	}

}
