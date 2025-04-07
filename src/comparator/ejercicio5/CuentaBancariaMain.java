package comparator.ejercicio5;

import java.util.Arrays;
import java.util.Comparator;

public class CuentaBancariaMain {
	public static void main(String[] args) {

		CuentaBancaria[] cuentas = new CuentaBancaria[2];
		Titular[] titu = new Titular[3];

		Titular tit1 = new Titular("12345678A", "A", "Z", 123456789);
		Titular tit2 = new Titular("23456789B", "B", "Z", 234567891);
		Titular tit3 = new Titular("23456789C", "B", "A", 234567891);

		CuentaBancaria cb1 = new CuentaBancaria(1234, tit1);
		CuentaBancaria cb2 = new CuentaBancaria(9876, tit2);

		cb1.ingresar(56);
		cb2.ingresar(3);

		cuentas[0] = cb2;
		cuentas[1] = cb1;

		titu[0] = tit2;
		titu[1] = tit1;
		titu[2] = tit3;

		Comparator<CuentaBancaria> numCuentaDsc = (a, b) -> {
			return (int) (b.getSaldo() - a.getSaldo());
		};

		Arrays.sort(cuentas, numCuentaDsc);
		System.out.println(Arrays.toString(cuentas));

		Comparator<Titular> apellNombr = (a, b) -> {

			int dev = 0;

			if (a.getApellidos().equals(b.getApellidos())) {
				dev = a.getNombre().compareTo(b.getNombre());
			} else {
				dev = a.getApellidos().compareTo(b.getApellidos());
			}

			return dev;

		};

		Arrays.sort(titu, apellNombr);
		System.out.println(Arrays.toString(titu));

	}

}
