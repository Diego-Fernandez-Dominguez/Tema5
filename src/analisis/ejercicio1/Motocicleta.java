package analisis.ejercicio1;

public class Motocicleta extends Vehiculo {

	private int cilindrada;

	private boolean carnet;

	public Motocicleta(String marca, String modelo, String color, String matricula, int cilindrada) {
		super(marca, modelo, color, matricula);

		if (cilindrada > 0) {
			this.cilindrada = cilindrada;
		}

		this.carnet = requiereCarnet();

	}
	
	public boolean isCarnet() {
		return carnet;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	private boolean requiereCarnet() {

		boolean necesario = false;

		if (this.cilindrada >= 125) {
			necesario = true;
		}

		return necesario;
	}

}
