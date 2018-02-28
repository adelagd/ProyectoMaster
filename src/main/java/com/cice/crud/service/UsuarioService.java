package com.cice.crud.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.cice.crud.domain.Usuario;

@Transactional(readOnly = true)
public interface UsuarioService {

	public List<Usuario> list();
	
	@Transactional(readOnly = false)
	public void add(Usuario usuario);
	
	public Usuario load(Long idUsuario);
	
	@Transactional(readOnly = false)
	public void update(Usuario usuario);
	
	@Transactional(readOnly = false)
	public void delete(Long idUsuario);
	
	public List<Usuario> searchUsuario(String email);
	
}
