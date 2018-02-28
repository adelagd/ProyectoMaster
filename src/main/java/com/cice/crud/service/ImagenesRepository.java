package com.cice.crud.service;

import java.util.List;

import com.cice.crud.domain.Imagenes;

public interface ImagenesRepository {
	
	public List<Imagenes> list();
	
    public void add(Imagenes imagen);

    public Imagenes load(Long idImagen);

    public void update(Imagenes imagen);

    public void delete(Long idImagen);

}
