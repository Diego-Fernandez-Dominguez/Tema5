package analisis.ejercicio1;

import java.util.Scanner;

public class VehiculoMain {

	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {

		int velocidadDes;

		int tiempo;

		Camion camion1 = new Camion("Seat", "To-Guapo", "Azul", "1234ABC", 10000, true);

		camion1.arrancar();

		System.out.println("Dime la velocidad deseada: ");
		velocidadDes = reader.nextInt();
		reader.nextLine();

		camion1.acelerar(velocidadDes);

		System.out.println("Introduce el tiempo: ");
		tiempo = reader.nextInt();

		reader.nextLine();

		System.out.println("Se ha mantenido " + tiempo + " minutos a " + camion1.getVelocidad() + " km/h");

		camion1.desacelerar(15);

		camion1.parar();

	}

}
