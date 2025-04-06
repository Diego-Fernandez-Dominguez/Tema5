package comparator.ejercicio3;

import java.util.Arrays;
import java.util.Comparator;

public class FutbolistaMain {

	public static void main(String[] args) {

		Futbolista[] furbolistas = new Futbolista[5];

		Comparator<Futbolista> edadAsc = (a, b) -> {
			return a.getEdad() - b.getEdad();
		};
		
		Comparator<Futbolista> golesDesc = (a,b) ->{
			return b.getNumGoles()-a.getNumGoles();
		};

		Futbolista fut1 = new Futbolista(12, "Adrian", 98, 0);
		Futbolista fut2 = new Futbolista(5, "Alicia", 45, 55);
		Futbolista fut3 = new Futbolista(12, "Pablo", 19, 76);
		Futbolista fut4 = new Futbolista(9, "Daniel", 34, 98);
		Futbolista fut5 = new Futbolista(11, "Josemi", 10, 12);

		furbolistas[0] = fut1;
		furbolistas[1] = fut2;
		furbolistas[2] = fut3;
		furbolistas[3] = fut4;
		furbolistas[4] = fut5;
		
		Arrays.sort(furbolistas, edadAsc);
		System.out.println(Arrays.toString(furbolistas));
		
		Arrays.sort(furbolistas, golesDesc);
		System.out.println(Arrays.toString(furbolistas));

	}

}