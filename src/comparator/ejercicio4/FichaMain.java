package comparator.ejercicio4;

import java.util.Arrays;
import java.util.Comparator;

public class FichaMain {
	public static void main(String[] args) {

		Ficha[] fichas = new Ficha[5];

		Comparator<Ficha> idAsc = (a, b) -> {
			return a.getId() - b.getId();
		};

		Comparator<Ficha> ordAlf = (a, b) -> {
			return a.getTitulo().compareTo(b.getTitulo());
		};

		Ficha f1 = new Libro(1, "e", "Autor", "Titular");
		Ficha f2 = new Revista(2, "d", 12, 2024);
		Ficha f3 = new DVD(3, "c", "Director", 2016, "Documental");
		Ficha f4 = new DVD(4, "b", "Director", 2016, "Documental");
		Ficha f5 = new DVD(5, "a", "Director", 2016, "Documental");

		fichas[0] = f1;
		fichas[1] = f2;
		fichas[2] = f3;
		fichas[3] = f4;
		fichas[4] = f5;

		Arrays.sort(fichas, idAsc);
		System.out.println(Arrays.toString(fichas));

		Arrays.sort(fichas, ordAlf);
		System.out.println(Arrays.toString(fichas));

	}

}
