package es.cursojava.interfaces.ejercicios.sistemaPago.pojos;

import es.cursojava.interfaces.ejercicios.sistemaPago.interfaz.Pago;

public class PagoPayPal implements Pago {

	@Override
	public void procesarPago(double monto) {
		Utils.mensajeConfirmaPago();

	}

}
