package com.cice.crud.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.cice.crud.domain.Imagenes;

@Transactional(readOnly = true)
public interface ImagenesService {
	
	public List<Imagenes> list();
	
	@Transactional(readOnly = false)
	public void add(Imagenes imagen);
	
	public Imagenes load(Long idImagen);
	
	@Transactional(readOnly = false)
	public void update(Imagenes imagen);
	
	@Transactional(readOnly = false)
	public void delete(Long idImagen);

}
