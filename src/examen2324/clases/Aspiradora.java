package examen2324.clases;

/**
 * Clase que va a guardar los atributos mas importantes de un mando de aspiradora
 */
public class Aspiradora extends Mando implements Velocidad {

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
	 */
	public Aspiradora(String modelo, double anchura, double altura, double precio) {
		super(modelo, anchura, altura, precio);
	}

	@Override
	/**
	 * Metodo para subir la velocidad del mando
	 * 
	 * @return Devuelve true si se ha podido y false si no ha podido
	 */
	public boolean subirVelocidad() {
		boolean sePudo = false;

		if (velocidad + 1 <= 3) {
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
		return super.toString() + ", Velocidad: " + velocidad;
	}

}
