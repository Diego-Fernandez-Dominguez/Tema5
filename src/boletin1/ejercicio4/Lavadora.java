package boletin1.ejercicio4;

public class Lavadora extends Electrodomestico {

	private double carga = 5;

	public Lavadora(double precio, String color, char consumoEnergetico, double peso, double carga) {
		super(precio, color, consumoEnergetico, peso);

		if (carga > 0) {
			this.carga = carga;
		}

	}

	public Lavadora(double precio, double peso) {
		super(precio, peso);
	}

	public double getCarga() {
		return carga;
	}

	public void setCarga(double carga) {
		if (carga > 0) {
			this.carga = carga;
		}

	}

	@Override
	public void precioFinal() {

		double precioF;

		super.precioFinal();

		precioF = this.getPrecio();

		if (carga > 30) {
			precioF += 30;
		}

		this.setPrecio(precioF);

	}

	@Override
	public String toString() {
		return super.toString() + " " + carga;
	}

}
