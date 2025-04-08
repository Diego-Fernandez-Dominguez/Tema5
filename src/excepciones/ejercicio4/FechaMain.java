package excepciones.ejercicio4;

import java.util.Scanner;

public class FechaMain {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int dia;
		int mes;
		int anyo;

		boolean error;

		do {
			try {

				error = false;

				System.out.println("Dia");
				dia = sc.nextInt();

				System.out.println("Mes");
				mes = sc.nextInt();

				System.out.println("Anyo");
				anyo = sc.nextInt();

				Fecha fe1 = new Fecha(dia, mes, anyo);

			} catch (DiaException | MesException | AnyoException e) {
				error = true;
				System.err.println(e);
			}
		} while (error);
		System.out.println("Hola");
	}

}
