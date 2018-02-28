package com.cice.crud.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.cice.crud.domain.CuentaBancaria;


@Transactional(readOnly = true)
public interface CuentaBancariaService {
	
	public List<CuentaBancaria> list();
	
	@Transactional(readOnly = false)
	public void add(CuentaBancaria cuentaBancaria);
	
	public CuentaBancaria load(Long idCuentaBancaria);
	
	@Transactional(readOnly = false)
	public void update(CuentaBancaria cuentaBancaria);
	
	@Transactional(readOnly = false)
	public void delete(Long idCuentaBancaria);

}
