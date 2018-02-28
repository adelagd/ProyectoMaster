package com.cice.crud.service;

import java.util.List;

import com.cice.crud.domain.DatosPago;

public interface DatosPagoRepository {

	public List<DatosPago> list();
	
    public void add(DatosPago datosPago);

    public DatosPago load(Long idDatosPago);

    public void update(DatosPago datosPago);

    public void delete(Long idDatosPago);
}
