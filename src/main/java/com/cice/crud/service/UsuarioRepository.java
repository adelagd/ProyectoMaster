package com.cice.crud.service;

import java.util.List;

import com.cice.crud.domain.Usuario;

public interface UsuarioRepository {

	public List<Usuario> list();
	
    public void add(Usuario usuario);

    public Usuario load(Long idUsuario);

    public void update(Usuario usuario);

    public void delete(Long idUsuario);
    
    public List<Usuario> searchUsuario(String email);
	
}
