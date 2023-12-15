package ec.edu.ups.practica.tres.vista;

import java.util.Scanner;

import ec.edu.ups.practica.tres.modelo.Biblioteca;

public class BibliotecaVista {
	
    private Scanner entrada;

    public BibliotecaVista() {
        entrada = new Scanner(System.in);
    }

    public Biblioteca ingresarDatosBiblioteca() {
        System.out.println("------ Ingreso de Nueva Biblioteca ------");
        System.out.print("Nombre de la Biblioteca: ");
        String nombre = entrada.next();
        System.out.print("Dirección de la Biblioteca: ");
        String direccion = entrada.next();

        return new Biblioteca(nombre, direccion);
    }
    public Biblioteca actualizarDatosBiblioteca() {
        System.out.println("------ Actualizar Biblioteca ------");
        System.out.print("Ingrese el nombre de la biblioteca a actualizar: ");
        String nombre = entrada.next();
        System.out.print("Ingrese la nueva dirección de la biblioteca: ");
        String direccion = entrada.next();

        return new Biblioteca(nombre, direccion);
    }

    public String eliminarDatosBiblioteca() {
        System.out.println("------ Eliminar Biblioteca ------");
        System.out.print("Ingrese el nombre de la biblioteca a eliminar: ");
        return entrada.next();
    }
    public String buscarDatosBiblioteca() {
        System.out.println("------Buscar Biblioteca------");
        System.out.print("Ingresa el nombre de la biblioteca a buscar: ");
        return entrada.next();
    }

    public void mostrarInformacionBiblioteca(String nombre, String direccion) {
        System.out.println("Datos de la Biblioteca:\nNombre: " + nombre + "\nDirección: " + direccion);
    }

    public void mostrarAlertas(String mensaje) {
        System.out.println(mensaje);
    }

}
