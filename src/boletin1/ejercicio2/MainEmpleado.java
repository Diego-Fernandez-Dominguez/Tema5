package boletin1.ejercicio2;

public class MainEmpleado {
	public static void main(String[] args) {
		Empleado E1 = new Empleado("Daniel");
		Directivo D1 = new Directivo("Adrian");
		Operario OP1 = new Operario("Sara");
		Oficial OF1 = new Oficial("Alicia");
		Tecnico T1 = new Tecnico("Euseboi");
		
		System.out.println(E1);
		System.out.println(D1);
		System.out.println(OP1);
		System.out.println(OF1);
		System.out.println(T1);
	}

}
