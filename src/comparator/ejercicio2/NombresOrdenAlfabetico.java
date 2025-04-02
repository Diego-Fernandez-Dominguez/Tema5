package comparator.ejercicio2;

import java.util.Comparator;

public class NombresOrdenAlfabetico implements Comparator<Socio>{

	@Override
	public int compare(Socio so1, Socio so2) {
		return so1.compareTo(so2);
	}

}
