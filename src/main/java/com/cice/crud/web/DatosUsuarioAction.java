package com.cice.crud.web;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.cice.crud.domain.DatosUsuario;
import com.cice.crud.service.DatosUsuarioService;
import com.opensymphony.xwork2.ActionSupport;

public class DatosUsuarioAction extends ActionSupport{
	

	private static final long serialVersionUID = 1L;
	
	private List<DatosUsuario> datosUsuarios;
	private DatosUsuario datosUsuario;

	
	private DatosUsuarioService datosUsuarioService;


	public String loadDatosUsuario() throws Exception{
		
		HttpSession session = ServletActionContext.getRequest().getSession(true);
		Long id= ((Long) session.getAttribute("IdUsuario"));
		
		datosUsuario=datosUsuarioService.load(id);
		return SUCCESS;
	}
	public String listDatosUsuarios() throws Exception {
		
		datosUsuarios= datosUsuarioService.list();
		return SUCCESS;
		
	}
	public String newDatosUsuario() throws Exception {
		if ((datosUsuario != null) && (datosUsuario.getIdUsuario() != null)) {
			datosUsuario = datosUsuarioService.load(datosUsuario.getIdUsuario());
	    }
		return SUCCESS;
	}
	
	public String saveDatosUsuario() throws Exception{

		HttpSession session = ServletActionContext.getRequest().getSession(true);
		
		Long id= ((Long) session.getAttribute("IdUsuario"));
		
		
        if (datosUsuario.getIdUsuario() == null) {
        	datosUsuario.setIdUsuario(id);
        	datosUsuarioService.add(datosUsuario);
        } else {
        	datosUsuarioService.update(datosUsuario);
        }
		return SUCCESS;
	}

	public String deleteUsuario() throws Exception{

		datosUsuarioService.delete(datosUsuario.getIdUsuario());
		return SUCCESS;
	}
	
	public List<DatosUsuario> getDatosUsuarios(){
		return datosUsuarios;
	}
	
	public DatosUsuario getDatosUsuario() {
		return datosUsuario;
	}
	
	public void setDatosUsuario(DatosUsuario datosUsuario) {
		this.datosUsuario = datosUsuario;
	}
	public void setDatosUsuarioService(DatosUsuarioService datosUsuarioService) {
		
		this.datosUsuarioService = datosUsuarioService;
	}
	
}
