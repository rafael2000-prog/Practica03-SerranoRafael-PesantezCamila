package ec.edu.ups.practica.tres.controladores;

import java.util.List;

import ec.edu.ups.practica.tres.idao.IUsuarioDAO;
import ec.edu.ups.practica.tres.modelo.Usuario;
import ec.edu.ups.practica.tres.vista.UsuarioVista;

public class UsuarioControlador {
	private IUsuarioDAO usuarioDAO;
    private UsuarioVista usuarioVista;
    private Usuario usuario;

    public UsuarioControlador(IUsuarioDAO usuarioDAO, UsuarioVista usuarioVista) {
        this.usuarioDAO = usuarioDAO;
        this.usuarioVista = usuarioVista;
    }

    public void crearUsuario() {
        usuario = usuarioVista.ingresarDatosUsuario();
        usuarioDAO.crearUsuario(usuario);
    }

    public void actualizarUsuario() {
        usuario = usuarioVista.actualizarDatosUsuario();
        if (usuarioDAO.actualizarUsuario(usuario.getCorreo(), usuario)) {
            usuarioVista.mostrarAlertas("Usuario actualizado correctamente!");
        } else {
            usuarioVista.mostrarAlertas("Ha ocurrido un error al actualizar el usuario!");
        }
    }

    public void eliminarUsuario() {
        String correo = usuarioVista.buscarDatosUsuario();
        if (usuarioDAO.eliminarUsuario(correo)) {
            usuarioVista.mostrarAlertas("Usuario eliminado correctamente!");
        } else {
            usuarioVista.mostrarAlertas("Ha ocurrido un error al eliminar el usuario!");
        }
    }

    public void buscarUsuarioPorCorreo() {
        String correo = usuarioVista.buscarDatosUsuario();
        usuario = usuarioDAO.obtenerUsuario(correo);
        if (usuario == null) {
            usuarioVista.mostrarAlertas("Usuario no encontrado");
        } else {
            usuarioVista.mostrarInformacionUsuario(usuario.getNombre(), usuario.getIdentificacion(), usuario.getCorreo());
        }
    }

    public void listarUsuarios() {
        List<Usuario> listaUsuarios = usuarioDAO.obtenerUsuarios();
        for (Usuario usuario : listaUsuarios) {
            usuarioVista.mostrarInformacionUsuario(usuario.getNombre(), usuario.getIdentificacion(), usuario.getCorreo());
        }
    }
}