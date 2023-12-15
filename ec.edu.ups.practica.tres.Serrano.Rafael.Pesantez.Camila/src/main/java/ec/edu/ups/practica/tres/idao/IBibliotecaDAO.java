package ec.edu.ups.practica.tres.idao;

import java.util.List;
import ec.edu.ups.practica.tres.modelo.Biblioteca;

public interface IBibliotecaDAO {
	
	 List<Biblioteca> obtenerBibliotecas();
	 Biblioteca obtenerBiblioteca(String nombre);
	 void crearBiblioteca(Biblioteca biblioteca);
	 boolean actualizarBiblioteca(String nombre, Biblioteca biblioteca);
	 boolean eliminarBiblioteca(Biblioteca bibliotecaExistente);
	 Biblioteca buscarBiblioteca(String Titulo);
	

}
