package es.cursojava.hibernate.ejercicios.ejercicio1.entitys;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.AssertTrue;

@Entity
@Table(name = "TB_CURSO")
public class Curso {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	@Size(max = 20)
	@Column(name = "codigo", length = 20, nullable = false, unique = true)
	private String codigo;

	@NotBlank
	@Size(max = 100)
	@Column(name = "nombre", length = 100, nullable = false)
	private String nombre;

	@Size(max = 1000)
	@Column(name = "descripcion", length = 1000)
	private String descripcion;

	@NotNull
	@Min(1)
	@Column(name = "horas_totales", nullable = false)
	private Integer horasTotales;

	// Default active when a new Curso is created
	@Column(name = "activo", nullable = false)
	private boolean activo = true;

	@Size(max = 20)
	@Column(name = "nivel", length = 20)
	private String nivel;

	@Size(max = 50)
	@Column(name = "categoria", length = 50)
	private String categoria;

	@DecimalMin(value = "0.0", inclusive = true)
	@Column(name = "precio")
	private BigDecimal precio;

	@Column(name = "fecha_inicio")
	private LocalDate fechaInicio;

	@Column(name = "fecha_fin")
	private LocalDate fechaFin;

	@NotNull
	@Column(name = "fecha_creacion", nullable = false)
	private LocalDateTime fechaCreacion;

	public Curso() {
		// JPA
	}

	public Curso(String codigo, String nombre, Integer horasTotales) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.horasTotales = horasTotales;
	}

	@PrePersist
	protected void onCreate() {
		if (this.fechaCreacion == null) {
			this.fechaCreacion = LocalDateTime.now();
		}
		// Ensure activo default
		// if the field is left as default false by frameworks, set it true
		// but we initialize to true above so normally this is not required
	}

	@AssertTrue(message = "fechaFin debe ser igual o posterior a fechaInicio cuando ambas están informadas")
	private boolean isFechaFinValida() {
		if (fechaInicio == null || fechaFin == null) {
			return true;
		}
		return !fechaFin.isBefore(fechaInicio);
	}

	// Getters and setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getHorasTotales() {
		return horasTotales;
	}

	public void setHorasTotales(Integer horasTotales) {
		this.horasTotales = horasTotales;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDateTime fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Curso other = (Curso) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Curso [id=" + id + ", codigo=" + codigo + ", nombre=" + nombre + ", horasTotales="
			+ horasTotales + ", activo=" + activo + ", nivel=" + nivel + ", categoria=" + categoria
			+ ", precio=" + precio + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin
			+ ", fechaCreacion=" + fechaCreacion + "]";
	}

}