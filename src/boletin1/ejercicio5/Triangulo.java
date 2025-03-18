package boletin1.ejercicio5;

/**
 * Clase triangulo, la cual es hija de la clase poligono. Esta clase va a
 * guardar los tres lados del triangulo
 * 
 * @author diego.fernandez
 */
public class Triangulo extends Poligono {

	/**
	 * Atributo que va a guardar el lado 1 del triangulo
	 */
	private double lado1 = 1;

	/**
	 * Atributo que va a guardar el lado 2 del triangulo
	 */
	private double lado2 = 1;

	/**
	 * Atributo que va a guardar el lado 3 del triangulo
	 */
	private double lado3 = 1;

	/**
	 * Constructor de triangulo que solamente va a guardar su numero de lados
	 */
	public Triangulo() {
		super(3);
	}

	/**
	 * Constructor de triangulo que va a guardar su numero de lados y el tamaño de
	 * cada uno de sus lados
	 * 
	 * @param lado1 Tamaño del lado 1
	 * @param lado2 Tamaño del lado 2
	 * @param lado3 Tamaño del lado 3
	 */
	public Triangulo(double lado1, double lado2, double lado3) {

		super(3);

		if (lado1 >= 1) {
			this.lado1 = lado1;
		}

		if (lado2 >= 1) {
			this.lado2 = lado2;
		}

		if (lado3 >= 1) {
			this.lado3 = lado3;
		}

	}

	/**
	 * Metodo getter del lado 1
	 * 
	 * @return Devuelve el tamaño del lado 1
	 */
	public double getLado1() {
		return lado1;
	}

	/**
	 * Metodo para cambiar el tamaño del lado 1
	 * 
	 * @param lado1 Tamaño del lado 1
	 */
	public void setLado1(double lado1) {
		if (lado1 >= 1) {
			this.lado1 = lado1;
		}
	}

	/**
	 * Metodo getter del lado 2
	 * 
	 * @return Devuelve el tamaño del lado 2
	 */
	public double getLado2() {
		return lado2;
	}

	/**
	 * Metodo para cambiar el tamaño del lado 2
	 * 
	 * @param lado2 Tamaño del lado 2
	 */
	public void setLado2(double lado2) {
		if (lado2 >= 1) {
			this.lado2 = lado2;
		}
	}

	/**
	 * Metodo getter del lado 3
	 * 
	 * @return Devuelve el tamaño del lado 3
	 */
	public double getLado3() {
		return lado3;
	}

	/**
	 * Metodo para cambiar el tamaño del lado 3
	 * 
	 * @param lado3 Tamaño del lado 3
	 */
	public void setLado3(double lado3) {
		if (lado3 >= 1) {
			this.lado3 = lado3;
		}
	}

	/**
	 * Metodo para calcular el semiperimetro del triangulo
	 * 
	 * @return Devuelve el semiperimetro
	 */
	public double semiperimetro() {
		return (lado1 + lado2 + lado3) / 2;
	}

	@Override
	/**
	 * Metodo para calcular el area del triangulo
	 */
	public double area() {

		double semi = semiperimetro();

		return Math.sqrt(semi * (semi - lado1) * (semi - lado2) * (semi - lado3));
	}

	/**
	 * Metodo toString de los objetos triangulo
	 * 
	 * @return Devuelve una cadena con el tamaño de sus lados
	 */
	public String toString() {
		return "Triangulo: Lado1: " + lado1 + " Lado2: " + lado2 + " Lado3: " + lado3;
	}

}
