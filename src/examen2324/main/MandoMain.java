package examen2324.main;

import java.util.ArrayList;
import java.util.Collections;

import examen2324.clases.AireAcondicionado;
import examen2324.clases.Aspiradora;
import examen2324.clases.Mando;
import examen2324.clases.MiniCadena;
import examen2324.clases.Television;

public class MandoMain {
	public static void main(String[] args) {

		ArrayList<Mando> mandos = new ArrayList<Mando>();

		Mando mand1 = new Mando("Mando1", 34, 65, 100);
		mandos.add(mand1);

		Television tv1 = new Television("TV1", 40, 50, 560);
		mandos.add(tv1);

		MiniCadena mc1 = new MiniCadena("MC1", 350, 650, 650);
		mandos.add(mc1);

		Aspiradora as1 = new Aspiradora("AS1", 540, 760, 80);
		mandos.add(as1);

		AireAcondicionado ac1 = new AireAcondicionado("AC1", 70, 980, 10);
		mandos.add(ac1);

		Mando mand2 = new Mando("Mando2", 344, 656, 1070);
		mandos.add(mand2);

		Television tv2 = new Television("TV2", 470, 507, 5607);
		mandos.add(tv2);

		MiniCadena mc2 = new MiniCadena("MC2", 3570, 6507, 6750);
		mandos.add(mc2);

		Aspiradora as2 = new Aspiradora("AS2", 5470, 7670, 870);
		mandos.add(as2);

		AireAcondicionado ac2 = new AireAcondicionado("AC2", 770, 9807, 107);
		mandos.add(ac2);

		Collections.sort(mandos);
		System.out.println(mandos);
		System.out.println("\n");

		for (Mando mand : mandos) {

			if (mand instanceof Television) {
				mand.encenderMando();
				((Television) mand).setCanal(7);
				((Television) mand).subirVolumen();
				((Television) mand).bajarVolumen();
				System.out.println(mand);

			} else if (mand instanceof MiniCadena) {
				mand.encenderMando();
				((MiniCadena) mand).subirVolumen();
				((MiniCadena) mand).bajarVolumen();
				System.out.println(mand);

			} else if (mand instanceof Aspiradora) {
				((AireAcondicionado) mand).subirVelocidad();
				((AireAcondicionado) mand).bajarVelocidad();
				System.out.println(mand);

			} else if (mand instanceof AireAcondicionado) {
				mand.encenderMando();
				((AireAcondicionado) mand).setTipoModo("CALOR");
				((AireAcondicionado) mand).setTemperatura(5);
				((AireAcondicionado) mand).subirVelocidad();
				((AireAcondicionado) mand).bajarVelocidad();
				System.out.println(mand);

			}

		}

	}

}
