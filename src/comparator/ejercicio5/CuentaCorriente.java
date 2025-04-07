package comparator.ejercicio5;

import java.util.TreeSet;

public class CuentaCorriente extends CuentaBancaria {

	private TreeSet<Transaccion> transacciones;
	private double porcentajeCobrado;
	private int numTransacciones;

	public CuentaCorriente(int numCuenta, Titular titular1, double porcentajeCobrado) {
		super(numCuenta, titular1);

		if (porcentajeCobrado > 0) {
			this.porcentajeCobrado = porcentajeCobrado;
		}

	}

	public TreeSet<Transaccion> getTransacciones() {
		return transacciones;
	}

	public double getPorcentajeCobrado() {
		return porcentajeCobrado;
	}
	
	public int getNumTransacciones() {
		return numTransacciones;
	}

	public boolean nuevaTransaccion(Transaccion transacc) {

		boolean sePudo = false;

		if (transacc != null) {
			sePudo = true;

			Transaccion tran = transacc;

			tran.importe = tran.importe + (tran.importe * porcentajeCobrado);

			transacciones.add(tran);

			this.numTransacciones++;
		}

		return sePudo;

	}
	
	public String sacarListaTransacc() {

		String cadena = "";
		int cont = 1;

		for (Transaccion trans : transacciones) {

			cadena += "Transaccion " + cont + ": "  + trans.toString() + "\n";

		}

		return cadena;

	}
	
	@Override
	public String toString() {
		return super.toString() + "PorcentajeCobrado: " + porcentajeCobrado*100 + ", NumTransacciones: " + numTransacciones + "";
	}

}
