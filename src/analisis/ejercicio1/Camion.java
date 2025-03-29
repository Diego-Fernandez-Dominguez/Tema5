package analisis.ejercicio1;

public class Camion extends Vehiculo {

	private double pesoMax;

	private boolean mercanciaPeligrosa = false;

	public Camion(String marca, String modelo, String color, String matricula, double pesoMax,
			boolean mercanciaPeligrosa) {
		super(marca, modelo, color, matricula);

		if (pesoMax > 0) {
			this.pesoMax = pesoMax;
		}

		if (mercanciaPeligrosa || !mercanciaPeligrosa) {
			this.mercanciaPeligrosa = mercanciaPeligrosa;
		}

	}

	public double getPesoMax() {
		return pesoMax;
	}

	public boolean isMercanciaPeligrosa() {
		return mercanciaPeligrosa;
	}

	public void setMercanciaPeligrosa(boolean mercanciaPeligrosa) {
		this.mercanciaPeligrosa = mercanciaPeligrosa;
	}
	
	public String toString() {
		return super.toString() + ", PesoMax: " + pesoMax + ", MercanciaPeligrosa: "
				+ mercanciaPeligrosa;
	}

}
