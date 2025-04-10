package examen2324.exceptions;

/**
 * Excepcion que salta cuando el atributo modelo de una clase mando es nula o vacia
 */
public class ModeloException extends Exception{

	@Override
	public String toString() {
		return "El modelo no puede ser nulo ni estar vacio";
	}
	
	@Override
	public String getMessage() {
		return "El modelo no puede ser nulo ni estar vacio";
	}

}
