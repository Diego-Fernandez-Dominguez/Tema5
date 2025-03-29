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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		if (color != null && !color.isBlank()) {
			this.color = color;
		}
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public String getMatricula() {
		return matricula;
	}

	public boolean isMotor() {
		return motor;
	}

	public int getMarcha() {
		return marcha;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void parar() {
		motor = false;
		marcha = 0;
	}

	public void arrancar() {
		motor = true;
		marcha = 0;
	}

	public boolean subirMarcha(int velocidad) {
		boolean sePudo = false;

		if (velocidad > 0) {
			sePudo = true;
			cambiarMarcha(velocidad);
			this.velocidad = velocidad;
		}

		return sePudo;
	}

	public boolean bajarMarcha(int velocidad) {
		boolean sePudo = false;

		if (velocidad > 0 && this.velocidad > velocidad) {
			sePudo = true;
			cambiarMarcha(velocidad);
			this.velocidad = velocidad;
		}

		return sePudo;
	}

	public void acelerar(int velocidad) {

		while (this.velocidad < velocidad) {
			this.velocidad++;

			if (cambiarMarcha(this.velocidad)) {
				System.out.println("Cambio de marcha a " + this.marcha + "ª");
			}

		}
	}

	public void desacelerar(int velocidad) {

		while (this.velocidad > velocidad) {
			this.velocidad--;

			if (cambiarMarcha(this.velocidad)) {
				System.out.println("Cambio de marcha a " + this.marcha + "ª");
			}

		}
	}

	private boolean cambiarMarcha(int velocidad) {
		
		int marcha = 0;

		boolean sePudo = false;

		if (velocidad >= 0 && velocidad < 30) {
			marcha = 1;
		}

		if (velocidad >= 30 && velocidad < 50) {
			marcha = 2;
		}

		if (velocidad >= 50 && velocidad < 70) {
			marcha = 3;
		}

		if (velocidad >= 70 && velocidad < 100) {
			marcha = 4;
		}

		if (velocidad >= 100) {
			marcha = 5;
		}

		if (marcha != this.marcha) {
			sePudo = true;
			this.marcha = marcha;
		}

		return sePudo;

	}

	public String toString() {
		return "Coche -> Marca: " + marca + ", Modelo: " + modelo + ", Color: " + color + ", Matricula: " + matricula
				+ ", EstadoMotor: " + motor + ", Marcha: " + marcha + ", Velocidad: " + velocidad;
	}

}
