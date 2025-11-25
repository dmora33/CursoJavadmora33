package es.cursojava.utilsDani;

public class TestUtilidades {
    public static void main(String[] args) {
        System.out.println("-- Test Utilidades --");
        System.out.println("Edad para 1990: " + Utilidades.calculaEdad(1990));
        System.out.println("Edad para 3000 (inválido): " + Utilidades.calculaEdad(3000));
        System.out.println("Nombre aleatorio: " + Utilidades.nombreAleatorio());
        System.out.println("Nombre Apellido aleatorio: " + Utilidades.nombreApellidoAleatorio());
        System.out.println("Numero aleatorio [0,10): " + Utilidades.numeroAleatorio(10));
        System.out.println("Numero aleatorio [5,15): " + Utilidades.numeroAleatorio(5,15));
        // no invocamos métodos que requieren entrada por teclado
        System.out.println("-- Test completado --");
    }
}
