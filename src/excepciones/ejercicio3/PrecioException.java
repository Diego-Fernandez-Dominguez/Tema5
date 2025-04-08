package excepciones.ejercicio3;

public class PrecioException extends Exception{

	@Override
	public String toString() {
		return "El precio no puede ser negativo (No somos una ONG)";
	}
	
	public String getMessage() {
		return "El precio no puede ser negativo (No somos una ONG)";
	}
}