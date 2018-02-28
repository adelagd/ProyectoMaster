package com.cice.crud.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.cice.crud.domain.DatosPago;

@Transactional(readOnly = true)
public interface DatosPagoService {

	public List<DatosPago> list();
	
	@Transactional(readOnly = false)
	public void add(DatosPago datosPago);
	
	public DatosPago load(Long idDatosPago);
	
	@Transactional(readOnly = false)
	public void update(DatosPago datosPago);
	
	@Transactional(readOnly = false)
	public void delete(Long idDatosPago);
}
