package boletin1.ejercicio5;

import java.util.HashSet;
import java.util.Scanner;

public class PoligonoMain {

	static Scanner reader = new Scanner(System.in);

	static HashSet<Poligono> poligonos = new HashSet<Poligono>();

	public static void main(String[] args) {

		int opc = 0;

		Poligono pol;

		double lado1;
		double lado2;
		double lado3;

		do {

			menu();
			System.out.println("Eliga");
			opc = reader.nextInt();
			reader.nextLine();
			switch (opc) {
			case 1 -> {
				lado1 = pedirLado(1);
				lado2 = pedirLado(2);
				lado3 = pedirLado(3);
				pol = new Triangulo(lado1, lado2, lado3);
				poligonos.add(pol);
			}

			case 2 -> {
				lado1 = pedirLado(1);
				lado2 = pedirLado(2);
				pol = new Rectangulo(lado1, lado2);
				poligonos.add(pol);
			}

			case 3 -> {
				listarPoligonos();
			}

			default -> {
				System.out.println("Opcion incorrecta");
			}
			}

		} while (opc != 4);

	}

	private static void menu() {
		System.out.println("1. Introducir triangulo");
		System.out.println("2. Introducir rectangulo");
		System.out.println("3. Mostrar poligonos");
		System.out.println("4. Adioh");
	}

	private static double pedirLado(int num) {
		System.out.println("Digame el lado " + num);
		return reader.nextDouble();
	}

	private static void listarPoligonos() {
		for (Poligono p : poligonos) {

			System.out.println(p);
			System.out.println("------------------------");

		}
	}

}
