package com.cice.crud.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tarjeta")
public class Tarjeta implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name="idTarjeta")
	private Long idTarjeta;
	
	@Column(name="numeroTarjeta")
	private String numeroTarjeta;
	
	//Relacion muchos a uno
	@ManyToOne
	@JoinColumn(name="idDatosPago")
	private DatosPago datosPago;

	public Long getIdTarjeta() {
		return idTarjeta;
	}

	public void setIdTarjeta(Long idTarjeta) {
		this.idTarjeta = idTarjeta;
	}

	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	public DatosPago getDatosPago() {
		return datosPago;
	}

	public void setDatosPago(DatosPago datosPago) {
		this.datosPago = datosPago;
	}
	
	
	
}
