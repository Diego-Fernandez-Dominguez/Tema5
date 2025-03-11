package boletin1.ejercicio1;

public class HoraExacta extends Hora {

	/**
	 * 
	 */
	private int segundo;

	public HoraExacta(int hora, int minuto, int segundo) {
		super(hora, minuto);

		if (segundo <= 59 && segundo >= 0) {
			this.segundo = segundo;
		}

	}

	public boolean setSegundo(int segundo) {
		boolean sePudo = false;

		if (segundo <= 59 && segundo >= 0) {
			this.segundo = segundo;
		}

		return sePudo;
	}

	@Override
	public void inc() {

		if (this.segundo == 59) {
			this.segundo = 0;

			super.inc();

		} else {
			this.segundo += 1;
		}

	}

	public String toString() {

		String cadena = "";

		cadena = super.toString();

		if (segundo < 9) {
			cadena += ":0" + segundo;
		} else {
			cadena += ":" + segundo + "";
		}

		return cadena;

	}

}
