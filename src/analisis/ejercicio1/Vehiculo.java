package analisis.ejercicio1;

public class Vehiculo {

	private String marca;

	private String modelo;

	private String color;

	private String matricula;

	private boolean motor = false;

	private int velocidad = 0;

	private int marcha = 1;

	public Vehiculo(String marca, String modelo, String color, String matricula) {

		if (marca != null && !marca.isBlank()) {
			this.marca = marca;
		}

		if (modelo != null && !modelo.isBlank()) {
			this.modelo = modelo;

		}

		if (color != null && !color.isBlank()) {
			this.color = color;
		}

		if (matricula != null && !matricula.isBlank()) {
			this.matricula = matricula;
		}
	}

	public void parar() {

		if (!this.motor) {
			System.out.println("Ya esta parao maquinon");
		} else {
			this.motor = false;
			this.velocidad = 0;
			this.marcha = 1;
		}

		this.motor = false;
		this.velocidad = 0;
		this.marcha = 1;
	}

	public void arrancar() {

		if (this.motor) {
			System.out.println("Ya esta arrancao maquinon");
		} else {
			this.motor = true;
			this.velocidad = 0;
			this.marcha = 1;
		}

	}

	public boolean subirMarcha(int velocidadNueva) {

		boolean sePudo = false;

		if (velocidadNueva < this.velocidad) {
			cambiarMarcha(velocidadNueva);
			sePudo=true;
			this.velocidad=velocidadNueva;
		}

		return sePudo;

	}

	public boolean bajarMarcha(int velocidadNueva) {

		boolean sePudo = false;

		if (velocidadNueva > this.velocidad) {
			cambiarMarcha(velocidadNueva);
		}
		
		return sePudo;

	}

	private void cambiarMarcha(int velocidad) {

		if (velocidad >= 0) {
			System.out.println("Se ha cambiado a 1º marcha");
			if (velocidad >= 30) {
				System.out.println("Se ha cambiado a 2º marcha");
				if (velocidad >= 50) {
					System.out.println("Se ha cambiado a 3º marcha");
					if (velocidad >= 70) {
						System.out.println("Se ha cambiado a 4º marcha");
						if (velocidad >= 100) {
							System.out.println("Se ha cambiado a 5º marcha");
						}
					}
				}
			}
		}

		System.out.println("Se ha llegado a la marcha indicada");

	}

}
