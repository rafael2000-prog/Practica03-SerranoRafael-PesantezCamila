package ec.edu.ups.practica.tres.vista;

import java.util.Scanner;

import ec.edu.ups.practica.tres.modelo.Persona;

public class PersonaVista {
	
	 private Scanner entrada;

	    public PersonaVista() {
	        entrada = new Scanner(System.in);
	    }

	    public Persona ingresarDatosPersona() {
	        System.out.println("------Ingreso de Nueva Persona------");
	        System.out.println("Ingresa el nombre de la persona");
	        String nombre = entrada.next();
	        System.out.println("Ingresa la identificación de la persona");
	        String identificacion = entrada.next();

	        return new Persona(nombre, identificacion);
	    }
	    public Persona actualizarDatosPersona(Persona persona) {
	        System.out.println("------Actualización de Datos de Persona------");
	        System.out.println("Nombre actual: " + persona.getNombre());
	        System.out.println("Ingresa el nuevo nombre de la persona");
	        String nuevoNombre = entrada.next();
	        persona.setNombre(nuevoNombre);


	        System.out.println("Datos actualizados correctamente.");
	        return persona;
	    }

	    public boolean confirmarEliminacion() {
	        System.out.println("¿Estás seguro de que deseas eliminar esta persona? (S/N)");
	        String respuesta = entrada.next().toUpperCase();
	        return respuesta.equals("S");
	    }


	    public void mostrarInformacionPersona(String nombre, String identificacion) {
	        System.out.println("Datos de la Persona: \nNombre: " + nombre + "\nIdentificación: " + identificacion);
	    }

	    public void mostrarAlertas(String mensaje) {
	        System.out.println(mensaje);
	    }
}
