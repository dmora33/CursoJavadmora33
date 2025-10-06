package es.cursojava.interfaces.ejercicios.sistemaPago;

import es.cursojava.interfaces.ejercicios.sistemaPago.pojos.PagoCriptomoneda;
import es.cursojava.interfaces.ejercicios.sistemaPago.pojos.PagoPayPal;
import es.cursojava.interfaces.ejercicios.sistemaPago.pojos.PagoTarjetaCredito;
import es.cursojava.interfaces.ejercicios.sistemaPago.pojos.ProcesadorPagos;

public class Main {

	public static void main(String[] args) {
		PagoCriptomoneda pago1 = new PagoCriptomoneda();
		PagoPayPal pago2 = new PagoPayPal();
		PagoTarjetaCredito pago3 = new PagoTarjetaCredito();

		ProcesadorPagos.realizarPago(pago1, 21.1);
		ProcesadorPagos.realizarPago(pago3, 12.8);
		ProcesadorPagos.realizarPago(pago2, 55.25);

//		 MainPagos mp = new MainPagos();
//	     mp.metodoPago(new Pago[]{pagoPaypal,pagoTarjeta,pagoTransferencia});

	}

}
