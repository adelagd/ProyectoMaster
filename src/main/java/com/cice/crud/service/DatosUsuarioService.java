package com.cice.crud.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.cice.crud.domain.DatosUsuario;

@Transactional(readOnly = true)
public interface DatosUsuarioService {
	
	public List<DatosUsuario> list();
	
	@Transactional(readOnly = false)
	public void add(DatosUsuario datosUsuario);
	
	public DatosUsuario load(Long idUsuario);
	
	@Transactional(readOnly = false)
	public void update(DatosUsuario datosUsuario);
	
	@Transactional(readOnly = false)
	public void delete(Long idUsuario);

}
