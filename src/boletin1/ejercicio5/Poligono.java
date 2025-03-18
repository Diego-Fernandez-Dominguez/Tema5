package boletin1.ejercicio5;

public abstract class Poligono {

	private int numeroLados;

	public Poligono(int numeroLados) {

		if (numeroLados >= 4) {
			this.numeroLados = numeroLados;
		}

	}

	public int getNumeroLados() {
		return numeroLados;
	}

	public String toString() {

		return "Tiene " + numeroLados + " lado/s";

	}

	public abstract double area();

}
