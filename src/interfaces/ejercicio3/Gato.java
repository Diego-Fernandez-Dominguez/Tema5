package interfaces.ejercicio3;

import java.util.Random;

public class Gato extends AnimalDomestico {

	public Gato(String nombre, String raza, int peso, String color) {
		super(nombre, raza, peso, color);
	}

	public void toserBolaPelo() {
		System.out.println("JUJUJUJUJUJUJU PLUAAAJ *tose una bola de pelo*");
	}

	@Override
	public boolean hacerCaso() {
		Random rand = new Random();

		boolean buenChico = false;

		if (rand.nextInt(1, 101) <= 5) {
			buenChico = true;
		}

		return buenChico;
	}

	@Override
	public void hacerRuido() {
		System.out.println("Miau Miau soy un gato meow");
	}

}
