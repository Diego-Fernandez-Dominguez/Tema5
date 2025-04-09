package examen2324.clases;

import examen2324.exceptions.ModeloException;
import excepciones.ejercicio3.PrecioException;

/**
 * Clase que va a guardar los atributos mas importantes de un mando
 */
public class Mando implements Comparable<Mando> {

	/**
	 * Modelo del mando
	 */
	private String modelo;

	/**
	 * Anchura del mando
	 */
	private double anchura;

	/**
	 * Altura del mando
	 */
	private double altura;

	/**
	 * Precio del mando
	 */
	private double precio;

	/**
	 * Estado del mando
	 */
	private boolean estadoBoton = false;

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
	public Mando(String modelo, double anchura, double altura, double precio) throws ModeloException, PrecioException {

		if (modelo != null && !modelo.isBlank()) {
			this.modelo = modelo;
		} else {
			throw new ModeloException();
		}

		if (anchura >= 0) {
			this.anchura = anchura;
		}

		if (altura >= 0) {
			this.altura = altura;
		}

		if (precio >= 0) {
			this.precio = precio;
		} else {
			throw new PrecioException();
		}

	}

	/**
	 * Funcion que comprueba si el mando esta apagado, y si es asi lo enciende
	 * 
	 * @return True si se ha encendido y false si no se ha podido
	 */
	public boolean encenderMando() {

		boolean sePudo = false;

		if (!estadoBoton) {
			estadoBoton = true;
			sePudo = true;
		}

		return sePudo;

	}

	/**
	 * Funcion que comprueba si el mando esta encendido, y si es asi lo apaga
	 * 
	 * @return True si se ha apagado y false si no se ha podido
	 */
	public boolean apagarMando() {
		boolean sePudo = false;

		if (estadoBoton) {
			estadoBoton = false;
			sePudo = true;
		}

		return sePudo;

	}

	/**
	 * Devuelve el modelo del mando
	 * 
	 * @return El modelo del mando
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * Devuelve el ancho del mando
	 * 
	 * @return El ancho del mando
	 */
	public double getAnchura() {
		return anchura;
	}

	/**
	 * Devuelve el altura del mando
	 * 
	 * @return El altura del mando
	 */
	public double getAltura() {
		return altura;
	}

	/**
	 * Devuelve el precio del mando
	 * 
	 * @return El precio del mando
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * Metodo para cambiar el precio del mando
	 * 
	 * @param precio Precio a cambiar del mando, no puede ser negativo
	 * @throws PrecioException
	 */
	public void setPrecio(double precio) throws PrecioException {
		if (precio >= 0) {
			this.precio = precio;
		} else {
			throw new PrecioException();
		}
	}

	/**
	 * Metodo para devolver el estado del boton
	 * 
	 * @return Devuelve el estado del boton
	 */
	public boolean isEstadoBoton() {
		return estadoBoton;
	}

	@Override
	/**
	 * Comprueba si dos mandos son iguales. Dos mandos son iuales si tienen el mismo
	 * modelo
	 */
	public boolean equals(Object obj) {
		boolean igu = false;

		Mando mand = (Mando) obj;

		if (this.modelo.equals(mand.modelo)) {
			igu = true;
		}

		return igu;
	}

	@Override
	/**
	 * Compara dos mandos para ordenarlos. Los compara a traves del modelo
	 */
	public int compareTo(Mando o) {
		return this.modelo.compareTo(o.modelo);
	}

	@Override
	/**
	 * Saca por pantalla el mando
	 */
	public String toString() {
		return "Modelo: " + modelo + ", Anchura: " + anchura + "cm, Altura: " + altura + "cm, Estado: " + estadoBoton
				+ ", Precio: " + precio;
	}

}
