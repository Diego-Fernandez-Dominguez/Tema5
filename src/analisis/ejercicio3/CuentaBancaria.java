package analisis.ejercicio3;

import java.util.TreeSet;

public class CuentaBancaria {

	private int numCuenta;
	protected double saldo;
	private TreeSet<Titular> titulares;

	public CuentaBancaria(int numCuenta, double saldo, Titular titular1) {

		if(numCuenta>0) {
			this.numCuenta=numCuenta;
		}
		
		
	}

	public CuentaBancaria(int numCuenta, double saldo, Titular titular1, Titular titular2) {

	}

	public CuentaBancaria(int numCuenta, double saldo, Titular titular1, Titular titular2, Titular titular3) {

	}

}
