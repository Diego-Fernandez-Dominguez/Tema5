package excepciones.ejercicio1;

public class NegativeSecondException extends Exception {

	@Override
	public String toString() {
		return "No te me flipes macho, los segundos " + "negativos no entran en este barrio";
	}

	public String getMessage() {
		return "No te me flipes macho, los segundos " + "negativos no entran en este barrio";
	}

}
