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

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMatricula() {
		return matricula;
	}

	public boolean isMotor() {
		return motor;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public int getMarcha() {
		return marcha;
	}

	public void pararArrancar() {

		if (this.motor) {
			System.out.println("Parando motor");
			this.motor = false;

		} else {
			System.out.println("Arrancando motor");
			this.motor = true;
		}

		this.velocidad = 0;
		this.marcha = 1;
	}

	public boolean subirMarcha() {

		boolean sePudo = false;

		if (this.marcha < 5) {
			this.marcha += 1;
			sePudo = true;
			cambiarVelocidad();
		}

		return sePudo;

	}

	public boolean bajarMarcha() {

		boolean sePudo = false;

		if (this.marcha > 1) {
			this.marcha += 1;
			sePudo = true;
			cambiarVelocidad();
		}

		return sePudo;
	}

	public boolean acelerar(int velocidad) {

		boolean sePudo = false;

		if (velocidad > 0) {
			this.velocidad += velocidad;
			cambiarMarcha(this.velocidad);
			sePudo = true;
		}

		return sePudo;

	}

	public boolean frenar(int velocidad) {

		boolean sePudo = false;

		if (velocidad > 0 && velocidad <= this.velocidad) {
			this.velocidad -= velocidad;
			cambiarMarcha(this.velocidad);
			sePudo = true;
		}

		return sePudo;

	}

	private void cambiarVelocidad() {
		switch (this.marcha) {

		case 1 -> {
			this.velocidad = 15;
		}
		case 2 -> {
			this.velocidad = 31;
		}
		case 3 -> {
			this.velocidad = 51;
		}
		case 4 -> {
			this.velocidad = 71;
		}
		case 5 -> {
			this.velocidad = 101;
		}
		}
	}

	private void cambiarMarcha(int velocidad) {

		if (velocidad >= 0) {
			this.marcha = 1;

			if (velocidad >= 30) {
				this.marcha = 2;

				if (velocidad >= 50) {
					this.marcha = 3;

					if (velocidad >= 70) {
						this.marcha = 4;

						if (velocidad >= 100) {
							this.marcha = 5;
						}
					}
				}
			}
		}
	}

}
