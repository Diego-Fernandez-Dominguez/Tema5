package excepciones.ejercicio1;

public class MainHora {
	public static void main(String[] args) {

		Hora hora1 = null;
		
		try {
			hora1 = new Hora(0, 0, 0);
		} catch (NegativeHourException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		} catch (NegativeMinuteException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		} catch (NegativeSecondException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
		

		try {

			hora1.setSegundo(-6);

		} catch (NegativeSecondException e) {
			
			System.err.println(e.getMessage());
		}

		try {

			hora1.setMinuto(-6);

		} catch (NegativeMinuteException e) {
			System.err.println(e.getMessage());
		}

		try {

			hora1.setHora(-6);

		} catch (NegativeHourException e) {
			System.err.println(e.getMessage());
		}

	}

}
