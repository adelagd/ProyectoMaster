package com.cice.crud.web;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.cice.crud.domain.Usuario;
import com.cice.crud.service.UsuarioService;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware {

	private static final long serialVersionUID = -3434561352924343132L;

	// Generate getters and setters....
	private String  msg;
	private SessionMap<String, Object> sessionMap;

	private List<Usuario> usuarios;
	private UsuarioService usuarioService;
	private Usuario usuario,user;
	
	
	public String isLoged() {
		
		HttpSession session = ServletActionContext.getRequest().getSession(true);
		
		return ((String) session.getAttribute("IdUsuario"));
		
		
	}
	
	public void setSession(Map<String, Object> map) {
		sessionMap = (SessionMap<String, Object>) map;
	}


	
	@Override
	public String execute() throws Exception {
		
		

		HttpSession session = ServletActionContext.getRequest().getSession(true);
		
		try {
			usuarios = usuarioService.searchUsuario(usuario.getEmail());
		}catch (Exception e) {
			System.out.println("Error buscando al usuario:");
		} 
		if (usuarios.isEmpty()) {
			return "LOGIN";
		}else {
			user=usuarios.get(0);
		}

		if ((usuario.getEmail() != null) && (usuario.getEmail().equals(user.getEmail())) ){

			if (usuario.getPassword().equals(user.getPassword())) {
				// add the attribute in session				
				sessionMap.put("IdUsuario", user.getIdUsuario());

				return "SUCCESS";
			} else {
				msg = "Invalid Password";
				return "LOGIN";
			}
		} else {

			String getSessionAttr = (String) session.getAttribute("idUsuario");
			
			if (getSessionAttr != null) {

				return "SUCCESS";

			} else {
				return "LOGIN";
			}
		}
	}

	public String logout() {
		
		sessionMap.remove("IdUsuario");
		sessionMap.invalidate();
		
		return "LOGOUT";
	}

	

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public SessionMap<String, Object> getSessionMap() {
		return sessionMap;
	}

	public void setSessionMap(SessionMap<String, Object> sessionMap) {
		this.sessionMap = sessionMap;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public UsuarioService getUsuarioService() {
		return usuarioService;
	}

	public void setUsuarioService(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
}
