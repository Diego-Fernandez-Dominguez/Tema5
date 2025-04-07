package excepciones.ejercicio1;

public class NegativeMinuteException extends Exception{

	@Override
	public String toString() {
		return "No te me flipes macho, los minutos " + "negativos no entran en este barrio";
	}

	public String getMessage() {
		return "No te me flipes macho, los minutos " + "negativos no entran en este barrio";
	}
	
}
