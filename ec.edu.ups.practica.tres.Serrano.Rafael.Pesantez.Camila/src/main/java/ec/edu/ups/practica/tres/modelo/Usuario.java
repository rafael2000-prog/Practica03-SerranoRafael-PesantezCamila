package ec.edu.ups.practica.tres.modelo;

import java.util.Date;
import java.util.ArrayList;


public class Usuario extends Persona {
    private String correo;

    public Usuario() {
        super();
        this.setListaPrestamo(new ArrayList<>());
    }

    public Usuario(String correo) {
        super(); 
        this.correo = correo;
        this.setListaPrestamo(new ArrayList<>());
    }

    public Usuario(String nombre, String identificacion, String correo) {
        super(nombre, identificacion);
        this.correo = correo;
        this.setListaPrestamo(new ArrayList<>());
    }

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public ArrayList<Prestamo> getListaPrestamo() {
		return listaPrestamo;
	}

	public void setListaPrestamo(ArrayList<Prestamo> listaPrestamo) {
		this.listaPrestamo = listaPrestamo;
	}
	
	public String solicitarPrestamo(Libro libro) {
	    if (libro.isDisponible()) {
	        Prestamo prestamo = new Prestamo(libro, this, new Date(), null);
	        this.getListaPrestamo().add(prestamo);
	        libro.prestar();  

	        return "Préstamo solicitado con éxito";
	    } else {
	        return "El libro no está disponible para préstamo en este momento";
	    }
	}

	public int devolverLibro(Libro libro) {
		return 0;
		
	}
	
	public String mostrarInformacion() {
		
		return super.toString() + "Usuario [correo=" + correo + "]";
	}

}

