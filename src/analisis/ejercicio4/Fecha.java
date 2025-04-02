package analisis.ejercicio4;

/**
 * En la clase fecha guardaremos los tres datos mas importantes de una fecha:
 * Dia, mes y anyo
 * 
 * @author Diego Fernandez Dominguez
 */
public class Fecha {

	/**
	 * Dia del objeto fecha
	 */
	private int dia = 1;

	/**
	 * Mes del objeto fecha
	 */
	private int mes = 1;

	/**
	 * Anyo del objeto fecha
	 */
	private int anyo = 1991;

	/**
	 * Constructor que construye la fecha
	 * 
	 * @param dia  Parametro que guarda el dia de la fecha
	 * @param mes  Parametro que guarda el mes de la fecha
	 * @param anyo Parametro que guarda el anyo de la fecha
	 */
	public Fecha(int dia, int mes, int anyo) {
		
			this.dia = dia;
			this.mes = mes;
			this.anyo = anyo;

	}

	/**
	 * Metodo para conseguir el dia de una fecha
	 * 
	 * @return Devuelve el dia de la fecha
	 */
	public int getDia() {
		return dia;
	}

	/**
	 * Metodo para modificar el dia de la fecha
	 * 
	 * @param dia Dia de la fecha
	 */
	public void setDia(int dia) {
		this.dia = dia;
	}

	/**
	 * Metodo para conseguir el mes de una fecha
	 * 
	 * @return Devuelve el mes de la fecha
	 */
	public int getMes() {
		return mes;
	}

	/**
	 * Metodo para modificar el mes de la fecha
	 * 
	 * @param mes Mes de la fecha
	 */
	public void setMes(int mes) {
		this.mes = mes;
	}

	/**
	 * Metodo para conseguir el anyo de una fecha
	 * 
	 * @return Devuelve el anyo de la fecha
	 */
	public int getAnyo() {
		return anyo;
	}

	/**
	 * Metodo para modificar el anyo de la fecha
	 * 
	 * @param anyo Anyo de la fecha
	 */
	public void setAnyo(int anyo) {
		if (anyo > 0) {
			this.anyo = anyo;
		}

	}

	/**
	 * Metodo para sacar la fecha por pantalla
	 * 
	 * @return Devuelve una cadena con la fecha concatenada
	 */
	public String toString() {

		String cadena = "";

		if (dia < 10) {
			cadena += "0";
		}
		cadena += dia + "-";
		if (mes < 10) {
			cadena += "0";
		}

		cadena += mes + "-" + anyo;

		return cadena;

	}

}
