package ec.edu.ups.practica.tres.modelo;

import java.util.ArrayList;

public class Persona {
    private String nombre;
    private String identificacion;
    protected ArrayList<Prestamo> listaPrestamo;

    public Persona() {
    }

    public Persona(String nombre, String identificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.listaPrestamo = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", identificacion=" + identificacion + "]";
    }

    public String mostrarInformacion() {
        return null;
    }
}
