package comparator.ejercicio3;

public class Futbolista implements Comparable<Futbolista> {

	private int numCamisa;

	private String nombre;

	private int edad;

	private int numGoles;

	public Futbolista(int numCamisa, String nombre, int edad, int numGoles) {

		if (numCamisa >= 1) {
			this.numCamisa = numCamisa;
		}

		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}

		if (edad >= 1) {
			this.edad = edad;
		}

		if (numGoles >= 0) {
			this.numGoles = numGoles;

		}

	}
	
	

	public int getNumCamisa() {
		return numCamisa;
	}



	public void setNumCamisa(int numCamisa) {
		this.numCamisa = numCamisa;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}



	public int getNumGoles() {
		return numGoles;
	}



	public void setNumGoles(int numGoles) {
		this.numGoles = numGoles;
	}



	@Override
	public int compareTo(Futbolista f) {

		int res = 0;

		if (this.numCamisa == f.numCamisa) {
			res = this.nombre.compareTo(f.nombre);
		} else {
			res = this.numCamisa - f.numCamisa;
		}

		return res;
	}

	@Override
	public boolean equals(Object obj) {

		boolean igu = false;

		Futbolista fut = (Futbolista) obj;

		if (numCamisa == fut.numCamisa && nombre.equals(fut.nombre)) {
			igu = true;
		}

		return igu;

	}

	@Override
	public String toString() {
		return "Futbolista: " + numCamisa + " - " + nombre + " - " + numGoles + " goles" + " - " + edad + " anyos";
	}

}
