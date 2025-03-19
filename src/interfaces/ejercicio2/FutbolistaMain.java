package interfaces.ejercicio2;

import java.util.Arrays;

public class FutbolistaMain {
	public static void main(String[] args) {

		Futbolista fut[] = new Futbolista[] {

				new Futbolista(3, "Luis", 45, 7), new Futbolista(6, "Jose", 19, 1), new Futbolista(8, "Adrian", 18, 0),
				new Futbolista(6, "Mario", 23, 9)

		};
		
		Arrays.sort(fut);
		
		System.out.println(Arrays.deepToString(fut));

	}

}
