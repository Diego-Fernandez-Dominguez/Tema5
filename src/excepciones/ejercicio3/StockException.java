package excepciones.ejercicio3;

public class StockException extends Exception {

	@Override
	public String toString() {
		return "El stock no puede ser negativo (No debemos nada a nadie)";

	}

	public String getMessage() {
		return "El stock no puede ser negativo (No debemos nada a nadie)";
	}
}