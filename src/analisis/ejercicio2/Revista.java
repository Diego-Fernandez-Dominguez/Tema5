package analisis.ejercicio2;

public class Revista extends Ficha {

	private int numRevista;
	private int anyo;

	Revista(int id, String titulo, int numRevista, int anyo) {
		super(id, titulo);

		if (numRevista > 0) {
			this.numRevista = numRevista;
		}

		if (anyo > 0) {
			this.anyo = anyo;
		}
	}

	public int getNumRevista() {
		return numRevista;
	}

	public int getAnyo() {
		return anyo;
	}

	@Override
	public String toString() {
		return super.toString() + ", NumRevista: " + numRevista + ", Anyo: " + anyo;
	}

}
