package com.cice.crud.service;

import java.util.List;

import com.cice.crud.domain.Articulo;

public interface ArticuloRepository {
	
	public List<Articulo> list();
	
	public List<Articulo> listbyuser(Long idUsuario);

	public Articulo load(Long idArticulo);
	
	public void add(Articulo articulo);
	
	public void update(Articulo articulo);
	
	public void delete(Long idArticulo);
}
