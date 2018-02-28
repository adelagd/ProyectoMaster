package com.cice.crud.service;

import java.util.List;

import com.cice.crud.domain.Transacciones;

public interface TransaccionesRepository {

	public List<Transacciones> list();
	
    public void add(Transacciones transaccion);

    public Transacciones load(Long idTransaccion);

    public void update(Transacciones transaccion);

    public void delete(Long idTransaccion);
}
