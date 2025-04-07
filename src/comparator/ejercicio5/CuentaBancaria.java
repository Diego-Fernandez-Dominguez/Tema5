package comparator.ejercicio5;

import java.util.TreeSet;

public class CuentaBancaria {

	private int numCuenta;
	protected double saldo;
	private TreeSet<Titular> titulares;

	public CuentaBancaria(int numCuenta, Titular titular1) {

		this.titulares = new TreeSet<Titular>();

		if (titular1 != null) {

			if (numCuenta > 0) {
				this.numCuenta = numCuenta;
			}

			anyadirTitular(titular1);

		}

	}

	public int getNumCuenta() {
		return numCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public TreeSet<Titular> getTitulares() {
		return titulares;
	}

	public void setTitulares(TreeSet<Titular> titulares) {
		this.titulares = titulares;
	}

	public boolean ingresar(double saldo) {

		boolean sePudo = false;

		if (saldo > 0) {

			sePudo = true;

			this.saldo += saldo;

		}
		return sePudo;

	}

	public boolean retirar(double saldo) {

		boolean sePudo = false;

		if (saldo > 0) {

			sePudo = true;

			this.saldo -= saldo;

		}
		return sePudo;

	}

	public boolean anyadirTitular(Titular titular) {

		boolean sePudo = false;

		if (titular != null) {

			sePudo = true;

			this.titulares.add(titular);

		}
		return sePudo;

	}

	public boolean borrarTitular(Titular titular) {

		boolean sePudo = false;

		if (titular != null) {

			for (Titular titu : titulares) {

				if (titu == titular) {
					titulares.remove(titu);
				}

			}

		}
		return sePudo;
	}

	public String sacarLista() {

		String cadena = "";
		int cont = 1;

		for (Titular titu : titulares) {

			cadena += "Titular " + cont + ": " + titu.toString() + "\n";

		}

		return cadena;

	}

	@Override
	public String toString() {
		return "NumeroCuenta: " + numCuenta + ", Saldo: " + saldo + " " + sacarLista();
	}

}
