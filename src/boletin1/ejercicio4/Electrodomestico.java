
package boletin1.ejercicio4;

public class Electrodomestico {

	private int precio = 100;

	private colorElec color = colorElec.BLANCO;

	private consumoElec consumoEnergetico = consumoElec.F;

	private double peso = 5;

	enum colorElec {
		BLANCO, NEGRO, ROJO, AZUL, GRIS
	}

	enum consumoElec {
		A, B, C, D, E, F
	}

	public Electrodomestico(int precio, String color, char consumoEnergetico, double peso) {

	}

	public Electrodomestico(int precio, double peso) {

	}

}
