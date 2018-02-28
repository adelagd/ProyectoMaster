package com.cice.crud.web;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.cice.crud.domain.Articulo;
import com.cice.crud.domain.DatosUsuario;
import com.cice.crud.domain.Direcciones;
import com.cice.crud.domain.Usuario;
import com.cice.crud.service.ArticuloService;
import com.cice.crud.service.DatosUsuarioService;
import com.cice.crud.service.DireccionesService;
import com.cice.crud.service.UsuarioService;
import com.opensymphony.xwork2.ActionSupport;

public class PanelUsuarioAction extends ActionSupport {
	
	private Usuario usuario;
	private DatosUsuario datosUsuario;


	

	private DatosUsuarioService datosUsuarioService;
	private DireccionesService direccionesService;
	private ArticuloService articuloService;
	
	private List<Articulo> articulos;
	private List<Direcciones> direcciones;
	
	
	
	public String cargarPanelUsuario() throws Exception{
		
		HttpSession session = ServletActionContext.getRequest().getSession(true);
		Long id= ((Long) session.getAttribute("IdUsuario"));
		
		datosUsuario = datosUsuarioService.load(id);
		
		direcciones = datosUsuario.getDirecciones();
		
		articulos = datosUsuario.getArticulos();

		
		
		return SUCCESS;
		
	}

	
	// GETTER Y SETTERS
	

	public Usuario getUsuario() {
		return usuario;
	}



	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}



	public DatosUsuario getDatosUsuario() {
		return datosUsuario;
	}



	public void setDatosUsuario(DatosUsuario datosUsuario) {
		this.datosUsuario = datosUsuario;
	}



	public DatosUsuarioService getDatosUsuarioService() {
		return datosUsuarioService;
	}



	public void setDatosUsuarioService(DatosUsuarioService datosUsuarioService) {
		this.datosUsuarioService = datosUsuarioService;
	}



	public DireccionesService getDireccionesService() {
		return direccionesService;
	}



	public void setDireccionesService(DireccionesService direccionesService) {
		this.direccionesService = direccionesService;
	}



	public ArticuloService getArticuloService() {
		return articuloService;
	}



	public void setArticuloService(ArticuloService articuloService) {
		this.articuloService = articuloService;
	}



	public List<Articulo> getArticulos() {
		return articulos;
	}



	public void setArticulos(List<Articulo> articulos) {
		this.articulos = articulos;
	}



	public List<Direcciones> getDirecciones() {
		return direcciones;
	}



	public void setDirecciones(List<Direcciones> direcciones) {
		this.direcciones = direcciones;
	}

	
	
	
	

}
