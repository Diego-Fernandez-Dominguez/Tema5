package analisis.ejercicio3;

public class CuentaBancariaMain {
	public static void main(String[] args) {

		Titular tit1 = new Titular("12345678A", "Josebas", "Perez Ruiz", 123456789);
		Titular tit2 = new Titular("23456789B", "Euseboi", "Moreno Diaz ", 234567891);
		
		CuentaCorriente cc1 = new CuentaCorriente(1234, tit1, 0.21);

		
		System.out.println(cc1);
		
	}

}
