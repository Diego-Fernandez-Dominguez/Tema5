package excepciones.ejercicio2;

public class DniException extends Exception {

	@Override
	public String toString() {
		return "El DNI no debe ser nulo ni estar vacio";
	}

	@Override
	public String getMessage() {
		return "El DNI no debe ser nulo ni estar vacio";
	}

}
