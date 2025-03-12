
package boletin1.ejercicio4;

public class Electrodomestico {

	private double precio = 100;

	private ColorElec color = ColorElec.BLANCO;

	private ConsumoElec consumoEnergetico = ConsumoElec.F;

	private double peso = 5;

	enum ColorElec {
		BLANCO, NEGRO, ROJO, AZUL, GRIS
	}

	enum ConsumoElec {
		A, B, C, D, E, F
	}

	public Electrodomestico(double precio, String color, char consumoEnergetico, double peso) {

		if (peso > 0) {
			this.peso = peso;
		}

		compruebaColor(color);

		compruebaConsumo(consumoEnergetico);

		if (precio > 0) {
			this.precio = precio;
			this.precioFinal();
		}

	}

	public Electrodomestico(double precio, double peso) {

		if (precio > 0) {
			this.precio = precio;
		}

		if (peso > 0) {
			this.peso = peso;
		}
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		if (precio > 0) {
			this.precio = precio;
		}
	}

	public ColorElec getColor() {
		return color;
	}

	public void setColor(String color) {
		compruebaColor(color);
	}

	public ConsumoElec getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(char consumoEnergetico) {
		compruebaConsumo(consumoEnergetico);
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if (peso > 0) {
			this.peso = peso;
		}
	}

	private void compruebaColor(String color) {

		color = color.toUpperCase();

		switch (color) {

		case "BLANCO", "NEGRO", "ROJO", "AZUL", "GRIS" -> {
			this.color = ColorElec.valueOf(color);
		}

		}

	}

	private void compruebaConsumo(char consumo) {

		String carac = Character.toString(consumo);

		switch (carac) {

		case "A", "B", "C", "D", "E", "F" -> {
			this.consumoEnergetico = ConsumoElec.valueOf(carac);
		}
		}
	}

	public void precioFinal() {

		double precioF = precio;

		switch (String.valueOf(consumoEnergetico)) {

		case "A" -> {
			precioF += 100;
		}
		case "B" -> {
			precioF += 80;
		}
		case "C" -> {
			precioF += 60;
		}
		case "D" -> {
			precioF += 50;
		}
		case "E" -> {
			precioF += 30;
		}
		default -> {
			precioF += 10;
		}
		}

		if (this.peso <= 19) {
			precioF += 10;
		} else if (this.peso <= 49) {
			precioF += 50;
		} else if (this.peso <= 79) {
			precioF += 80;
		} else {
			precioF += 100;
		}

		this.precio = precioF;

	}

	@Override
	public String toString() {
		return precio + "€ " + color + " " + consumoEnergetico + " " + peso;
	}

}
