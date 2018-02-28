package com.cice.crud.service;

import java.util.List;

import com.cice.crud.domain.Paypal;

public interface PaypalRepository {

	public List<Paypal> list();
	
    public void add(Paypal paypal);

    public Paypal load(Long idPaypal);

    public void update(Paypal paypal);

    public void delete(Long idPaypal);
}
