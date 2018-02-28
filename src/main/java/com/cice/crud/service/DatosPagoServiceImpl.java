package com.cice.crud.service;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.cice.crud.domain.DatosPago;

public class DatosPagoServiceImpl extends HibernateDaoSupport implements DatosPagoService {

	public DatosPagoRepository datosPagoRepository;
	
	public List<DatosPago> list() {
		
		return datosPagoRepository.list();
	}

	public void add(DatosPago datosPago) {

		datosPagoRepository.add(datosPago);
		
	}

	public DatosPago load(Long idDatosPago) {
		
		return datosPagoRepository.load(idDatosPago);
	}

	public void update(DatosPago datosPago) {

		datosPagoRepository.update(datosPago);
		
	}

	public void delete(Long idDatosPago) {

		datosPagoRepository.delete(idDatosPago);
		
	}

	public void setDatosPagoRepository(DatosPagoRepository datosPagoRepository) {
		this.datosPagoRepository = datosPagoRepository;
	}

	
}
