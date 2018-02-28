package com.cice.crud.service;

import java.util.List;

import com.cice.crud.domain.Direcciones;

public class DireccionesServiceImpl implements DireccionesService{
	
	public DireccionesRepository direccionesRepository;

	public List<Direcciones> list() {
		
		return direccionesRepository.list();
	}

	public List<Direcciones> listByUser(Long idUsuario){
		return direccionesRepository.listByUser(idUsuario);
	}
	
	
	public void add(Direcciones direccion) {
		direccionesRepository.add(direccion);
		
	}

	public Direcciones load(Long idDireccion) {
		
		return direccionesRepository.load(idDireccion);
	}

	public void update(Direcciones direccion) {
		direccionesRepository.update(direccion);
		
	}

	public void delete(Long idDireccion) {
		direccionesRepository.delete(idDireccion);
		
	}

	public void setDireccionesRepository(DireccionesRepository direccionesRepository) {
		this.direccionesRepository = direccionesRepository;
	}
	
	
	

}
