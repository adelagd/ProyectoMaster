package com.cice.crud.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.IndexColumn;

@Entity
@Table(name="transacciones")
public class Transacciones implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name="idTransaccion")
	private Long idTransaccion;
	
	@Column(name="importeTotal")
	private Float importeTotal;
	@Column(name="estado")
	private String Estado; // Valores: "En Proceso","Finalizada"
	@Column(name="fecha_venta")
	private Date fecha_venta;
	@Column(name="observaciones")
	private String observaciones;
	
	//Relacion uno a muchos
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="idTransaccion")
	@IndexColumn(name="idx")
	private List<Articulo> articulos;
	
	//Relacion muchos a uno
	@ManyToOne
	@JoinColumn(name="idUsuario")
	private DatosUsuario datosUsuario;

	public Long getIdTransaccion() {
		return idTransaccion;
	}

	public void setIdTransaccion(Long idTransaccion) {
		this.idTransaccion = idTransaccion;
	}

	public Float getImporteTotal() {
		return importeTotal;
	}

	public void setImporteTotal(Float importeTotal) {
		this.importeTotal = importeTotal;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}

	public Date getFecha_venta() {
		return fecha_venta;
	}

	public void setFecha_venta(Date fecha_venta) {
		this.fecha_venta = fecha_venta;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public List<Articulo> getArticulos() {
		return articulos;
	}

	public void setArticulos(List<Articulo> articulos) {
		this.articulos = articulos;
	}

	public DatosUsuario getDatosUsuario() {
		return datosUsuario;
	}

	public void setDatosUsuario(DatosUsuario datosUsuario) {
		this.datosUsuario = datosUsuario;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	

}
