package interfaces.ejercicio1;

public class Socio implements Comparable<Socio> {

	private int id;

	private String nombre;

	private int edad;

	public Socio(int id, String nombre, int edad) {

		if (id >= 1) {
			this.id = id;
		}

		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}

		if (edad >= 18) {
			this.edad = edad;
		}
	}

	@Override
	public String toString() {
		return id + " " + nombre + " " + edad;
	}

	@Override
	public int compareTo(Socio soc) {

		int res = 0;

		if (this.id < soc.id) {
			res = -1;
		} else if (this.id > soc.id) {
			res = 1;
		}

		return res;
	}

}
