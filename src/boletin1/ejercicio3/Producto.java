package boletin1.ejercicio3;

public class Producto {

	private String tipo = "No especificado";

	private double precio;

	public Producto(String nombre, double precio) {

		if (this.tipo != null && !this.tipo.isEmpty()) {
			this.tipo = nombre;
		}

		if (precio > 0.1) {
			this.precio = precio;
		}

	}

	public String getNombre() {
		return tipo;
	}

	public void setNombre(String nombre) {
		if (this.tipo != null && this.tipo.isEmpty()) {
			this.tipo = nombre;
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
		return this.tipo + " - " + this.precio + "€";
	}

}
