package com.cice.crud.service;

import java.util.List;

import com.cice.crud.domain.Transacciones;

public class TransaccionesServiceImpl implements TransaccionesService  {
	
	public TransaccionesRepository transaccionesRepository;

	public List<Transacciones> list() {
		
		return transaccionesRepository.list();
	}

	public void add(Transacciones transaccion) {

		transaccionesRepository.add(transaccion);
		
	}

	public Transacciones load(Long idTransaccion) {
		
		return transaccionesRepository.load(idTransaccion);
	}

	public void update(Transacciones transaccion) {

		transaccionesRepository.update(transaccion);
		
	}

	public void delete(Long idTransaccion) {

		transaccionesRepository.delete(idTransaccion);
		
	}

	public void setTransaccionesRepository(TransaccionesRepository transaccionesRepository) {
		this.transaccionesRepository = transaccionesRepository;
	}
	
	

}
