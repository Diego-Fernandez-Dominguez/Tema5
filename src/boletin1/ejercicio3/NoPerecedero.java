package boletin1.ejercicio3;

public class NoPerecedero extends Producto {

	private String tipo;

	public NoPerecedero(String nombre, double precio, String tipo) {
		super(nombre, precio);

		if (this.tipo != null && this.tipo.isEmpty()) {
			this.tipo = tipo;
		}
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		if (this.tipo != null && this.tipo.isEmpty()) {
			this.tipo = tipo;
		}
	}

	@Override
	public String toString() {
		return super.toString() + " Tipo: " + this.tipo;
	}

}
