package ec.edu.ups.practica.tres.controladores;

import java.util.List;

import ec.edu.ups.practica.tres.idao.IPersonaDAO;
import ec.edu.ups.practica.tres.modelo.Persona;
import ec.edu.ups.practica.tres.vista.PersonaVista;

public class PersonaControlador {

    private IPersonaDAO personaDAO;
    private PersonaVista personaVista;
    private Persona persona;

    public PersonaControlador(IPersonaDAO personaDAO, PersonaVista personaVista) {
        this.personaDAO = personaDAO;
        this.personaVista = personaVista;
    }

    public void crearPersona() {
        persona = personaVista.ingresarDatosPersona();
        personaDAO.crearPersona(persona);
    }

    public void mostrarInformacionPersona() {
        String nombre = persona.getNombre();
        String identificacion = persona.getIdentificacion();
        personaVista.mostrarInformacionPersona(nombre, identificacion);
    }

    public void listarPersonas() {
        List<Persona> listaPersonas = personaDAO.obtenerPersonas();
        for (Persona persona : listaPersonas) {
            personaVista.mostrarInformacionPersona(persona.getNombre(), persona.getIdentificacion());
        }
    }
    public void actualizarPersona() {
        if (persona != null) {
            persona = personaVista.actualizarDatosPersona(persona);
            personaDAO.actualizarPersona(null, persona); 
            System.out.println("Persona actualizada correctamente.");
        } else {
            System.out.println("No se ha creado ninguna persona para actualizar.");
        }
    }

    public void eliminarPersona() {
        if (persona != null) {
            personaDAO.eliminarPersona(persona.getIdentificacion());
            System.out.println("Persona eliminada correctamente.");
            persona = null;
        } else {
            System.out.println("No se ha creado ninguna persona para eliminar.");
        }
    }

}
