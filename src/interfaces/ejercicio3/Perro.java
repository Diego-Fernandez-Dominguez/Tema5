package interfaces.ejercicio3;

import java.util.Random;

public class Perro extends AnimalDomestico {

	public Perro(String nombre, String raza, int peso, String color) {
		super(nombre, raza, peso, color);
	}

	public void sacarPaseo() {
		System.out.println("Uyuyuyuyuyu, que me voy de paseo, YUJUUUUUUU");
	}

	@Override
	public boolean hacerCaso() {

		Random rand = new Random();

		boolean buenChico = false;

		if (rand.nextInt(1, 101) <= 90) {
			buenChico = true;
		}

		return buenChico;
	}

	@Override
	public void hacerRuido() {
		System.out.println("Guau guau soy un perro woof");
	}

}
