package boletin1.ejercicio5;

/**
 * Clase que va a crear distintos poligonos junto con sus funciones. Esta clase
 * es abstracta ya que no es ninguna figura en especifico
 * 
 * @author Diego Fernandez Dominguez
 */
public abstract class Poligono {

	/**
	 * Atributo que va a guardar los numeros de lados de la figura
	 */
	private int numeroLados;

	/**
	 * Constructor de la clase poligono
	 * 
	 * @param numeroLados Numero de lados de la figura
	 */
	public Poligono(int numeroLados) {

		if (numeroLados >= 3) {
			this.numeroLados = numeroLados;
		}

	}

	/**
	 * Metodo getter de los numeros de lados
	 * 
	 * @return Devuelve el numero de lados
	 */
	public int getNumeroLados() {
		return numeroLados;
	}

	/**
	 * Metodo toString de la clase poligono
	 */
	public String toString() {

		return "Tiene " + numeroLados + " lado/s";

	}

	/**
	 * Metodo abstracto para obligar a las clases hijas a tener una funcion area
	 * 
	 * @return Devuelve el area el poligono
	 */
	public abstract double area();

}
