package com.cice.crud.service;

import java.util.List;

import com.cice.crud.domain.Direcciones;

public interface DireccionesRepository {
	
	public List<Direcciones> list();
	
	public List<Direcciones> listByUser(Long idUsuario);
	
	public void add(Direcciones direccion);
	
	public Direcciones load (Long idDireccion);
	
	public void update(Direcciones direccion);
	
	public void delete(Long idDireccion);
	

}
