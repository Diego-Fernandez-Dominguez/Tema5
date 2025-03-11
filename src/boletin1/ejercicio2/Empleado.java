package boletin1.ejercicio2;

public class Empleado {

	private String nombre = "Desconocido";

	public Empleado(String nombre) {

		if (this.nombre != null && !this.nombre.isEmpty()) {
			this.nombre = nombre;
		}

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (this.nombre != null && this.nombre.isEmpty()) {
			this.nombre = nombre;
		}
	}

	public String toString() {

		return "Empleado " + nombre;

	}

}
