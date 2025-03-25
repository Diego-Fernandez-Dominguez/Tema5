package interfaces.ejercicio3;

public abstract class AnimalDomestico implements Animal {

	private String nombre;

	private String raza;

	private int peso;

	private String color;

	public AnimalDomestico(String nombre, String raza, int peso, String color) {

		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}

		if (raza != null && !raza.isBlank()) {
			this.raza = raza;
		}

		if (peso > 0) {
			this.peso = peso;
		}

		if (color != null && !color.isBlank()) {
			this.color = color;
		}

	}

	public void vacunar() {
		System.out.println("Aiiii, que me han vacunadoo");
	}

	@Override
	public void comer() {
		System.out.println("Ñam Ñam Ñam");
	}

	@Override
	public void dormir() {
		System.out.println("ZzZzZzZzZzZzZzZzZzZz");
	}

	public abstract boolean hacerCaso();

	public abstract void hacerRuido();

}
