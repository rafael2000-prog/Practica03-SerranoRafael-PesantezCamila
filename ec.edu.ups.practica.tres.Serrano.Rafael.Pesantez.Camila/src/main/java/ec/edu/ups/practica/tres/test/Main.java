package ec.edu.ups.practica.tres.test;

import java.util.Scanner;

import ec.edu.ups.practica.tres.controladores.BibliotecaControlador;
import ec.edu.ups.practica.tres.controladores.LibroControlador;
import ec.edu.ups.practica.tres.controladores.PersonaControlador;
import ec.edu.ups.practica.tres.controladores.PrestamoControlador;
import ec.edu.ups.practica.tres.controladores.UsuarioControlador;
import ec.edu.ups.practica.tres.dao.BibliotecaDAO;
import ec.edu.ups.practica.tres.dao.LibroDAO;
import ec.edu.ups.practica.tres.dao.PersonaDAO;
import ec.edu.ups.practica.tres.dao.PrestamoDAO;
import ec.edu.ups.practica.tres.dao.UsuarioDAO;
import ec.edu.ups.practica.tres.vista.BibliotecaVista;
import ec.edu.ups.practica.tres.vista.LibroVista;
import ec.edu.ups.practica.tres.vista.PersonaVista;
import ec.edu.ups.practica.tres.vista.PrestamoVista;
import ec.edu.ups.practica.tres.vista.UsuarioVista;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LibroControlador libroControlador = new LibroControlador(new LibroDAO(), new LibroVista());
        BibliotecaControlador bibliotecaControlador = new BibliotecaControlador(new BibliotecaDAO(), new BibliotecaVista());
        PersonaControlador personaControlador = new PersonaControlador(new PersonaDAO(), new PersonaVista());
        PrestamoControlador prestamoControlador = new PrestamoControlador(new PrestamoDAO(), new PrestamoVista());
        UsuarioControlador usuarioControlador = new UsuarioControlador(new UsuarioDAO(), new UsuarioVista());

        int opcion;
        do {
            System.out.println("Menú Principal");
            System.out.println("1. Gestionar Bibliotecas");
            System.out.println("2. Gestionar Libros");
            System.out.println("3. Gestionar Personas");
            System.out.println("4. Gestionar Préstamos");
            System.out.println("5. Gestionar Usuarios");
            System.out.println("6. Salir");
            System.out.print("Ingrese la opción deseada: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    gestionarBibliotecas(bibliotecaControlador, scanner);
                    break;
                case 2:
                    gestionarLibros(libroControlador, scanner);
                    break;
                case 3: 	
                    gestionarPersonas(personaControlador, scanner);
                    break;
                case 4:
                    gestionarPrestamos(prestamoControlador, scanner);
                    break;
                case 5:
                    gestionarUsuarios(usuarioControlador, scanner);
                    break;
                case 6:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 6);

        scanner.close();
    }


    private static void gestionarBibliotecas(BibliotecaControlador bibliotecaControlador, Scanner scanner) {
        int opcion;
        do {
            System.out.println("Menú de Gestionar Bibliotecas");
            System.out.println("1. Crear Biblioteca");
            System.out.println("2. Mostrar Información de Biblioteca");
            System.out.println("3. Listar Bibliotecas");
            System.out.println("4. Actualizar Biblioteca");
            System.out.println("5. Eliminar Biblioteca");
            System.out.println("6. Volver al Menú Principal");
            System.out.print("Ingrese la opción deseada: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    bibliotecaControlador.crearBiblioteca();
                    break;
                case 2:
                    bibliotecaControlador.mostrarInformacionBiblioteca();
                    break;
                case 3:
                    bibliotecaControlador.listarBibliotecas();
                    break;
                case 4:
                    bibliotecaControlador.actualizarBiblioteca();
                    break;
                case 5:
                    bibliotecaControlador.eliminarBiblioteca();
                    break;
                case 6:
                    System.out.println("Volviendo al Menú Principal");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 6);
    }

    private static void gestionarLibros(LibroControlador libroControlador, Scanner scanner) {
        int opcion;
        do {
            System.out.println("Menú de Gestionar Libros");
            System.out.println("1. Crear Libro");
            System.out.println("2. Mostrar Información de Libro");
            System.out.println("3. Listar Libros");
            System.out.println("4. Actualizar Libro");
            System.out.println("5. Eliminar Libro");
            System.out.println("6. Volver al Menú Principal");
            System.out.print("Ingrese la opción deseada: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    libroControlador.crearLibro();
                    break;
                case 2:
                    libroControlador.mostrarInformacionLibro();
                    break;
                case 3:
                    libroControlador.listarLibros();
                    break;
                case 4:
                    libroControlador.actualizarLibro();
                    break;
                case 5:
                    libroControlador.eliminarLibro();
                    break;
                case 6:
                    System.out.println("Volviendo al Menú Principal");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 6);
    }
    private static void gestionarPersonas(PersonaControlador personaControlador, Scanner scanner) {
        int opcion;
        do {
            System.out.println("Menú de Gestionar Personas");
            System.out.println("1. Crear Persona");
            System.out.println("2. Mostrar Información de Persona");
            System.out.println("3. Listar Personas");
            System.out.println("4. Actualizar Persona");
            System.out.println("5. Eliminar Persona");
            System.out.println("6. Volver al Menú Principal");
            System.out.print("Ingrese la opción deseada: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    personaControlador.crearPersona();
                    break;
                case 2:
                    personaControlador.mostrarInformacionPersona();
                    break;
                case 3:
                    personaControlador.listarPersonas();
                    break;
                case 4:
                    personaControlador.actualizarPersona();
                    break;
                case 5:
                    personaControlador.eliminarPersona();
                    break;
                case 6:
                    System.out.println("Volviendo al Menú Principal");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 6);
    }
    private static void gestionarPrestamos(PrestamoControlador prestamoControlador, Scanner scanner) {
        int opcion;
        do {
            System.out.println("Menú de Gestionar Préstamos");
            System.out.println("1. Crear Préstamo");
            System.out.println("2. Actualizar Préstamo");
            System.out.println("3. Eliminar Préstamo");
            System.out.println("4. Listar Préstamos");
            System.out.println("5. Volver al Menú Principal");
            System.out.print("Ingrese la opción deseada: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    prestamoControlador.crearPrestamo();
                    break;
                case 2:
                    prestamoControlador.actualizarPrestamo();
                    break;
                case 3:
                    prestamoControlador.eliminarPrestamo();
                    break;
                case 4:
                    prestamoControlador.listarPrestamos();
                    break;
                case 5:
                    System.out.println("Volviendo al Menú Principal");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 5);
    }
    private static void gestionarUsuarios(UsuarioControlador usuarioControlador, Scanner scanner) {
        int opcion;
        do {
            System.out.println("Menú de Gestionar Usuarios");
            System.out.println("1. Crear Usuario");
            System.out.println("2. Actualizar Usuario");
            System.out.println("3. Eliminar Usuario");
            System.out.println("4. Buscar Usuario por Correo");
            System.out.println("5. Listar Usuarios");
            System.out.println("6. Volver al Menú Principal");
            System.out.print("Ingrese la opción deseada: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    usuarioControlador.crearUsuario();
                    break;
                case 2:
                    usuarioControlador.actualizarUsuario();
                    break;
                case 3:
                    usuarioControlador.eliminarUsuario();
                    break;
                case 4:
                    usuarioControlador.buscarUsuarioPorCorreo();
                    break;
                case 5:
                    usuarioControlador.listarUsuarios();
                    break;
                case 6:
                    System.out.println("Volviendo al Menú Principal");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 6);
    }
}
    
