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
@Table(name="cuentabancaria")
public class CuentaBancaria implements Serializable{


	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name="idCuenta")
	private Long idCuenta;
	
	@Column(name="numeroCuenta")
	private String numeroCuenta;

	//Relacion muchos a uno
	@ManyToOne
	@JoinColumn(name="idDatosPago")
	private DatosPago datosPago;
	
	public Long getIdCuenta() {
		return idCuenta;
	}

	public void setIdCuenta(Long idCuenta) {
		this.idCuenta = idCuenta;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public DatosPago getDatosPago() {
		return datosPago;
	}

	public void setDatosPago(DatosPago datosPago) {
		this.datosPago = datosPago;
	}
	
	
	

}
