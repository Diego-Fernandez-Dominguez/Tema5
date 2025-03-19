package boletin1.ejercicio5;

/**
 * Clase rectangulo, la cual es hija de la clase poligono. Esta clase va a
 * guardar los dos lados del triangulo
 * 
 * @author diego.fernandez
 */
public class Rectangulo extends Poligono {

	/**
	 * Atributo que va a guardar el tamaño del lado 1
	 */
	private double lado1 = 1;

	/**
	 * Atributo que va a guardar el tamaño del lado 2
	 */
	private double lado2 = 1;

	/**
	 * Constructor de rectangulo que solamente va a guardar su numero de lados
	 */
	public Rectangulo() {
		super(4);
	}

	/**
	 * Constructor de rectangulo que va a guardar su numero de lados y el tamaño de
	 * cada uno de sus lados
	 * 
	 * @param lado1 Tamaño del lado 1
	 * @param lado2 Tamaño del lado 2
	 */
	public Rectangulo(double lado1, double lado2) {
		super(4);

		if (lado1 >= 1) {
			this.lado1 = lado1;
		}

		if (lado2 >= 1) {
			this.lado2 = lado2;
		}
	}

	/**
	 * Metodo getter para obtener el lado 1 del rectangulo
	 * @return Devuelve el tamaño del lado 1 
	 */
	public double getLado1() {
		return lado1;
	}

	/**
	 * Metodo setter para cambiarle el tamaño al lado 1
	 * @param lado1 El tamaño del lado al que se quiere cambiar
	 */
	public void setLado1(double lado1) {
		if (lado1 >= 1) {
			this.lado1 = lado1;
		}
	}

	/**
	 * Metodo getter para obtener el lado 2 del rectangulo
	 * @return Devuelve el tamaño del lado 2
	 */
	public double getLado2() {
		return lado2;
	}

	/**
	 * Metodo setter para cambiarle el tamaño al lado 2
	 * @param lado2 El tamaño del lado al que se quiere cambiar
	 */
	public void setLado2(double lado2) {
		if (lado2 >= 1) {
			this.lado2 = lado2;
		}
	}

	@Override
	/**
	 * Metodo para calcular el area del rectangulo
	 * 
	 * @return Devuelve el area del rectangulo con el que se ha llamado
	 */
	public double area() {
		return lado1 * lado2;
	}

	@Override
	/**
	 * Metodo toString de la clase rectangulo, el cual sacara el tamaño de sus lados
	 */
	public String toString() {
		return "Rectangulo: Lado1: " + lado1 + " Lado2: " + lado2;
	}

}
