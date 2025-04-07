package excepciones.ejercicio2;

public class Transaccion {

	private int dia;
	private int mes;
	private int anyo;
	private String concepto;
	protected double importe;

	public Transaccion(int dia, int mes, int anyo, String concepto, double importe) {

		if (dia > 0 && dia < 32) {
			this.dia = dia;
		}

		if (mes > 0 && mes < 13) {
			this.mes = mes;
		}

		if (anyo > 0) {
			this.anyo = anyo;
		}

		if (concepto != null && !concepto.isBlank()) {
			this.concepto = concepto;
		}

		if (importe > 0) {
			this.importe = importe;
		}
	}

	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAnyo() {
		return anyo;
	}

	public String getConcepto() {
		return concepto;
	}

	public double getImporte() {
		return importe;
	}

	@Override
	public String toString() {
		return "Dia: " + dia + ", Mes: " + mes + ", Anyo: " + anyo + ", Concepto: " + concepto + ", Importe: "
				+ importe;
	}

}
