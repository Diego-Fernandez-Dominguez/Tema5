package examen2324.exceptions;

public class PrecioException extends Exception {

	@Override
	public String toString() {
		return "El modelo no puede ser nulo ni estar vacio";
	}

	@Override
	public String getMessage() {
		return "El modelo no puede ser nulo ni estar vacio";
	}

}
