package analisis.ejercicio1;

public class Turismo extends Vehiculo {

	enum Tipo {
		PROFESIONAL, PARTICULAR
	}

	private int numPlazas;

	private Tipo tipoUso = Tipo.valueOf("PARTICULAR");

	public Turismo(String marca, String modelo, String color, String matricula, int numPlazas, String tipo) {
		super(marca, modelo, color, matricula);

		if (numPlazas > 1) {
			this.numPlazas = numPlazas;
		}

		setTipoUso(tipo);

	}

	public int getNumPlazas() {
		return numPlazas;
	}

	public void setNumPlazas(int numPlazas) {
		this.numPlazas = numPlazas;
	}

	public Tipo getTipoUso() {
		return tipoUso;
	}

	public void setTipoUso(String tipoUso) {
		tipoUso.toUpperCase();

		switch (tipoUso) {
		case "PARTICULAR", "PROFESIONAL" -> {
			this.tipoUso = Tipo.valueOf(tipoUso);
		}
		}

	}

}
