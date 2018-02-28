package com.cice.crud.service;

import java.util.List;

import com.cice.crud.domain.CuentaBancaria;

public interface CuentaBancariaRepository {
	
	public List<CuentaBancaria> list();
	
	public void add(CuentaBancaria cuentaBancaria);
	
	public CuentaBancaria load(Long idCuentaBancaria);
		
	public void update(CuentaBancaria cuentaBancaria);
	
	public void delete(Long idCuentaBancaria);
	
	
	
	

}
