package ec.edu.ups.practica.tres.idao;

import java.util.List;
import ec.edu.ups.practica.tres.modelo.Prestamo;

public interface IPrestamoDAO {
    List<Prestamo> obtenerPrestamos();
    Prestamo obtenerPrestamo(String id);
    void crearPrestamo(Prestamo prestamo);
    boolean actualizarPrestamo(String id, Prestamo prestamo);
    boolean eliminarPrestamo(String id);
}

