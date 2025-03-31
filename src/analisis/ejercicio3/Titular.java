package analisis.ejercicio3;

public class Titular {

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

}
