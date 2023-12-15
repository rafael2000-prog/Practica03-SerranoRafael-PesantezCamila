package ec.edu.ups.practica.tres.controladores;

import java.util.List;

import ec.edu.ups.practica.tres.idao.ILibroDAO;
import ec.edu.ups.practica.tres.modelo.Libro;
import ec.edu.ups.practica.tres.vista.LibroVista;

public class LibroControlador {

    private ILibroDAO libroDAO;
    private LibroVista libroVista;
    private Libro libro;

    public LibroControlador(ILibroDAO libroDAO, LibroVista libroVista) {
        this.libroDAO = libroDAO;
        this.libroVista = libroVista; 	
    }

    public void crearLibro() {
        libro = libroVista.ingresarDatosLibro();
        libroDAO.crearLibro(libro);
    }
    

    public void mostrarInformacionLibro() {
        String titulo = libro.getTitulo();
        String autor = libro.getAutor();
        int año = libro.getAño();
        libroVista.mostrarInformacionLibro(titulo, autor, año);
    }

    public void listarLibros() {
        List<Libro> listaLibros = libroDAO.obtenerLibros();
        for (Libro libro : listaLibros) {
            libroVista.mostrarInformacionLibro(libro.getTitulo(), libro.getAutor(), libro.getAño());
        }
    }
    public void actualizarLibro() {
        String titulo = libroVista.buscarDatosLibro();
        Libro libroExistente = libroDAO.buscarLibro(titulo);
        if (libroExistente != null) {
            Libro libroActualizado = libroVista.actualizarDatosLibro();
            if (libroActualizado != null) {
                libroDAO.actualizarLibro(titulo, libroActualizado);
                libroVista.mostrarAlertas("Libro actualizado correctamente.");
            } else {
                libroVista.mostrarAlertas("Error al ingresar los datos del libro actualizado.");
            }
        } else {
            libroVista.mostrarAlertas("Libro no encontrado.");
        }
    }

    public void eliminarLibro() {
        String titulo = libroVista.eliminarDatosLibro();
        Libro libroExistente = libroDAO.buscarLibro(titulo);
        if (libroExistente != null) {
            libroDAO.eliminarLibro(libroExistente);
            libroVista.mostrarAlertas("Libro eliminado correctamente.");
        } else {
            libroVista.mostrarAlertas("Libro no encontrado.");
        }
    }
}

