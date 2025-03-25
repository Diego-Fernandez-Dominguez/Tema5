package interfaces.ejercicio3;

public class AnimalMain {
	public static void main(String[] args) {

		Gato g = new Gato("Michi", "Naranja", 104, "Naranja");
		Perro p = new Perro("Griffo", "Agua", 65, "Negro con toques blancos");
				
		System.out.println("Perro: ");
		p.comer();
		p.dormir();
		System.out.println(p.hacerCaso());
		p.hacerRuido();
		p.sacarPaseo();
		
		System.out.println("\n--------------------------------\n");
		
		System.out.println("Gato: ");
		g.comer();
		g.dormir();
		System.out.println(g.hacerCaso());
		g.hacerRuido();
		g.toserBolaPelo();

	}

}
