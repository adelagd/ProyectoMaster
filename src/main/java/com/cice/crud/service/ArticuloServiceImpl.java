package com.cice.crud.service;

import java.util.List;

import com.cice.crud.domain.Articulo;

public class ArticuloServiceImpl implements ArticuloService{
	
	private ArticuloRepository articulosRepository;

	public List<Articulo> list() {
		
		return articulosRepository.list();
	}

	public List<Articulo> listbyuser(Long idUsuario){
		
		return articulosRepository.listbyuser(idUsuario);
	}
	public void add(Articulo articulo) {
		articulosRepository.add(articulo);
		
	}

	public Articulo load(Long idarticulo) {
		
		return articulosRepository.load(idarticulo);
	}

	public void update(Articulo articulo) {
		
		articulosRepository.update(articulo);
	}

	public void delete(Long idarticulo) {
		articulosRepository.delete(idarticulo);
		
	}
	
	public void setArticulosRepository(ArticuloRepository articulosRepository) {
		this.articulosRepository=articulosRepository;
	}

}
