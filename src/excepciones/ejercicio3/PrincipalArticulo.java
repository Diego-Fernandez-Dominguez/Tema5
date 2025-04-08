package excepciones.ejercicio3;

import java.util.Scanner;

public class PrincipalArticulo {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		boolean error;

		String nombre;

		double precio;

		int cuantosQuedan;

		do {
			try {
				error = false;

				System.out.println("Nombre");
				nombre = sc.nextLine();

				System.out.println("Precio");
				precio = sc.nextDouble();

				System.out.println("Stock");
				cuantosQuedan = sc.nextInt();
				sc.nextLine();

				Articulo art1 = new Articulo(nombre, precio, cuantosQuedan);

			} catch (NombreException e) {

				System.err.println(e);
				error = true;

			} catch (PrecioException e) {

				System.err.println(e);
				error = true;

			} catch (StockException e) {

				System.err.println(e);
				error = true;

			} 
		} while (error);

		System.out.println("Perfe");
		
	}

}
