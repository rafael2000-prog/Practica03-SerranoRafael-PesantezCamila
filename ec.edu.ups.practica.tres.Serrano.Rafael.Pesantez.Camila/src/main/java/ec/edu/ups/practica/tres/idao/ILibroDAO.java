package ec.edu.ups.practica.tres.idao;

import java.util.List;

import ec.edu.ups.practica.tres.modelo.Libro;

public interface ILibroDAO {
    
    List<Libro> obtenerLibros();
    Libro obtenerLibro(String titulo);
    void crearLibro(Libro libro);
    boolean actualizarLibro(String titulo, Libro libro);
    boolean eliminarLibro(Libro libroExistente);
    Libro buscarLibro(String titulo);


}

