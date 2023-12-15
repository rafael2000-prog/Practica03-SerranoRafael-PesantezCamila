package ec.edu.ups.practica.tres.modelo;

import java.util.ArrayList;
import java.util.List;



public class Biblioteca {
	
	private String nombre;
	private String direccion;
	private List<Usuario> listaUsuario;
	
	
	public Biblioteca() {
		this.listaUsuario = new ArrayList<>();
	}

	public Biblioteca(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.listaUsuario = new ArrayList<>();
	}

	public Biblioteca(String nombre, String direccion, List<Usuario> listaUsuario) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.listaUsuario = listaUsuario;
		this.listaUsuario = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	
	}
	
	public void registrarUsuario(Usuario usuario) {
		listaUsuario.add(usuario);
	}
	
	public Biblioteca( List<Usuario> listaUsuario) {
		super();
		this.listaUsuario = listaUsuario;
	}
	

	

	public List<Usuario> getListaUsuario() {
		return listaUsuario;
	}

	public void setListaUsuario(List<Usuario> listaUsuario) {
		this.listaUsuario = listaUsuario;
	}
	
	public String toString() {
		return "Biblioteca [nombre=" + nombre + ", direccion=" + direccion + "]";
	}

}

