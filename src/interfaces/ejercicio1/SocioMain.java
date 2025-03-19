package interfaces.ejercicio1;

import java.util.Arrays;

public class SocioMain {

	public static void main(String[] args) {

		Socio socios[] = new Socio[] { new Socio(1, "Luis", 58), new Socio(2, "Miado", 46), new Socio(1, "Luis", 19), };

		Socio soc1 = new Socio(1, "Euseboi", 103);
		Socio soc2 = new Socio(7, "Marcos", 19);
		Socio soc3 = new Socio(1, "Euseboi", 103);

		compararSocios(soc1, soc2);
		compararSocios(soc1, soc3);

		Arrays.sort(socios);
		System.out.println(Arrays.deepToString(socios));

	}

	private static void compararSocios(Socio soc1, Socio soc2) {

		if (soc1.compareTo(soc2) < 0) {
			System.out.println("El id es menor");
		} else if (soc1.compareTo(soc2) < 0) {
			System.out.println("El id es mayor");
		} else {
			System.out.println("Son iguales");
		}

	}

}
