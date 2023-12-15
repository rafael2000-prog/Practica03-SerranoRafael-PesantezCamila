package ec.edu.ups.practica.tres.dao;

import java.util.ArrayList;
import java.util.List;

import ec.edu.ups.practica.tres.idao.IBibliotecaDAO;
import ec.edu.ups.practica.tres.modelo.Biblioteca;

public class BibliotecaDAO implements IBibliotecaDAO {
	
	private List<Biblioteca> listaBibliotecas;

    public BibliotecaDAO() {
        listaBibliotecas = new ArrayList<>();
    }

    @Override
    public List<Biblioteca> obtenerBibliotecas() {
        return listaBibliotecas;
    }

    @Override
    public Biblioteca obtenerBiblioteca(String nombre) {
        for (Biblioteca biblioteca : listaBibliotecas) {
            if (biblioteca.getNombre().equalsIgnoreCase(nombre)) {
                return biblioteca;
            }
        }
        return null;
    }

    @Override
    public void crearBiblioteca(Biblioteca biblioteca) {
        listaBibliotecas.add(biblioteca);
    }

    @Override
    public Biblioteca buscarBiblioteca(String nombre) {
        for (Biblioteca biblioteca : listaBibliotecas) {
            if (biblioteca.getNombre().equalsIgnoreCase(nombre)) {
                return biblioteca;
            }
        }
        return null;
    }

    @Override
    public boolean actualizarBiblioteca(String nombre, Biblioteca biblioteca) {
        for (int i = 0; i < listaBibliotecas.size(); i++) {
            Biblioteca bibliotecaEncontrada = listaBibliotecas.get(i);
            if (bibliotecaEncontrada.getNombre().equalsIgnoreCase(nombre)) {
                listaBibliotecas.set(i, biblioteca);
                return true;
            }
        }
        return false;
    }
    @Override
    public boolean eliminarBiblioteca(Biblioteca bibliotecaExistente) {
        return listaBibliotecas.remove(bibliotecaExistente);
    }


   
}


