package excepciones.ejercicio2;

public class SaldoException extends Exception{
	
	@Override
	public String toString() {
		return "El saldo no debe ser negativo";
	}

	public String getMessage() {
		return "El saldo no debe ser negativo";
	}

}
