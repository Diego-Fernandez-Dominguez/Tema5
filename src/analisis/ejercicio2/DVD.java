package analisis.ejercicio2;

public class DVD extends Ficha {

	enum TipoDVD {
		PELICULA, DOCUMENTAL, SERIE
	}

	private String director;
	private int anyo;
	private TipoDVD tipo = TipoDVD.PELICULA;

	DVD(int id, String titulo, String director, int anyo, String tipo) {
		super(id, titulo);

		if (director != null && !director.isBlank()) {
			this.director = director;
		}

		if (anyo > 0) {
			this.anyo = anyo;
		}

	}

	public String getDirector() {
		return director;
	}

	public int getAnyo() {
		return anyo;
	}

	public TipoDVD getTipo() {
		return tipo;
	}

	public void setTipoDVD(String tipo) {

		tipo.toUpperCase();

		switch (tipo) {
		case "PELICULA", "DOCUMENTAL", "SERIE" -> {
			this.tipo = TipoDVD.valueOf(tipo);
		}
		}
	}

	@Override
	public String toString() {
		return super.toString() + ", Director: " + director + ", Anyo: " + anyo + ", Tipo: " + String.valueOf(tipo);
	}

}
