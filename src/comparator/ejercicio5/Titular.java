package comparator.ejercicio5;

public class Titular implements Comparable<Titular> {

	private String dni;
	private String nombre;
	private String apellidos;
	private int telefono;

	public Titular(String dni, String nombre, String apellidos, int telefono) {

		if (dni != null && !dni.isBlank()) {
			this.dni = dni;
		}

		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}

		if (apellidos != null && !apellidos.isBlank()) {
			this.apellidos = apellidos;
		}

		if (telefono > 99999999) {
			this.telefono = telefono;
		}

	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "DNI: " + dni + ", Nombre: " + nombre + ", Apellidos: " + apellidos + ", Telefono: " + telefono;
	}

	@Override
	/**
	 * Tengo que hacerlo
	 */
	public int compareTo(Titular t) {

		return this.dni.compareTo(t.dni);
	}

}
