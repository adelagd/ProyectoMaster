package com.cice.crud.web;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.cice.crud.domain.Articulo;
import com.cice.crud.domain.DatosUsuario;
import com.cice.crud.service.ArticuloService;
import com.cice.crud.service.DatosUsuarioService;
import com.opensymphony.xwork2.ActionSupport;

public class ArticulosAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	public List<Articulo> articulos;
	public Articulo articulo;
	public DatosUsuario datosUsuario;
	
	public ArticuloService articulosService;
	public DatosUsuarioService datosUsuarioService;
	
	public String listArticulos() throws Exception{
		
		articulos=articulosService.list();
		return SUCCESS;
	}
	
	public String listArticulosUser() throws Exception{
		
		HttpSession session = ServletActionContext.getRequest().getSession(true);
		Long id= ((Long) session.getAttribute("IdUsuario"));
		
		
		articulos=articulosService.listbyuser(id);
		return SUCCESS;
	}
	
	public String newArticulo() throws Exception{
		if((articulo != null) && (articulo.getIdArticulo() != null) ) {
			articulo = articulosService.load(articulo.getIdArticulo());
		}
		return SUCCESS;
	}
	
	public String saveArticulo() throws Exception{
		

		
		if(articulo.getIdArticulo()== null ) {
			HttpSession session = ServletActionContext.getRequest().getSession(true);
			Long id= ((Long) session.getAttribute("IdUsuario"));
			
			datosUsuario = datosUsuarioService.load(id);
			articulo.setDatosUsuario(datosUsuario);
			articulosService.add(articulo);
		
		}else {
			articulosService.update(articulo);
		}
		return SUCCESS;
	}
	
	
	public String deleteArticulo() throws Exception{
		
		articulosService.delete(articulo.getIdArticulo());
		return SUCCESS;
	}

	
	// GETTER Y SETTERS
	
	public List<Articulo> getArticulos() {
		return articulos;
	}

	public void setArticulos(List<Articulo> articulos) {
		this.articulos = articulos;
	}

	public Articulo getArticulo() {
		return articulo;
	}

	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}

	public DatosUsuario getDatosUsuario() {
		return datosUsuario;
	}

	public void setDatosUsuario(DatosUsuario datosUsuario) {
		this.datosUsuario = datosUsuario;
	}

	public ArticuloService getArticulosService() {
		return articulosService;
	}

	public void setArticulosService(ArticuloService articulosService) {
		this.articulosService = articulosService;
	}

	public DatosUsuarioService getDatosUsuarioService() {
		return datosUsuarioService;
	}

	public void setDatosUsuarioService(DatosUsuarioService datosUsuarioService) {
		this.datosUsuarioService = datosUsuarioService;
	}

	
	

}
