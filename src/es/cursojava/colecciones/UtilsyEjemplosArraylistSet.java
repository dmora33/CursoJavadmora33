package es.cursojava.colecciones;

public class UtilsyEjemplosArraylistSet {

//	Proyecto POO – Carrera de Caballos
//	Guía didáctica con código Java explicado (nombres en castellano)
//	Contenido:
//	1. Introducción
//	2. Análisis del problema
//	3. Diseño orientado a objetos
//	4. UML textual
//	5. Código Java (completo y comentado)
//	5.1 Interfaz: Corredor.java
//	5.2 Clase abstracta: Caballo.java
//	5.3 Clases concretas: CaballoRapido.java, CaballoFuerte.java
//	5.4 Clase Carrera.java
//	5.5 Clase Principal: PrincipalCarrera.java
//	6. Explicación detallada de conceptos POO aplicados
//	7. Cómo probar en Eclipse
//	8. Mejoras y ampliaciones sugeridas
//	1. Introducción
//	Este documento es una guía didáctica del proyecto 'Carrera de Caballos'
//	implementado en Java usando Programación Orientada a Objetos (POO). El
//	contenido incluye el análisis, diseño, diagrama UML textual, código completo en Java
//	(con nombres y comentarios en castellano) y explicaciones paso a paso. El objetivo
//	es que un desarrollador junior pueda entender, modificar y ejecutar el proyecto en
//	Eclipse.
//	2. Análisis del problema
//	Queremos simular una carrera de caballos. Cada caballo tiene nombre, velocidad y
//	energía. Existen distintos tipos de caballos (con comportamientos diferentes al
//	correr). La carrera gestiona una lista de caballos, simula pasos de carrera
//	acumulando distancia y determina el ganador cuando un caballo alcanza una
//	distancia objetivo (por ejemplo, 100 metros). Se deberán usar: clases abstractas,
//	interfaces, herencia, polimorfismo, listas (ArrayList) y encapsulamiento.
//	3. Diseño orientado a objetos
//	Clases e interfaces principales: - Interfaz: Corredor (define el método correrPaso()). -
//	Clase abstracta: Caballo (estado y métodos comunes). - Clases concretas:
//	CaballoRapido y CaballoFuerte (comportamientos distintos). - Clase Carrera:
//	gestiona la lista de caballos y la lógica de la carrera. - Clase Principal:
//	PrincipalCarrera (método main para ejecutar la simulación).
//	4. UML textual (simplificado)
//	<> Corredor
//	+ correrPaso(): int
//	abstract class Caballo implements Corredor
//	- nombre: String
//	- velocidad: int
//	- energia: int
//	+ getNombre(): String
//	+ getVelocidad(): int
//	+ getEnergia(): int
//	+ correrPaso(): int (abstract)
//	CaballoRapido extends Caballo
//	+ correrPaso(): int
//	CaballoFuerte extends Caballo
//	+ correrPaso(): int
//	Clase Carrera
//	- caballos: List
//	+ añadirCaballo(Caballo): void
//	+ iniciarCarrera(): void
//	Clase PrincipalCarrera
//	+ main(String[]): void
//	5. Código Java (completo y comentado)
//	A continuación se presentan los archivos .java con comentarios explicativos.
//	5.1 Interfaz: Corredor.java
//Corredor.java
	// La interfaz define el contrato "puede correr".
	// El método correrPaso() simula un paso de la carrera y devuelve la distancia recorrida en ese pas
//	public interface Corredor {
//	int correrPaso();
	}
	5.2 Clase abstracta: Caballo.java
	// Caballo.java
	// Clase abstracta que contiene el estado y comportamiento común a todos los caballos.
	// No se puede instanciar directamente porque correrPaso() es abstracto.
	public abstract class Caballo implements Corredor {
	private String nombre;
	protected int velocidad; // velocidad base (metros por paso)
	protected int energia; // energía restante (usa para permitir/suspender carrera)
	public Caballo(String nombre, int velocidad, int energia) {
	this.nombre = nombre;
	this.velocidad = velocidad;
	this.energia = energia;
	}
	// Encapsulamiento: getters y setters
	public String getNombre() { return nombre; }
	public int getVelocidad() { return velocidad; }
	public int getEnergia() { return energia; }
	public void setEnergia(int energia) { this.energia = energia; }
	// Método abstracto: lo implementarán las subclases según su tipo
	@Override
	public abstract int correrPaso();
	@Override
	public String toString() {
	return nombre + " [velocidad=" + velocidad + ", energia=" + energia + "]";
	}
	}
	5.3 Clases concretas: CaballoRapido.java
	// CaballoRapido.java
	// Caballo rápido: recorre más metros por paso pero gasta más energía.
	public class CaballoRapido extends Caballo {
	public CaballoRapido(String nombre, int velocidad, int energia) {
	super(nombre, velocidad, energia);
	}
	@Override
	public int correrPaso() {
	if (energia <= 0) return 0; // no puede correr si no tiene energía
	int distancia = velocidad + (int)(Math.random() * 5); // variación aleatoria
	energia -= 2; // gasta 2 unidades de energía por paso
	return distancia;
	}
	}
	5.3 Clases concretas: CaballoFuerte.java
	// CaballoFuerte.java
	// Caballo fuerte: menos velocidad por paso pero gasto de energía menor (más resistente).
	public class CaballoFuerte extends Caballo {
	public CaballoFuerte(String nombre, int velocidad, int energia) {
	super(nombre, velocidad, energia);
	}
	@Override
	public int correrPaso() {
	if (energia <= 0) return 0;
	int distancia = velocidad + (int)(Math.random() * 2);
	energia -= 1; // gasta menos energía
	return distancia;
	}
	}
	5.4 Clase Carrera.java
	// Carrera.java
	// Gestiona la lista de caballos y la lógica para simular la carrera.
	import java.util.ArrayList;
	import java.util.List;
	public class Carrera {
	private List<Caballo> caballos;
	public Carrera() {
	caballos = new ArrayList<>();
	}
	public void anadirCaballo(Caballo caballo) {
	caballos.add(caballo);
	}
	public void iniciarCarrera() {
	System.out.println("㰐 ¡Comienza la carrera!\n");
	boolean algunCorriendo = true;
	int[] distancias = new int[caballos.size()];
	final int META = 100; // distancia objetivo en metros
	while (algunCorriendo) {
	algunCorriendo = false;
	for (int i = 0; i < caballos.size(); i++) {
	Caballo c = caballos.get(i);
	int paso = c.correrPaso();
	distancias[i] += paso;
	System.out.println(c.getNombre() + " avanza " + paso + " metros (total: " + distanc
	if (distancias[i] >= META) {
	System.out.println("\n㢐 ¡" + c.getNombre() + " ha ganado la carrera!");
	return;
	}
	if (c.getEnergia() > 0) {
	algunCorriendo = true;
	}
	}
	System.out.println("----------------------------");
	try { Thread.sleep(500); } catch (InterruptedException e) {}
	}
	System.out.println("捀 Todos los caballos se han cansado. ¡No hay ganador!");
	}
	}
	5.5 Clase principal: PrincipalCarrera.java
	// PrincipalCarrera.java
	// Clase con el método main para crear la carrera, añadir caballos y arrancar la simulación.
	public class PrincipalCarrera {
	public static void main(String[] args) {
	Carrera carrera = new Carrera();
	carrera.anadirCaballo(new CaballoRapido("Relampago", 10, 20));
	carrera.anadirCaballo(new CaballoFuerte("Trueno", 7, 30));
	carrera.anadirCaballo(new CaballoRapido("Centella", 9, 25));
	carrera.iniciarCarrera();
	}
	}
	6. Explicación detallada de conceptos POO aplicados
	- Interfaces: 'Corredor' define el contrato que obliga a implementar 'correrPaso()'.
	Las interfaces permiten que diferentes clases compartan una capacidad común sin
	imponer estado. - Clases abstractas: 'Caballo' contiene estado común (nombre,
	velocidad, energia) y declara 'correrPaso()' como abstracto. No tiene sentido
	instanciar 'Caballo' genérico. - Herencia: 'CaballoRapido' y 'CaballoFuerte' heredan
	de 'Caballo', reutilizan el estado y implementan su propio comportamiento. -
	Polimorfismo: en la lista 'List' guardamos instancias de diferentes subclases; al
	llamar 'correrPaso()' se ejecuta la implementación concreta correspondiente. -
	Listas: se usa ArrayList para gestionar los caballos. - Encapsulamiento: atributos
	privados/protegidos con getters/setters para controlar el acceso.
	7. Cómo probar en Eclipse
	1. Crea un nuevo proyecto Java en Eclipse (por ejemplo: CarreraCaballos). 2. Crea un
	paquete (opcional) y añade cada archivo .java con exactamente los nombres
	indicados: - Corredor.java - Caballo.java - CaballoRapido.java - CaballoFuerte.java -
	Carrera.java - PrincipalCarrera.java 3. Compila y ejecuta PrincipalCarrera.java (Run
	as -> Java Application). 4. Observa la salida en la consola: los caballos avanzan paso
	a paso y se anuncia el ganador cuando alcanza la meta.
	8. Mejoras y ampliaciones sugeridas
	Ideas para ampliar el proyecto: - Añadir apuestas y un sistema de usuario que
	apueste por caballos. - Guardar estadísticas de cada caballo entre carreras (número
	de victorias, promedio de distancia por paso). - Reemplazar la salida por consola por
	una interfaz gráfica simple (Swing o JavaFX). - Permitir distintos terrenos que afecten
	la velocidad/consumo de energía. - Usar Sets para evitar duplicados si se necesita.
	Fin del documento
	
}
