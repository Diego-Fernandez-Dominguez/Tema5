package analisis.ejercicio4;

public class Contacto implements Comparable<Contacto> {

	private String nombre;

	private int telefono;

	public Contacto(String nombre, int telefono) {

		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}

		if (telefono > 99999999) {
			this.telefono = telefono;
		}

	}

	public String getNombre() {
		return nombre;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Contacto: " + nombre + ", Telefono: " + telefono;
	}

	@Override
	public int compareTo(Contacto c) {

		return this.nombre.compareTo(c.nombre);

	}

}
