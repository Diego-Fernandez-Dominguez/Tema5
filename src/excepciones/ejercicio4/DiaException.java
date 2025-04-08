package excepciones.ejercicio4;

public class DiaException extends Exception{

		@Override
		public String toString() {
			return "El dia no debe ser negativo ni cero";
		}
		
		public String getMessage() {
			return "El dia no debe ser negativo ni cero";
		}
	
}
