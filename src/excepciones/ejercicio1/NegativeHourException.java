package excepciones.ejercicio1;

public class NegativeHourException extends Exception{

	@Override
	public String toString() {
		return "No te me flipes macho, las horas " + "negativos no entran en este barrio";
	}

	public String getMessage() {
		return "No te me flipes macho, las horas " + "negativos no entran en este barrio";
	}
	
}
