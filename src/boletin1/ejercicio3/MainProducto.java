package boletin1.ejercicio3;

public class MainProducto {
	public static void main(String[] args) {

		Producto P1 = new Producto("Ordenador Peppa Pig", 14.99);
		NoPerecedero NP1 = new NoPerecedero("Silla", 76.43, "Mueble");
		Perecedero PE1 = new Perecedero("Comida Casi Caducada", 76.43, 1);

		System.out.println(P1);
		System.out.println(NP1);
		System.out.println(PE1);
		
		System.out.println("--------------");
		
		System.out.println(P1.calcular(6));
		System.out.println(NP1.calcular(9));
		System.out.println(PE1.calcular(42));
		
		
	}

}
