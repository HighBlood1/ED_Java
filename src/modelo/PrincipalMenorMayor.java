package modelo;

public class PrincipalMenorMayor {
	private static Libro libro1=null;
	private static Libro libro2=null;
	private static Libro libro3=null;
	private static Libro libro4=null;
		public static void main(String[] args) {
			String[] ciudades= {"Zitacuaro","Hidalgo","Tuxpan","Durango","Angangueo","Zitzicuaro"};
			System.out.println(getMenor(ciudades));
			System.out.println(getMayor(ciudades));
			System.out.println("-----------------------------------");
			
			llenarLibros();
			Libro[] libros= {libro1,libro2,libro3,libro4};
			System.out.println(getMenor(libros));
			System.out.println(getMayor(libros));
		}
		
		
	
	public static <T extends Comparable<T>> T getMenor(T[] datos) {
		T datoMenor=datos[0];
		for (int i = 1; i < datos.length; i++) {
			if (datoMenor.compareTo(datos[i])>0) {
				datoMenor=datos[i];
			}
		}
		return datoMenor;
	}
	public static <T extends Comparable<T>> T getMayor(T[] datos) {
		T datoMayor=datos[0];
		for (int i = 1; i < datos.length; i++) {
			if (datoMayor.compareTo(datos[i])<0) {
				datoMayor=datos[i];
			}
		}
		return datoMayor;
	}
	public static void llenarLibros(){
		libro1=new Libro();
		libro1.setClave("11111");
		libro1.setTitulo("Java");
		libro1.setAutor("Autor1");
		libro1.setEdicion("1");
		libro1.setEditorial("Editorial1");
		
		libro2=new Libro();
		libro2.setClave("2222");
		libro2.setTitulo("Kotlin");
		libro2.setAutor("Autor2");
		libro2.setEdicion("2");
		libro2.setEditorial("Editorial2");
libro3=new Libro();
		libro3.setClave("3333");
		libro3.setTitulo("Python");
		libro3.setAutor("Autor3");
		libro3.setEdicion("3");
		libro3.setEditorial("Editorial3");
libro4=new Libro();
		libro4.setClave("4444");
		libro4.setTitulo("C");
		libro4.setAutor("Autor4");
		libro4.setEdicion("4");
		libro4.setEditorial("Editorial4");

	}}