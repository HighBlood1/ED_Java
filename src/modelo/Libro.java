package modelo;

public class Libro implements Accesible,Comparable<Libro>{
	private String isbn;
	private String titulo;
	private String autor;
	private String editorial;
	private String edicion;
	private String idioma;
	
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public String getEdicion() {
		return edicion;
	}
	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	public String getClave() {
		
		return isbn;
	}
	
	public void setClave(String clave) {
		this.isbn=clave;
	}
	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", editorial=" + editorial
				+ ", edicion=" + edicion + ", idioma=" + idioma + "]";
	}
	@Override
	public int compareTo(Libro libro) {
		// TODO Auto-generated method stub
		return this.titulo.compareTo(libro.titulo);
	}
	
	
	
}
