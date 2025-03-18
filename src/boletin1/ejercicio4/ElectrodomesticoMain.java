package boletin1.ejercicio4;

import java.util.HashSet;

public class ElectrodomesticoMain {

	static HashSet<Electrodomestico> electros = new HashSet<Electrodomestico>();

	public static void main(String[] args) {

		Electrodomestico lav1 = new Lavadora(23, "azul", 'F', 100, 32);
		Electrodomestico lav2 = new Lavadora(64, "ROJO", 'A', 240, 1);
		Electrodomestico tv1 = new Television(97, "ROJO", 'B', 240, 40, true);
		Electrodomestico tv2 = new Television(75, "negro", 'C', 210, 140, false);

		electros.add(lav1);
		electros.add(lav2);
		electros.add(tv1);
		electros.add(tv2);

		recorrerLista();

		listarPrecioTV();

		listarPrecioLav();
		
		System.out.println("Suma total: " + sumaElectrodomesticos());

	}

	private static void listarPrecioTV() {
		for (Electrodomestico e : electros) {
			if (e instanceof Television) {
				System.out.println("Television: " + e.getPrecio());
			}
		}
	}

	private static void listarPrecioLav() {
		for (Electrodomestico e : electros) {
			if (e instanceof Lavadora) {
				System.out.println("Lavadora: " + e.getPrecio());
			}
		}
	}

	private static void recorrerLista() {
		for (Electrodomestico e : electros) {
			e.precioFinal();
			System.out.println(e.getPrecio());
		}
	}

	private static double sumaElectrodomesticos() {

		double suma = 0;

		for (Electrodomestico e : electros) {
			if (e instanceof Electrodomestico) {
				suma += e.getPrecio();
			}
		}

		return suma;
	}

}
