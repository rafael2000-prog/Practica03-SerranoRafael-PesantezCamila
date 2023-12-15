package ec.edu.ups.practica.tres.vista;

import java.util.Scanner;

import ec.edu.ups.practica.tres.modelo.Usuario;

public class UsuarioVista {
    private Scanner entrada;

    public UsuarioVista() {
        entrada = new Scanner(System.in);
    }

    public Usuario ingresarDatosUsuario() {
        System.out.println("------ Ingreso de Nuevo Usuario ------");
        System.out.println("Ingresa el correo del usuario");
        String correo = entrada.next();

        return new Usuario(correo);
    }

    public Usuario actualizarDatosUsuario() {
        System.out.println("------ Actualizar Usuario ------");
        System.out.println("Ingresa el correo del usuario a actualizar");
        String correo = entrada.next();

        return new Usuario(correo);
    }

    public String buscarDatosUsuario() {
        System.out.println("------ Buscar Usuario ------");
        System.out.print("Ingresa el correo del usuario a buscar: ");
        return entrada.next();
    }

    public void mostrarInformacionUsuario(String nombre, String identificacion, String correo) {
        System.out.println("Datos del Usuario:\nNombre: " + nombre + "\nIdentificación: " + identificacion
                + "\nCorreo: " + correo);
    }

    public void mostrarAlertas(String mensaje) {
        System.out.println(mensaje);
    }
}