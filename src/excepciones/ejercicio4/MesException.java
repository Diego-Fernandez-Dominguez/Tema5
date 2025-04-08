package excepciones.ejercicio4;

public class MesException extends Exception{

	@Override
	public String toString() {
		return "El mes no debe ser negativo ni cero";
	}
	
	public String getMessage() {
		return "El mes no debe ser negativo ni cero";
	}

}
