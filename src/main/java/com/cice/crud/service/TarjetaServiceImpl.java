package com.cice.crud.service;

import java.util.List;

import com.cice.crud.domain.Tarjeta;

public class TarjetaServiceImpl implements TarjetaService{
	
	public TarjetaRepository tarjetaRepository;

	public List<Tarjeta> list() {
		
		return tarjetaRepository.list();
	}

	public void add(Tarjeta tarjeta) {

		tarjetaRepository.add(tarjeta);
		
	}

	public Tarjeta load(Long idTarjeta) {
		
		return tarjetaRepository.load(idTarjeta);
	}

	public void update(Tarjeta tarjeta) {

		tarjetaRepository.update(tarjeta);
		
	}

	public void delete(Long idTarjeta) {

		tarjetaRepository.delete(idTarjeta);
		
	}

	public void setTarjetaRepository(TarjetaRepository tarjetaRepository) {
		this.tarjetaRepository = tarjetaRepository;
	}
	
	
	

}
