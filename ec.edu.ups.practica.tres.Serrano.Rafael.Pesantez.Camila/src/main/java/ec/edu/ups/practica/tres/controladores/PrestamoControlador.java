package ec.edu.ups.practica.tres.controladores;

import java.util.List;

import ec.edu.ups.practica.tres.idao.IPrestamoDAO;
import ec.edu.ups.practica.tres.modelo.Prestamo;
import ec.edu.ups.practica.tres.vista.PrestamoVista;

public class PrestamoControlador {
	
	private IPrestamoDAO prestamoDAO;
    private PrestamoVista prestamoVista;

    public PrestamoControlador(IPrestamoDAO prestamoDAO, PrestamoVista prestamoVista) {
        this.prestamoDAO = prestamoDAO;
        this.prestamoVista = prestamoVista;
    }

    public void crearPrestamo() {
        Prestamo prestamo = prestamoVista.ingresarDatosPrestamo();
        prestamoDAO.crearPrestamo(prestamo);
    }

    public void actualizarPrestamo() {
    	String  id = prestamoVista.buscarDatosPrestamo();
        Prestamo prestamo = prestamoDAO.obtenerPrestamo(id);
        if (prestamo != null) {
            Prestamo nuevoPrestamo = prestamoVista.ingresarDatosPrestamo();
            if (prestamoDAO.actualizarPrestamo(id, nuevoPrestamo)) {
                prestamoVista.mostrarAlertas("Préstamo actualizado correctamente!");
            } else {
                prestamoVista.mostrarAlertas("Ha ocurrido un error al actualizar el préstamo.");
            }
        } else {
            prestamoVista.mostrarAlertas("No se encontró ningún préstamo con el ID proporcionado.");
        }
    }

    public void eliminarPrestamo() {
    	String  id = prestamoVista.buscarDatosPrestamo();
        if (prestamoDAO.eliminarPrestamo(id)) {
            prestamoVista.mostrarAlertas("Préstamo eliminado correctamente!");
        } else {
            prestamoVista.mostrarAlertas("Ha ocurrido un error al eliminar el préstamo.");
        }
    }

    public void listarPrestamos() {
        List<Prestamo> listaPrestamos = prestamoDAO.obtenerPrestamos();
        for (Prestamo prestamo : listaPrestamos) {
            prestamoVista.mostrarInformacionPrestamo(
                    prestamo.getLibro(), prestamo.getUsuario(),
                    prestamo.getFechaPrestamo(), prestamo.getFechaDevolucion()
            );
        }
    }
}
