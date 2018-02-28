package com.cice.crud.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.cice.crud.domain.Usuario;
import com.cice.crud.service.UsuarioService;
import com.opensymphony.xwork2.ActionSupport;

public class UsuarioAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	private List<Usuario> usuarios;
	private Usuario usuario;
	
	private UsuarioService usuarioService;
	
	/*Listamos todos los Usuarios de la tabla Usuarios*/
	public String listUsuarios() throws Exception {
		usuarios= usuarioService.list();
		return SUCCESS;
		
	}
	
	public String newUsuario() throws Exception {
		if ((usuario != null) && (usuario.getIdUsuario() != null)) {
			usuario = usuarioService.load(usuario.getIdUsuario());
	    }
		return SUCCESS;
	}
	
	public String saveUsuario() throws Exception{
		
        if (usuario.getIdUsuario() == null) {
        	usuarioService.add(usuario);
        } else {
        	usuarioService.update(usuario);
        }
        
        HttpServletRequest request = ServletActionContext.getRequest();
        HttpSession session = request.getSession();
        
        session.setAttribute("IdUsuario", usuario.getIdUsuario());
		return SUCCESS;
		
	
	}
	
	public String deleteUsuario() throws Exception{

		usuarioService.delete(usuario.getIdUsuario());
		return SUCCESS;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public UsuarioService getUsuarioService() {
		return usuarioService;
	}

	public void setUsuarioService(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}
	
	

	
	
}
