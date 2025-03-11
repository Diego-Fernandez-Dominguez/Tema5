package boletin1.ejercicio3;

public class Perecedero extends Producto {

	private int diasACaducar;

	public Perecedero(String nombre, double precio, int diasACaducar) {
		super(nombre, precio);

		if (diasACaducar > 0) {
			this.diasACaducar = diasACaducar;
		}
	}

	public int getDiasACaducar() {
		return diasACaducar;
	}

	public void setDiasACaducar(int diasACaducar) {
		if (diasACaducar > 0) {
			this.diasACaducar = diasACaducar;
		}
	}

	public double calcular(int cant) {

		double resultado;

		resultado = super.calcular(cant);

		if (diasACaducar == 1) {
			resultado = resultado / 4;
		} else if (diasACaducar == 2) {
			resultado = resultado / 3;
		} else if (diasACaducar == 3) {
			resultado = resultado / 2;
		}

		return resultado;
	}

	@Override
	public String toString() {
		return super.toString() + " Dias A Caducar: " + this.diasACaducar;
	}

}
