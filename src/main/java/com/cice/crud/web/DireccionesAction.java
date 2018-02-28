package com.cice.crud.web;

import java.util.List;


import javax.servlet.http.HttpSession;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import com.cice.crud.domain.DatosUsuario;
import com.cice.crud.domain.Direcciones;
import com.cice.crud.service.DatosUsuarioService;
import com.cice.crud.service.DireccionesService;


public class DireccionesAction extends ActionSupport{
	

	private static final long serialVersionUID = 1L;
	private List<Direcciones> direcciones;
	private Direcciones direccion;
	private DatosUsuario datosU;
	
	private DireccionesService direccionesService;
	private DatosUsuarioService datosUsuarioService;

	
	public String listDirecciones() {
		direcciones = direccionesService.list();
		return SUCCESS;
	}
	
	public String loadDireccionesUsuario() {
		HttpSession session = ServletActionContext.getRequest().getSession(true);
		
		Long id= ((Long) session.getAttribute("IdUsuario"));
		if(id != null) {
			
			direcciones = direccionesService.listByUser(id);
			
		}
		
		return SUCCESS;
	}
	public String newDireccion() throws Exception {
		if ((direccion != null) && (direccion.getIdDireccion() != null)) {
			direccion = direccionesService.load(direccion.getIdDireccion());
	    }
		return SUCCESS;
	}
	
	public String saveDireccion() throws Exception{

		
        if (direccion.getIdDireccion() == null) {
    		HttpSession session = ServletActionContext.getRequest().getSession(true);
    		
    		Long id= ((Long) session.getAttribute("IdUsuario"));
            
    		      	
    		datosU = datosUsuarioService.load(id);
        	direccion.setDatosUsuario(datosU);
        	direccionesService.add(direccion);
        	
        } else {
        	
        	direccionesService.update(direccion);
        }
        

		return SUCCESS;
		
	
	}
	
	public String deleteDireccion() throws Exception{

		direccionesService.delete(direccion.getIdDireccion());
		return SUCCESS;
	}

	// GETTER y SETTERS
	
	
	public List<Direcciones> getDirecciones() {
		return direcciones;
	}

	public DatosUsuario getDatosU() {
		return datosU;
	}

	public void setDatosU(DatosUsuario datosU) {
		this.datosU = datosU;
	}

	public DatosUsuarioService getDatosUsuarioService() {
		return datosUsuarioService;
	}

	public void setDatosUsuarioService(DatosUsuarioService datosUsuarioService) {
		this.datosUsuarioService = datosUsuarioService;
	}

	public void setDirecciones(List<Direcciones> direcciones) {
		this.direcciones = direcciones;
	}

	public Direcciones getDireccion() {
		return direccion;
	}

	public void setDireccion(Direcciones direccion) {
		this.direccion = direccion;
	}

	public DireccionesService getDireccionesService() {
		return direccionesService;
	}

	public void setDireccionesService(DireccionesService direccionesService) {
		this.direccionesService = direccionesService;
	}
	
	
	
}
