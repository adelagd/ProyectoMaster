package com.cice.crud.service;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.cice.crud.domain.CuentaBancaria;

public class CuentaBancariaServiceImpl extends HibernateDaoSupport implements CuentaBancariaService{

	public CuentaBancariaRepository cuentaBancariaRepository;
	
	public List<CuentaBancaria> list() {
	
		return cuentaBancariaRepository.list();
	}

	public void add(CuentaBancaria cuentaBancaria) {
		
		cuentaBancariaRepository.add(cuentaBancaria);
		
	}

	public CuentaBancaria load(Long idCuentaBancaria) {
		
		return cuentaBancariaRepository.load(idCuentaBancaria);
	}

	public void update(CuentaBancaria cuentaBancaria) {
		
		cuentaBancariaRepository.update(cuentaBancaria);
		
	}

	public void delete(Long idCuentaBancaria) {
		
		cuentaBancariaRepository.delete(idCuentaBancaria);
		
	}

	public void setCuentaBancariaRepository(CuentaBancariaRepository cuentaBancariaRepository) {
		this.cuentaBancariaRepository = cuentaBancariaRepository;
	}
	
	

}
