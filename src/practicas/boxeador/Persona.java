package practicas.boxeador;

public abstract class Persona {

	private String dni;

	private int edad;

	public Persona(String dni) {
		this.dni = dni;
	}

	public Persona(String dni, int edad) {

		this(dni);

		this.edad = edad;

	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public abstract void hablar();

}
