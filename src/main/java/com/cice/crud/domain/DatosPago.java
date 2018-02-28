package com.cice.crud.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.IndexColumn;

@Entity
@Table(name="datosPago")
public class DatosPago implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	
	@Column(name="idDatosPago")
	private Long idDatosPago;
	
	@Column(name="saldo")
	private float saldo;
	
	//Relaciones uno a muchos
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="idDatosPago")
	@IndexColumn(name="idx")	
	private List<CuentaBancaria> cuentasBancarias;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="idDatosPago")
	@IndexColumn(name="idx")	
	private List<Tarjeta> tarjetas;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="idDatosPago")
	@IndexColumn(name="idx")
	private List<Paypal> paypal;

	public Long getIdDatosPago() {
		return idDatosPago;
	}

	public void setIdDatosPago(Long idDatosPago) {
		this.idDatosPago = idDatosPago;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public List<CuentaBancaria> getCuentasBancarias() {
		return cuentasBancarias;
	}

	public void setCuentasBancarias(List<CuentaBancaria> cuentasBancarias) {
		this.cuentasBancarias = cuentasBancarias;
	}

	public List<Tarjeta> getTarjetas() {
		return tarjetas;
	}

	public void setTarjetas(List<Tarjeta> tarjetas) {
		this.tarjetas = tarjetas;
	}

	public List<Paypal> getPaypal() {
		return paypal;
	}

	public void setPaypal(List<Paypal> paypal) {
		this.paypal = paypal;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
