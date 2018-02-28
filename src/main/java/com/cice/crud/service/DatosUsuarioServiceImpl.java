package com.cice.crud.service;

import java.util.List;

import com.cice.crud.domain.DatosUsuario;

public class DatosUsuarioServiceImpl implements DatosUsuarioService{
	
	private DatosUsuarioRepository datosUsuarioRepository;

	public List<DatosUsuario> list() {
		
		return datosUsuarioRepository.list();
	}

	public void add(DatosUsuario datosUsuario) {
		datosUsuarioRepository.add(datosUsuario);
		
	}

	public DatosUsuario load(Long idUsuario) {
		
		return datosUsuarioRepository.load(idUsuario);
	}

	public void update(DatosUsuario datosUsuario) {
		datosUsuarioRepository.update(datosUsuario);
		
	}

	public void delete(Long idUsuario) {
		datosUsuarioRepository.delete(idUsuario);
		
	}

	public void setDatosUsuarioRepository(DatosUsuarioRepository datosUsuarioRepository) {
		this.datosUsuarioRepository = datosUsuarioRepository;
	}

}
