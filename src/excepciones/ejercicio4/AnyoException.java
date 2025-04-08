package excepciones.ejercicio4;

public class AnyoException extends Exception{

	@Override
	public String toString() {
		return "El anyo no debe ser negativo";
	}
	
	public String getMessage() {
		return "El anyo no debe ser negativo";
	}

}
