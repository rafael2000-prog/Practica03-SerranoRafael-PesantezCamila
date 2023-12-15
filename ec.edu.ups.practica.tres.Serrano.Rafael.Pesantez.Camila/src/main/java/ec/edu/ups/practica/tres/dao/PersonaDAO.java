package ec.edu.ups.practica.tres.dao;

import java.util.ArrayList;
import java.util.List;

import ec.edu.ups.practica.tres.idao.IPersonaDAO;
import ec.edu.ups.practica.tres.modelo.Persona;

public class PersonaDAO implements IPersonaDAO{
	
	private List<Persona> listaPersonas;

    public PersonaDAO() {
        listaPersonas = new ArrayList<>();
    }

    @Override
    public List<Persona> obtenerPersonas() {
        return listaPersonas;
    }

    @Override
    public Persona obtenerPersona(String identificacion) {
        for (Persona persona : listaPersonas) {
            if (persona.getIdentificacion().equalsIgnoreCase(identificacion)) {
                return persona;
            }
        }
        return null;
    }

    @Override
    public void crearPersona(Persona persona) {
        listaPersonas.add(persona);
    }

    @Override
    public boolean actualizarPersona(String identificacion, Persona persona) {
        for (int i = 0; i < listaPersonas.size(); i++) {
            Persona personaEncontrada = listaPersonas.get(i);
            if (personaEncontrada.getIdentificacion().equalsIgnoreCase(identificacion)) {
                listaPersonas.set(i, persona);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean eliminarPersona(String identificacion) {
        for (int i = 0; i < listaPersonas.size(); i++) {
            Persona persona = listaPersonas.get(i);
            if (persona.getIdentificacion().equalsIgnoreCase(identificacion)) {
                listaPersonas.remove(i);
                return true;
            }
        }
        return false;
    }

}
