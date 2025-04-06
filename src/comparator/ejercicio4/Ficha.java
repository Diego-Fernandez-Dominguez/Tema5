package comparator.ejercicio4;

public abstract class Ficha {

	private int id;

	private String titulo;

	Ficha(int id, String titulo) {

		if (id > 0) {
			this.id = id;
		}

		if (titulo != null && !titulo.isBlank()) {
			this.titulo = titulo;
		}

	}

	public int getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public abstract int tiempoPrestamo();

	@Override
	public String toString() {

		return "ID: " + id + ", Titulo: " + titulo;

	}

}
