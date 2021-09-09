package modelo;

import java.util.ArrayList;
import java.util.List;

public class Contenedor<T extends Accesible> {
	private List<T> contenedor;
	
	public Contenedor() {
		this.contenedor=new ArrayList<>();
	}
	
	public void agregar(T objeto){
		this.contenedor.add(objeto);
	}
	
	public T getObjeto(int posicion){
		return contenedor.get(posicion);
	}
	public int getPosicion(String clave){
		int i=0;
		while((i<contenedor.size()) && contenedor.get(i).getClave().equals(clave)){
			return i;
		}
		return -1;
	}
	
	public boolean existe(int posicion){
		return posicion<contenedor.size();
	}
	
	public String getDatos(){
		String salida="";
		for (int i = 0; i < contenedor.size(); i++) {
			salida+=contenedor.get(i)+"\n";
		}
		return salida;
	}
}
