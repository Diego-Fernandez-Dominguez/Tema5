package analisis.ejercicio4;

public class ContactoMain {
	public static void main(String[] args) {

		Empresa emp1 = new Empresa("Enemigos", 123456789, "Amiguis SA",
				"https://docs.google.com/document/d/1DYExP-VX6AlhiRHjLQjuqgZXsAxjin00gJkSjs1kpzg/edit?tab=t.0");

		Persona per1 = new Persona("PerracoIntenso", 234567891, "Euseboi", 1900);

		System.out.println(emp1);
		System.out.println("\n");

		System.out.println(per1);

	}

}
