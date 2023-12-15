package ec.edu.ups.practica.tres.idao;

import java.util.List;
import ec.edu.ups.practica.tres.modelo.Persona;

public interface IPersonaDAO {
	
	 List<Persona> obtenerPersonas();
	 Persona obtenerPersona(String identificacion);
	 void crearPersona(Persona persona);
	 boolean actualizarPersona(String identificacion, Persona persona);
	 boolean eliminarPersona(String identificacion);

}
