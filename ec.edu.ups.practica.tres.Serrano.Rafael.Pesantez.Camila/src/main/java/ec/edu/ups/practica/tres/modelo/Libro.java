package ec.edu.ups.practica.tres.modelo;

public class Libro extends Persona {
	private String titulo;
	private String autor;
	private int año;
	private boolean disponible;
	
	public Libro() {
		
	}

	public Libro(String titulo, String autor, int año, boolean disponible) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.año = año;
		this.disponible = disponible;
	}

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

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	
	public void prestar() {
	    if (this.isDisponible()) {
	        this.setDisponible(false);  
	        System.out.println("Libro prestado con éxito");
	    } else {
	        System.out.println("El libro no está disponible para préstamo");
	    }
	}

	public void devolver() {
	    
	    if (!this.isDisponible()) {
	        this.setDisponible(true);  
	        System.out.println("Libro devuelto con éxito");
	    } else {
	        System.out.println("El libro ya está disponible, no se puede devolver");
	    }
	}

	
	public String mostrarInformacion() {
	    return "titulo: " + titulo + "\nautor: " + autor + "\naño: " + año ;
	}

}
