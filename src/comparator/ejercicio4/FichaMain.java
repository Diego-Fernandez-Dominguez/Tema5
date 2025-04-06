package comparator.ejercicio4;

import java.util.Comparator;

public class FichaMain {
	public static void main(String[] args) {
		
		Ficha[] fichas=new Ficha[5];
		
		Comparator<Ficha> idAsc= (a,b)->{
			return a.getId()-b.getId();
		};
		
		Ficha f1 = new Libro(1, "Libro Hola", "Autor", "Titular");
		Ficha f2 = new Revista(2, "Revista Hola", 12, 2024);
		Ficha f3 = new DVD(3, "DVD Hola", "Director", 2016, "Documental");
		Ficha f4 = new DVD(4, "DVD wf", "Director", 2016, "Documental");
		Ficha f5 = new DVD(5, "DVD tjh", "Director", 2016, "Documental");

		
		
		
		
	}

}
