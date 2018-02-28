package com.cice.crud.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.cice.crud.domain.Tarjeta;

@Transactional(readOnly = true)
public interface TarjetaService {

	public List<Tarjeta> list();
	
	@Transactional(readOnly = false)
	public void add(Tarjeta tarjeta);
	
	public Tarjeta load(Long idTarjeta);
	
	@Transactional(readOnly = false)
	public void update(Tarjeta tarjeta);
	
	@Transactional(readOnly = false)
	public void delete(Long idTarjeta);
}
