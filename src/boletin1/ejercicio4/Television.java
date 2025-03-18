package boletin1.ejercicio4;

public class Television extends Electrodomestico {

	private int resolucion = 20;

	private boolean sintonizador = false;

	public Television(double precio, String color, char consumoEnergetico, double peso, int resolucion,
			boolean sintonizador) {

		super(precio, color, consumoEnergetico, peso);

		if (resolucion > 0) {
			this.resolucion = resolucion;
		}

		this.sintonizador = sintonizador;

	}

	public Television(double precio, double peso) {
		super(precio, peso);
	}

	public int getResolucion() {
		return resolucion;
	}

	public void setResolucion(int resolucion) {
		if (resolucion > 0) {
			this.resolucion = resolucion;
		}
	}

	public boolean isSintonizador() {
		return sintonizador;
	}

	public void setSintonizador(boolean sintonizador) {
		this.sintonizador = sintonizador;
	}

	@Override
	public void precioFinal() {

		double precioF;

		super.precioFinal();

		precioF = this.getPrecio();

		if (resolucion > 40) {
			precioF += precioF * 0.3;
		}

		if (sintonizador) {
			precioF += 50;
		}

		this.setPrecio(precioF);

	}

}
