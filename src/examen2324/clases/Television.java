package examen2324.clases;

import examen2324.exceptions.ModeloException;
import excepciones.ejercicio3.PrecioException;

/**
 * Clase que va a guardar los atributos mas importantes de un mando de
 * television
 */
public class Television extends Mando implements Volumen {

	/**
	 * Volumen del mando
	 */
	private int volumen = 0;

	/**
	 * Canal del mando
	 */
	private int canal = 0;

	/**
	 * 
	 * @param modelo  Modelo del mando
	 * @param anchura Anchura del mando
	 * @param altura  Altura del mando
	 * @param precio  Precio del mando
	 * @throws ModeloException Excepcion que salta cuando el modelo es nulo o en
	 *                         blanco
	 * @throws PrecioException Excepcion que salta cuando el precio es negativo
	 */
	public Television(String modelo, double anchura, double altura, double precio)
			throws ModeloException, PrecioException {
		super(modelo, anchura, altura, precio);
	}

	/**
	 * Metodo que devuelve el volumen del mando
	 * 
	 * @return Devuelve el volumen del mando
	 */
	public int getVolumen() {
		return volumen;
	}

	/**
	 * Metodo que devuelve el canal del mando
	 * 
	 * @return Devuelve el canal del mando
	 */
	public int getCanal() {
		return canal;
	}

	/**
	 * Metodo que cambia el canal de television
	 * 
	 * @param canal El canal por el que cambiar
	 */
	public void setCanal(int canal) {
		this.canal = canal;
	}

	/**
	 * Metodo para subir el canal del mando de 1 en 1
	 * 
	 * @return Devuelve true si se ha podido y false si no ha podido
	 */
	public boolean subirCanal() {

		boolean sePudo = false;

		if (canal + 1 <= 100) {
			sePudo = true;
			canal++;
		}

		return sePudo;
	}

	/**
	 * Metodo para bajar el canal del mando de 1 en 1
	 * 
	 * @return Devuelve true si se ha podido y false si no ha podido
	 */
	public boolean bajarCanal() {
		boolean sePudo = false;

		if (canal - 1 >= 1) {
			sePudo = true;
			canal--;
		}

		return sePudo;
	}

	@Override
	/**
	 * Metodo para subir el volumen del mando
	 * 
	 * @return Devuelve true si se ha podido y false si no ha podido
	 */
	public boolean subirVolumen() {

		boolean sePudo = false;

		if (volumen + 5 <= 100) {
			sePudo = true;
			volumen += 5;
		}

		return sePudo;
	}

	@Override
	/**
	 * Metodo para bajar el volumen del mando
	 * 
	 * @return Devuelve true si se ha podido y false si no ha podido
	 */
	public boolean bajarVolumen() {
		boolean sePudo = false;

		if (volumen - 5 >= 0) {
			sePudo = true;
			volumen -= 5;
		}

		return sePudo;
	}

	@Override
	/**
	 * Metodo para sacar como cadena el mando
	 */
	public String toString() {
		return super.toString() + ", Volumen: " + volumen + ", Canal: " + canal;
	}

}
