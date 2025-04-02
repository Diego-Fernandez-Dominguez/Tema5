package analisis.ejercicio4;

public class Persona extends Contacto {

	private String nombreReal;
	private int cumpleanyos;

	public Persona(String nombre, int telefono, String nombreReal, int anyo) {
		super(nombre, telefono);

		if (nombreReal != null && !nombreReal.isBlank()) {
			this.nombreReal = nombreReal;
		}

		if (anyo >= 0) {
			this.cumpleanyos = anyo;
		}

	}

	public String getNombreReal() {
		return nombreReal;
	}

	public void setNombreReal(String nombreReal) {
		this.nombreReal = nombreReal;
	}

	public int getCumpleanyos() {
		return cumpleanyos;
	}

	@Override
	public String toString() {
		return super.toString() + ", NombreReal: " + nombreReal + ", Cumpleanyos: " + cumpleanyos;
	}

}
