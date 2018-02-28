package com.cice.crud.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.cice.crud.domain.Direcciones;

@Transactional(readOnly = true)
public interface DireccionesService {
	
	public List<Direcciones> list();
	public List<Direcciones> listByUser(Long idUsuario);
	
	@Transactional(readOnly = false)
	public void add(Direcciones direccion);
	
	public Direcciones load(Long idDireccion);
	
	@Transactional(readOnly = false)
	public void update(Direcciones direccion);
	
	@Transactional(readOnly = false)
	public void delete(Long idDireccion);
}
