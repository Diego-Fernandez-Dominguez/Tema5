package analisis.ejercicio4;

public class Empresa extends Contacto {

	private String nombreEmpresa;
	private String paginaWeb;

	public Empresa(String nombre, int telefono, String nombreEmpresa, String paginaWeb) {
		super(nombre, telefono);

		if (nombreEmpresa != null && !nombreEmpresa.isBlank()) {
			this.nombreEmpresa = nombreEmpresa;
		}

		if (paginaWeb != null && !paginaWeb.isBlank()) {
			this.paginaWeb = paginaWeb;
		}

	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public String getPaginaWeb() {
		return paginaWeb;
	}

	public void setPaginaWeb(String paginaWeb) {
		this.paginaWeb = paginaWeb;
	}

	@Override
	public String toString() {
		return super.toString() + ", NombreEmpresa: " + nombreEmpresa + ", PaginaWeb: " + paginaWeb;
	}

}
