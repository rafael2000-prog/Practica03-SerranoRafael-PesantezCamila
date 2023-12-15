package ec.edu.ups.practica.tres.controladores;

import java.util.List;

import ec.edu.ups.practica.tres.idao.IBibliotecaDAO;
import ec.edu.ups.practica.tres.modelo.Biblioteca;
import ec.edu.ups.practica.tres.vista.BibliotecaVista;

public class BibliotecaControlador {

    private IBibliotecaDAO bibliotecaDAO;
    private BibliotecaVista bibliotecaVista;
    private Biblioteca biblioteca;

    public BibliotecaControlador(IBibliotecaDAO bibliotecaDAO, BibliotecaVista bibliotecaVista) {
        this.bibliotecaDAO = bibliotecaDAO;
        this.bibliotecaVista = bibliotecaVista;
    }

    public void crearBiblioteca() {
        biblioteca = bibliotecaVista.ingresarDatosBiblioteca();
        bibliotecaDAO.crearBiblioteca(biblioteca);
    }

    public void mostrarInformacionBiblioteca() {
        String nombre = biblioteca.getNombre();
        String direccion = biblioteca.getDireccion();
        bibliotecaVista.mostrarInformacionBiblioteca(nombre, direccion);
    }

    public void listarBibliotecas() {
        List<Biblioteca> listaBibliotecas = bibliotecaDAO.obtenerBibliotecas();
        for (Biblioteca biblioteca : listaBibliotecas) {
            bibliotecaVista.mostrarInformacionBiblioteca(biblioteca.getNombre(), biblioteca.getDireccion());
        }
    }
    public void actualizarBiblioteca() {
        String nombre = bibliotecaVista.buscarDatosBiblioteca();
        Biblioteca bibliotecaExistente = bibliotecaDAO.buscarBiblioteca(nombre);
        if (bibliotecaExistente != null) {
            Biblioteca bibliotecaActualizada = bibliotecaVista.actualizarDatosBiblioteca();
            if (bibliotecaActualizada != null) {
                bibliotecaDAO.actualizarBiblioteca(nombre, bibliotecaActualizada);
                bibliotecaVista.mostrarAlertas("Biblioteca actualizada correctamente.");
            } else {
                bibliotecaVista.mostrarAlertas("Error al ingresar los datos de la biblioteca actualizada.");
            }
        } else {
            bibliotecaVista.mostrarAlertas("Biblioteca no encontrada.");
        }
    }

    public void eliminarBiblioteca() {
        String nombre = bibliotecaVista.eliminarDatosBiblioteca();
        Biblioteca bibliotecaExistente = bibliotecaDAO.buscarBiblioteca(nombre);
        if (bibliotecaExistente != null) {
            bibliotecaDAO.eliminarBiblioteca(bibliotecaExistente);
            bibliotecaVista.mostrarAlertas("Biblioteca eliminada correctamente.");
        } else {
            bibliotecaVista.mostrarAlertas("Biblioteca no encontrada.");
        }
    }

}
