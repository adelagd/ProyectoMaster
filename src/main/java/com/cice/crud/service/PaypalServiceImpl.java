package com.cice.crud.service;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.cice.crud.domain.Paypal;

public class PaypalServiceImpl extends HibernateDaoSupport implements PaypalService {

	public PaypalRepository paypalRepository;

	public List<Paypal> list() {
		
		return paypalRepository.list();
	}

	public void add(Paypal paypal) {

		paypalRepository.add(paypal);
		
	}

	public Paypal load(Long idPaypal) {
		
		return paypalRepository.load(idPaypal);
	}

	public void update(Paypal paypal) {

		paypalRepository.update(paypal);
		
	}

	public void delete(Long idPaypal) {
		
		paypalRepository.delete(idPaypal);
		
	}

	public void setPaypalRepository(PaypalRepository paypalRepository) {
		this.paypalRepository = paypalRepository;
	}
	
	
	
	
}
