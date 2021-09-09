package modelo;

public class Pareja<T,K> {
	private T miembroUno;
	private K miembroDos;
	
	
	
	public Pareja(T miembroUno, K miembroDos) {
		super();
		this.miembroUno = miembroUno;
		this.miembroDos = miembroDos;
	}
	public T getMiembroUno() {
		return miembroUno;
	}
	public void setMiembroUno(T miembroUno) {
		this.miembroUno = miembroUno;
	}
	public K getMiembroDos() {
		return miembroDos;
	}
	public void setMiembroDos(K miembroDos) {
		this.miembroDos = miembroDos;
	}

	
	
}
