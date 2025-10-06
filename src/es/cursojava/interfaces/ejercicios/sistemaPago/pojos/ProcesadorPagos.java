package es.cursojava.interfaces.ejercicios.sistemaPago.pojos;

import es.cursojava.interfaces.ejercicios.sistemaPago.interfaz.Pago;

public class ProcesadorPagos implements Pago {
	public static void realizarPago(Pago metodoPago, double monto) {
		metodoPago.procesarPago(monto);
	}

	@Override
	public void procesarPago(double monto) {
		// TODO Auto-generated method stub

	}
}
