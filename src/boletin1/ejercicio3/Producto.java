package boletin1.ejercicio3;

public class Producto {

	private String nombre = "No especificado";

	private double precio;

	public Producto(String nombre, double precio) {

		if (this.nombre != null && !this.nombre.isEmpty()) {
			this.nombre = nombre;
		}

		if (precio > 0.1) {
			this.precio = precio;
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

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		if (precio > 0.1) {
			this.precio = precio;
		}
	}

	public double calcular(int cant) {
		return cant * precio;
	}

	@Override
	public String toString() {
		return this.nombre + " - " + this.precio + "€";
	}

}
