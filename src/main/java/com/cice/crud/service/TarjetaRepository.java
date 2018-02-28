package com.cice.crud.service;

import java.util.List;

import com.cice.crud.domain.Tarjeta;

public interface TarjetaRepository {

	public List<Tarjeta> list();
	
    public void add(Tarjeta tarjeta);

    public Tarjeta load(Long idTarjeta);

    public void update(Tarjeta tarjeta);

    public void delete(Long idTarjeta);
}
