package ec.edu.ups.practica.tres.vista;

import java.util.InputMismatchException;
import java.util.Scanner;

import ec.edu.ups.practica.tres.modelo.Libro;

public class LibroVista {

    private Scanner entrada;

    public LibroVista() {
        entrada = new Scanner(System.in);
    }

    public Libro ingresarDatosLibro() {
        try {
            System.out.println("------Ingreso de Nuevo Libro------");
            System.out.println("Ingresa el título del libro");
            String titulo = entrada.next();
            System.out.println("Ingresa el autor del libro");
            String autor = entrada.next();
            System.out.println("Ingresa el año del libro");
            int año = entrada.nextInt();

            return new Libro(titulo, autor, año, true);
        } catch (InputMismatchException e) {
            entrada.nextLine(); 
            System.out.println("Error: Ingresa un año válido (número entero).");
            return null;
        }
    }

    public Libro actualizarDatosLibro() {
        try {
            System.out.println("------Actualizar Libro------");
            System.out.println("Ingresa el título del libro a actualizar");
            String titulo = entrada.next();
            System.out.println("Ingresa el autor del libro");
            String autor = entrada.next();
            System.out.println("Ingresa el año del libro");
            int año = entrada.nextInt();

            return new Libro(titulo, autor, año, true);
        } catch (InputMismatchException e) {
            entrada.nextLine(); 
            System.out.println("Error: Ingresa un año válido (número entero).");
            return null;
        }
    }

    public String eliminarDatosLibro() {
        System.out.println("------Eliminar Libro------");
        System.out.println("Ingresa el título del libro a eliminar");
        return entrada.next();
    }

    public String buscarDatosLibro() {
        System.out.println("------Buscar Libro------");
        System.out.println("Ingresa el título del libro a buscar");
        return entrada.next();
    }

    public void mostrarInformacionLibro(String titulo, String autor, int año) {
        System.out.println("Datos del Libro: \nTítulo: " + titulo + "\nAutor: " + autor + "\nAño: " + año);
    }

    public void mostrarAlertas(String mensaje) {
        System.out.println(mensaje);
    }

    public void cerrarScanner() {
        entrada.close();
    }
}
