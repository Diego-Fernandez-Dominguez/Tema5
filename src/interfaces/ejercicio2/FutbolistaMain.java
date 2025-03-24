package interfaces.ejercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FutbolistaMain {

	static List<Futbolista> futbolistas = new ArrayList<Futbolista>();

	public static void main(String[] args) {

		Futbolista fut1 = new Futbolista(12, "Adrian", 98, 0);
		Futbolista fut2 = new Futbolista(5, "Alicia", 45, 55);
		Futbolista fut3 = new Futbolista(12, "Pablo", 19, 76);
		Futbolista fut4 = new Futbolista(9, "Daniel", 34, 98);
		Futbolista fut5 = new Futbolista(11, "Josemi", 10, 12);

		futbolistas.add(fut1);
		futbolistas.add(fut2);
		futbolistas.add(fut3);
		futbolistas.add(fut4);
		futbolistas.add(fut5);

		System.out.println("Lista desordenada");
		sacarLista();

		Collections.sort(futbolistas);

		System.out.println();

		System.out.println("Lista ordenada");
		sacarLista();

	}

	private static void sacarLista() {

		for (Futbolista futbolista : futbolistas) {
			System.out.println(futbolista);
		}

	}

}