package modelo;

public class Alumno implements Accesible{
	private String numeroControl;
	private String nombre;
	private String paterno;
	private String materno;
	private String domicilio;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPaterno() {
		return paterno;
	}
	public void setPaterno(String paterno) {
		this.paterno = paterno;
	}
	public String getMaterno() {
		return materno;
	}
	public void setMaterno(String materno) {
		this.materno = materno;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	@Override
	public String getClave() {
		
		return numeroControl;
	}
	
	public void setClave(String clave) {
		this.numeroControl=clave;
	}
	@Override
	public String toString() {
		return "Alumno [numeroControl=" + numeroControl + ", nombre=" + nombre + ", paterno=" + paterno + ", materno="
				+ materno + ", domicilio=" + domicilio + "]";
	}
	
	
}
