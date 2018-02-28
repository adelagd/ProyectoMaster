package com.cice.crud.service;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.cice.crud.domain.Imagenes;

public class ImagenesServiceImpl extends HibernateDaoSupport implements ImagenesService {
	
	public ImagenesRepository imagenesRepository;

	public List<Imagenes> list() {
		
		return imagenesRepository.list();
	}

	public void add(Imagenes imagen) {

		imagenesRepository.add(imagen);
		
	}

	public Imagenes load(Long idImagen) {
		
		return imagenesRepository.load(idImagen);
	}

	public void update(Imagenes imagen) {

		imagenesRepository.update(imagen);
		
	}

	public void delete(Long idImagen) {

		imagenesRepository.delete(idImagen);
		
	}

	public void setImagenesRepository(ImagenesRepository imagenesRepository) {
		this.imagenesRepository = imagenesRepository;
	}
	
	
	
	
	
	

}
