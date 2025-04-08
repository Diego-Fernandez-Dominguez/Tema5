package excepciones.ejercicio2;

public class NombreException extends Exception{
	
	@Override
	public String toString() {
		return "El nombre no debe ser nulo ni estar vacio";
	}

	public String getMessage() {
		return "El nombre no debe ser nulo ni estar vacio";
	}

}
