package boletin1.ejercicio5;

public class Triangulo extends Poligono {

	private double lado1 = 1;

	private double lado2 = 1;

	private double lado3 = 1;

	public Triangulo() {
		super(3);
	}

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

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		if (lado1 >= 1) {
			this.lado1 = lado1;
		}
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		if (lado2 >= 1) {
			this.lado2 = lado2;
		}
	}

	public double getLado3() {
		return lado3;
	}

	public void setLado3(double lado3) {
		if (lado3 >= 1) {
			this.lado3 = lado3;
		}
	}

	public double semiperimetro() {
		return (lado1 + lado2 + lado3) / 2;
	}

	@Override
	public double area() {

		double semi = semiperimetro();

		return Math.sqrt(semi * (semi - lado1) * (semi - lado2) * (semi - lado3));
	}

	public String toString() {
		return "Triangulo: Lado1: " + lado1 + " Lado2: " + lado2 + " Lado3: " + lado3;
	}

}
