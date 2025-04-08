package excepciones.ejercicio2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class CuentaBancariaMain {

	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {

		Titular tit1 = null;

		boolean error = false;

		String dni;

		String nombre;

		int saldo;

		do {
			try {

				error = false;

				System.out.println("Dime el dni");
				dni = reader.nextLine();

				System.out.println("Digame el nombre");
				nombre = reader.nextLine();

				tit1 = new Titular(dni, nombre, "perro", 12345678);

			} catch (DniException e) {
				System.err.println(e.getMessage());
				error = true;

			} catch (NombreException e) {
				System.err.println(e.getMessage());
				error = true;
			}

		} while (error);

		do {
			try {

				error = false;

				System.out.println("Dime el saldo");
				saldo = reader.nextInt();

				CuentaCorriente cc1 = new CuentaCorriente(1, tit1, saldo, 0.21);

			} catch (SaldoException e) {
				System.err.println(e.getMessage());
				error = true;

			}

		} while (error);

	}

}
