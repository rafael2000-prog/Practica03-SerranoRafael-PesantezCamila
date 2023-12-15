package ec.edu.ups.practica.tres.dao;

import java.util.ArrayList;
import java.util.List;

import ec.edu.ups.practica.tres.idao.ILibroDAO;
import ec.edu.ups.practica.tres.modelo.Libro;

public class LibroDAO implements ILibroDAO{
	
	 private List<Libro> listaLibros;

	    public LibroDAO() {
	        listaLibros = new ArrayList<>();
	    }

	    @Override
	    public List<Libro> obtenerLibros() {
	        return listaLibros;
	    }

	    @Override
	    public Libro obtenerLibro(String titulo) {
	        for (Libro libro : listaLibros) {
	            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
	                return libro;
	            }
	        }
	        return null;
	    }

	    @Override
	    public void crearLibro(Libro libro) {
	        listaLibros.add(libro);
	    }

	    @Override
	    public Libro buscarLibro(String titulo) {
	        for (Libro libro : listaLibros) {
	            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
	                return libro;
	            }
	        }
	        return null;
	    }

	    @Override
	    public boolean actualizarLibro(String titulo, Libro libro) {
	        for (int i = 0; i < listaLibros.size(); i++) {
	            Libro libroEncontrado = listaLibros.get(i);
	            if (libroEncontrado.getTitulo().equalsIgnoreCase(titulo)) {
	                listaLibros.set(i, libro);
	                return true;
	            }
	        }
	        return false;
	    }

	    public boolean eliminarLibro(Libro libroExistente) {
	        for (int i = 0; i < listaLibros.size(); i++) {
	            Libro libro = listaLibros.get(i);
	            if (libro.equals(libroExistente)) {
	                listaLibros.remove(i);
	                return true;
	            }
	        }
	        return false;
	    }

}
