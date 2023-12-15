package ec.edu.ups.practica.tres.dao;

import java.util.ArrayList;
import java.util.List;

import ec.edu.ups.practica.tres.idao.IPrestamoDAO;
import ec.edu.ups.practica.tres.modelo.Prestamo;

public class PrestamoDAO implements IPrestamoDAO{
    private List<Prestamo> listaPrestamos;

    public PrestamoDAO() {
        listaPrestamos = new ArrayList<>();
    }

    @Override
    public List<Prestamo> obtenerPrestamos() {
        return listaPrestamos;
    }

    @Override
    public Prestamo obtenerPrestamo(String id) {
        for (Prestamo prestamo : listaPrestamos) {
            if (String.valueOf(prestamo.getId()).equals(id)) {
                return prestamo;
            }
        }
        return null;
    }

    @Override
    public void crearPrestamo(Prestamo prestamo) {
        listaPrestamos.add(prestamo);
    }

    @Override
    public boolean actualizarPrestamo(String id, Prestamo prestamo) {
        for (int i = 0; i < listaPrestamos.size(); i++) {
            Prestamo prestamoEncontrado = listaPrestamos.get(i);
            if (String.valueOf(prestamoEncontrado.getId()).equals(id)) {
                listaPrestamos.set(i, prestamo);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean eliminarPrestamo(String id) {
        for (int i = 0; i < listaPrestamos.size(); i++) {
            Prestamo prestamo = listaPrestamos.get(i);
            if (String.valueOf(prestamo.getId()).equals(id)) {
                listaPrestamos.remove(i);
                return true;
            }
        }
        return false;
    }

}
