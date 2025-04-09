package examen2324.clases;

import examen2324.exceptions.ModeloException;
import excepciones.ejercicio3.PrecioException;

/**
 * Clase que va a guardar los atributos mas importantes de un mando de aire acondicionado
 */
public class AireAcondicionado extends Mando implements Velocidad {

	/**
	 * Enumerado del modo del mando
	 */
	enum Modo {
		FRIO, CALOR
	}

	/**
	 * Modo del mando
	 */
	private Modo tipoModo = Modo.FRIO;

	/**
	 * Temperatura del mando
	 */
	private int temperatura = 25;

	/**
	 * Velocidad del mando
	 */
	private int velocidad = 0;

	/**
	 * 
	 * @param modelo  Modelo del mando
	 * @param anchura Anchura del mando
	 * @param altura  Altura del mando
	 * @param precio  Precio del mando
	 * @throws ModeloException Excepcion que salta cuando el modelo es nulo o en blanco
	 * @throws PrecioException Excepcion que salta cuando el precio es negativo
	 */
	public AireAcondicionado(String modelo, double anchura, double altura, double precio) throws ModeloException, PrecioException {
		super(modelo, anchura, altura, precio);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Metodo para conseguir el tipo del mando
	 * 
	 * @return Devuelve el tipo del mandos
	 */
	public Modo getTipoModo() {
		return tipoModo;
	}

	/**
	 * Metodo para cambiar el tipo de modo del mando
	 * 
	 * @param tipoModo Tipo del modo del mando
	 */
	public void setTipoModo(String tipoModo) {

		tipoModo.toUpperCase();

		switch (tipoModo) {
		case "FRIO", "CALOR" -> {
			this.tipoModo = Modo.valueOf(tipoModo);
		}

		}
	}

	/**
	 * Metodo para conseguir la temperura del mando
	 * 
	 * @return Devuele un entero con la tempertura del mando
	 */
	public int getTemperatura() {
		return temperatura;
	}

	/**
	 * Metodo para cambiar la temperatura del mando
	 * 
	 * @param temperatura Temperatura del mandos
	 */
	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}

	/**
	 * Metodo para conseguir la velocidad del mando
	 * 
	 * @return Devuele un entero con la tempertura del mando
	 */
	public int getVelocidad() {
		return velocidad;
	}

	@Override
	/**
	 * Metodo para subir la velocidad del mando
	 * 
	 * @return Devuelve true si se ha podido y false si no ha podido
	 */
	public boolean subirVelocidad() {
		boolean sePudo = false;

		if (velocidad + 1 <= 5) {
			sePudo = true;
			velocidad += 1;
		}

		return sePudo;
	}

	@Override
	/**
	 * Metodo para bajar la velocidad del mando
	 * 
	 * @return Devuelve true si se ha podido y false si no ha podido
	 */
	public boolean bajarVelocidad() {
		boolean sePudo = false;

		if (velocidad - 1 >= 0) {
			sePudo = true;
			velocidad -= 1;
		}

		return sePudo;
	}

	@Override
	/**
	 * Metodo para sacar como cadena el mando
	 */
	public String toString() {
		return super.toString() + ", Velocidad: " + velocidad + ", Modo: " + tipoModo + ", Temperatura: " + temperatura;

	}

}
