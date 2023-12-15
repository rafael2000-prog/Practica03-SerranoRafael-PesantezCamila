package ec.edu.ups.practica.tres.dao;

import java.util.ArrayList;
import java.util.List;

import ec.edu.ups.practica.tres.modelo.Usuario;
import ec.edu.ups.practica.tres.idao.IUsuarioDAO;

public class UsuarioDAO implements IUsuarioDAO{
	
	private List<Usuario> listaUsuarios;

    public UsuarioDAO() {
        listaUsuarios = new ArrayList<>();
    }

    @Override
    public List<Usuario> obtenerUsuarios() {
        return listaUsuarios;
    }

    @Override
    public Usuario obtenerUsuario(String identificacion) {
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getIdentificacion().equalsIgnoreCase(identificacion)) {
                return usuario;
            }
        }
        return null;
    }

    @Override
    public void crearUsuario(Usuario usuario) {
        listaUsuarios.add(usuario);
    }

    @Override
    public boolean actualizarUsuario(String identificacion, Usuario usuario) {
        for (int i = 0; i < listaUsuarios.size(); i++) {
            Usuario usuarioEncontrado = listaUsuarios.get(i);
            if (usuarioEncontrado.getIdentificacion().equalsIgnoreCase(identificacion)) {
                listaUsuarios.set(i, usuario);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean eliminarUsuario(String identificacion) {
        for (int i = 0; i < listaUsuarios.size(); i++) {
            Usuario usuario = listaUsuarios.get(i);
            if (usuario.getIdentificacion().equalsIgnoreCase(identificacion)) {
                listaUsuarios.remove(i);
                return true;
            }
        }
        return false;
    }
	

}
