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
@Table(name="paypal")
public class Paypal implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name="idPaypal")
	private Long idPaypal;
	
	@Column(name="cuenta")
	private String cuenta;
	
	//Relacion muchos a uno
	@ManyToOne
	@JoinColumn(name="idDatosPago")
	private DatosPago datosPago;

	public Long getIdPaypal() {
		return idPaypal;
	}

	public void setIdPaypal(Long idPaypal) {
		this.idPaypal = idPaypal;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public DatosPago getDatosPago() {
		return datosPago;
	}

	public void setDatosPago(DatosPago datosPago) {
		this.datosPago = datosPago;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
