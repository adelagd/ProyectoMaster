package com.cice.crud.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.cice.crud.domain.Paypal;

@Transactional(readOnly = true)
public interface PaypalService {

	public List<Paypal> list();
	
	@Transactional(readOnly = false)
	public void add(Paypal paypal);
	
	public Paypal load(Long idPaypal);
	
	@Transactional(readOnly = false)
	public void update(Paypal paypal);
	
	@Transactional(readOnly = false)
	public void delete(Long idPaypal);
}
