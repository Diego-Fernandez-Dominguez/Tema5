package boletin1.ejercicio1;

/**
 * En la clase hora guardaremos los tres datos mas importantes de una fecha: Las
 * horas, los minutos y los segundos
 * 
 * @author Diego Fernandez Dominguez
 */
public class Hora {

	/**
	 * Variable que va a guardar la hora
	 */
	private int hora = 0;

	/**
	 * Variable que va a guardar los minutos
	 */
	private int minuto = 0;

	/**
	 * Constructor que construye un objeto hora
	 * 
	 * @param hora   Parametro que va a guadar la hora del objeto
	 * @param minuto Parametro que va a guadar los minutos del objeto
	 */
	public Hora(int hora, int minuto) {

		// Esta restriccion obliga a la hora a estar entre 0 y 23
		if (hora <= 23 && hora >= 0) {
			this.hora = hora;
		}

		// Esta restriccion obliga a los minutos a estar entre 0 y 59
		if (minuto <= 59 && minuto >= 0) {
			this.minuto = minuto;
		}

	}

	public int getHora() {
		return hora;
	}

	public boolean setHora(int hora) {

		boolean sePudo = false;

		if (hora <= 23 && hora >= 0) {
			this.hora = hora;
			sePudo = true;
		}
		return sePudo;
	}

	public int getMinuto() {
		return minuto;
	}

	public boolean setMinuto(int minuto) {
		boolean sePudo = false;

		if (minuto <= 59 && minuto >= 0) {
			this.minuto = minuto;
			sePudo = true;
		}
		return sePudo;
	}

	public void inc() {

		if (this.minuto == 59) {
			this.minuto = 0;

			if (this.hora == 23) {
				this.hora = 0;
			} else {
				this.hora += 1;
			}

		} else {
			this.minuto += 1;
		}

	}

	@Override
	public String toString() {
		String cadena = "";
		if (hora < 9) {
			cadena += "0" + hora + ":";
		} else {
			cadena += hora + ":";
		}
		if (minuto < 9) {
			cadena += "0" + minuto;
		} else {
			cadena += minuto + "";
		}
		return cadena;
	}

}