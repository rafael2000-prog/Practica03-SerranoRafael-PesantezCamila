package ec.edu.ups.practica.tres.vista;

import java.util.Date;
import java.util.Scanner;

import ec.edu.ups.practica.tres.modelo.Libro;
import ec.edu.ups.practica.tres.modelo.Prestamo;
import ec.edu.ups.practica.tres.modelo.Usuario;

public class PrestamoVista {
	
	private Scanner entrada;

    public PrestamoVista() {
        entrada = new Scanner(System.in);
    }

    public Prestamo ingresarDatosPrestamo() {
        System.out.println("------ Ingreso de Nuevo Préstamo ------");

        Libro libro = new Libro();
        Usuario usuario = new Usuario();

        System.out.println("¿Deseas ingresar una nueva fecha de préstamo? (s/n)");
        String respuesta = entrada.next();
        Date fechaPrestamo;

        if (respuesta.equalsIgnoreCase("s")) {
            System.out.println("Ingresa el día de préstamo: ");
            int diaPrestamo = obtenerEnteroDesdeEntrada();
            System.out.println("Ingresa el mes de préstamo: ");
            int mesPrestamo = obtenerEnteroDesdeEntrada();
            System.out.println("Ingresa el año de préstamo: ");
            int anioPrestamo = obtenerEnteroDesdeEntrada();
            fechaPrestamo = new Date(anioPrestamo - 1900, mesPrestamo - 1, diaPrestamo);
        } else {
            fechaPrestamo = new Date();
        }

        return new Prestamo(libro, usuario, fechaPrestamo, null);
    }

    private int obtenerEnteroDesdeEntrada() {
        while (!entrada.hasNextInt()) {
            System.out.println("Ingresa un valor válido. Debe ser un número entero.");
            entrada.next(); 
        }
        return entrada.nextInt();
    }


    public String buscarDatosPrestamo() {
        System.out.println("------ Buscar Préstamo ------");
        System.out.println("Ingresa el identificador del préstamo a buscar");
        return entrada.next();
    }

    public void mostrarInformacionPrestamo(Libro libro, Usuario usuario, Date fechaPrestamo, Date fechaDevolucion) {
        System.out.println("Datos del Préstamo:\nLibro: " + libro + "\nUsuario: " + usuario + "\nFecha de Préstamo: "
                + fechaPrestamo + "\nFecha de Devolución: "
                + (fechaDevolucion != null ? fechaDevolucion : "No devuelto"));
    }

    public void mostrarAlertas(String mensaje) {
        System.out.println(mensaje);
    }
}


