package com.cice.crud.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.cice.crud.domain.Articulo;

@Transactional(readOnly = true)
public interface ArticuloService {
	
	public List<Articulo> list();
	
	public List<Articulo> listbyuser(Long idUsuario);
	
	@Transactional(readOnly = false)
	public void add(Articulo articulo);
	
	public Articulo load(Long idArticulo);
	
	@Transactional(readOnly = false)
	public void update(Articulo articulo);
	
	@Transactional(readOnly = false)
	public void delete(Long idArticulo);
}
