package comparator.ejercicio2;

import java.util.Comparator;

public class MasEdadAMenos implements Comparator<Socio> {

	@Override
	public int compare(Socio so1, Socio so2) {
		return so2.getEdad() - so1.getEdad();
	}

}
