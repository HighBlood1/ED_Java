package modelo;

public class Principal {

	public static void main(String[] args) {
				
		Contenedor<Libro> contenedor=new Contenedor<>();
		  Contenedor<Alumno> grupo=new Contenedor<>();
		  
		  
		  llenarAlumnos(grupo);
		  llenarLibros(contenedor);
		  
		  System.out.println(contenedor.getDatos());
		  System.out.println(grupo.getDatos());
	}
	
	 public static void llenarLibros(Contenedor<Libro> contenedor) {
		 Libro  libro1 = new Libro(); 
		  libro1.setClave("1111"); 
		  libro1.setAutor("Autor 1"); 
		  libro1.setTitulo("Titulo 1"); 
		  libro1.setIdioma("Idioma 1"); 
		  libro1.setEdicion("Edicion 1"); 
		  libro1.setEditorial("Editorial 1"); 
		  Libro  libro2 = new Libro(); 
		  libro2.setClave("2222"); 
		  libro2.setAutor("Autor 2"); 
		  libro2.setTitulo("Titulo 2"); 
		  libro2.setIdioma("Idioma 2"); 
		  libro2.setEdicion("Edicion 2"); 
		  libro2.setEditorial("Editorial 2"); 
		  Libro  libro3 = new Libro(); 
		  libro3.setClave("3333"); 
		  libro3.setAutor("Autor 3"); 
		  libro3.setTitulo("Titulo 3"); 
		  libro1.setIdioma("Idioma 3"); 
		  libro3.setEdicion("Edicion 3"); 
		  libro3.setEditorial("Editorial 3"); 
		  Libro  libro4 = new Libro(); 
		  libro4.setClave("4444"); 
		  libro4.setAutor("Autor 4"); 
		  libro4.setIdioma("Idioma 4"); 
		  libro4.setTitulo("Titulo 4"); 
		  libro4.setEdicion("Edicion 4"); 
		  libro4.setEditorial("Editorial 4");
		  
		  contenedor.agregar(libro1);
		  contenedor.agregar(libro2);
		  contenedor.agregar(libro3);
		  contenedor.agregar(libro4);

		  
		 
		 }
		 public static void llenarAlumnos(Contenedor<Alumno> grupo) {
		  Alumno alumno1=new Alumno();
		  alumno1.setClave("AAAA");
		  alumno1.setNombre("AlumnoA");
		  alumno1.setPaterno("Paterno1A");
		  alumno1.setMaterno("Materno1A");
		  alumno1.setDomicilio("Domicilio1A");
		  
		  Alumno alumno2=new Alumno();
		  alumno1.setClave("BBBB");
		  alumno1.setNombre("Alumno1B");
		  alumno1.setPaterno("Paterno1B");
		  alumno1.setMaterno("Materno1B");
		  alumno1.setDomicilio("Domicilio1B");
		  
		  grupo.agregar(alumno1);
		  grupo.agregar(alumno2);
		  
		 }

}
