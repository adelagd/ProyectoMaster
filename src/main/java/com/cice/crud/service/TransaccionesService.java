package com.cice.crud.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.cice.crud.domain.Transacciones;

@Transactional(readOnly = true)
public interface TransaccionesService {
	
	public List<Transacciones> list();
	
	@Transactional(readOnly = false)
	public void add(Transacciones transaccion);
	
	public Transacciones load(Long idTransaccion);
	
	@Transactional(readOnly = false)
	public void update(Transacciones transaccion);
	
	@Transactional(readOnly = false)
	public void delete(Long idTransaccion);

}
