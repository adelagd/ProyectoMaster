package com.cice.crud.service;

import java.util.List;

import com.cice.crud.domain.DatosUsuario;

public interface DatosUsuarioRepository {
	
	public List<DatosUsuario> list();
	
	public void add(DatosUsuario datosUsuario);
	
	public DatosUsuario load (Long idUsuario);
	
	public void update(DatosUsuario datosUsuario);
	
	public void delete(Long idUsuario);

}
