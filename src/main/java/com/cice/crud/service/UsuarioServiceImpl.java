package com.cice.crud.service;

import java.util.List;

import com.cice.crud.domain.Usuario;

public class UsuarioServiceImpl implements UsuarioService{

	public UsuarioRepository usuarioRepository;
	
	public List<Usuario> list() {
		
		return usuarioRepository.list();
	}

	public void add(Usuario usuario) {
		usuarioRepository.add(usuario);
		
	}

	public Usuario load(Long idUsuario) {
		
		return usuarioRepository.load(idUsuario);
	}

	public void update(Usuario usuario) {
		usuarioRepository.update(usuario);
		
	}

	public void delete(Long idUsuario) {
		usuarioRepository.delete(idUsuario);
		
	}
	public List<Usuario> searchUsuario(String email){
		return usuarioRepository.searchUsuario(email);
	}
	
	public void setUsuarioRepository(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}
	

	

}
