package es.cursojava.oo.herencia.ejercicios.bandaMusica;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BandaMusica {
//la banda de musica es un array de Instrumentos, solo tiene el atributo Instrumento[] instrumentos

	private Instrumento[] instrumentos;
	private static final Logger log = LoggerFactory.getLogger(BandaMusica.class);

	// constructor
	public BandaMusica(Instrumento[] instrumentos) {
		this.instrumentos = instrumentos;
	}

	public void afinarInstrumentos(Instrumento[] instrumentos) {

		for (Instrumento instrumento : instrumentos) {
			instrumento.afinar();
		}

	}

	public void tocarInstrumentos(Instrumento[] instrumentos) {
		boolean desafinado = false;

		for (Instrumento instrumento : instrumentos) {
			if (!instrumento.isAfinado()) {
				desafinado = true;
			}
			instrumento.tocar();
		}
		if (desafinado) {
			log.info("La banda suena mal por que esta dafinada");
		} else {
			log.info("La banda suena armoniosa");
		}
	}

	public void empezarConcierto(BandaMusica banda) {
		log.info("Comienza el concierto!!");
		afinarInstrumentos(banda.instrumentos);
		tocarInstrumentos(banda.instrumentos);
	}

	public static void main(String[] args) {
		Piano piano = new Piano("piano1", "cuerda", false, 8, "de cola");
		Guitarra guitarra = new Guitarra("guitarra1", "cuerda", true, 6);
		GuitarraElectrica guitarraElectrica = new GuitarraElectrica("guitarra electrica 1", "cuerda", false, 6);
		Tambor tambor = new Tambor("tambor1", "percusión", false, null);
		Instrumento[] instrumentos = { piano, guitarra, guitarraElectrica, tambor };

		BandaMusica bandaMusica = new BandaMusica(instrumentos);

		bandaMusica.empezarConcierto(bandaMusica);
	}
}
