package practicas.boxeador;

public class Boxeador extends Persona implements BoxingLife {

	private String apodo;

	public Boxeador(String dni, int edad, String apodo) {
		super(dni);
		this.apodo = apodo;
	}

	@Override
	public void pegar() {
		System.out.println(this.apodo + ": PUM PAM PUM");
	}

	@Override
	public void emborracharse() {
		System.out.println(this.apodo + ": UGH AGH UGH");
	}

	@Override
	public void llegarCasa() {
		System.out.println(this.apodo + ": Hola carinyooooo, estoy en casaaaa");
	}

	@Override
	public void hablar() {
		System.out.println("SOY EL " + this.apodo);
	}

}
