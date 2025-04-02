package comparator.ejercicio2;

import java.util.Arrays;

public class SocioMain {

	public static void main(String[] args) {

		Socio socios[] = new Socio[] { new Socio(1, "Luis", 58), new Socio(2, "Zerro", 46), new Socio(3, "Amai", 19), };

		System.out.println(Arrays.toString(socios));

		Arrays.sort(socios);
		System.out.println(Arrays.toString(socios));

		Arrays.sort(socios, new NombresOrdenAlfabetico());
		System.out.println(Arrays.toString(socios));
		
		Arrays.sort(socios, new MasEdadAMenos());
		System.out.println(Arrays.toString(socios));


	}

}
