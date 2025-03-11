package boletin1.ejercicio1;

public class MainHora {
	public static void main(String[] args) {

		Hora hor1 = new Hora(13, 3);
		Hora hor2 = new Hora(23, 59);
		HoraExacta horE1 = new HoraExacta(13, 3, 34);
		HoraExacta horE2 = new HoraExacta(23, 59, 59);

		System.out.println(hor1);
		System.out.println(horE1);
		System.out.println(hor2);
		System.out.println(horE2);
		
		System.out.println("-------------------------------------");
		
		hor2.inc();
		
		System.out.println(hor2);
		
		horE2.inc();
		
		System.out.println(horE2);
		
		hor1.inc();
		
		System.out.println(hor1);
		
		horE1.inc();
		
		System.out.println(horE1);


	}

}
