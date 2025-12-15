package es.cursojava.hibernate.ejercicioOneToManyFichero.entites;

import es.cursojava.hibernate.ejercicio1.entites.Curso;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "TB_ALUMNO")
public class Alumno {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotNull
	@NotBlank
	@Size(max = 100)
	@Column(name = "nombre", nullable = false, unique = false, length = 100)
	private String nombre;
	@NotNull
	@NotBlank
	@Size(max = 100)
	@Column(name = "email", nullable = false, unique = true, length = 100)
	private String email;
	@NotNull
	@Min(1)
	@Column(name = "edad", nullable = false)
	private Integer edad;
	
	@ManyToOne
    @JoinColumn(name = "curso_id", nullable = false)
    private Curso curso;

	// Constructor vacío (requerido por Hibernate)
	public Alumno() {
	}

	// Constructor opcional
	public Alumno(String nombre, String email, Integer edad) {
		this.nombre = nombre;
		this.email = email;
		this.edad = edad;
	}

	// Getters y Setters
	public Long getId() {
		return id;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	// toString()
	@Override
	public String toString() {
		return "Alumno [id=" + id + ", nombre=" + nombre + ", email=" + email + ", edad=" + edad + ", curso=" + curso
				+ "]";
	}

	
	
}
