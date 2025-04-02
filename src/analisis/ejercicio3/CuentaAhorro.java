package analisis.ejercicio3;

public class CuentaAhorro extends CuentaBancaria {

	private double cuotaMant;
	private double interesAnual;

	public CuentaAhorro(int numCuenta, Titular titular, double cuotaMant, double interesAnual) {
		super(numCuenta, titular);

		if (cuotaMant > 0) {
			this.cuotaMant = cuotaMant;
		}

		if (interesAnual > 0) {
			this.interesAnual = interesAnual;
		}

	}

	public double saldoNuevo() {

		return this.saldo + (this.saldo * interesAnual);

	}

	public double restarCuota() {

		return this.saldo - cuotaMant;

	}

	@Override
	public String toString() {
		return super.toString() + "CuotaMantenimiento: " + cuotaMant + ", InteresAnual: " + interesAnual * 100;
	}

}
