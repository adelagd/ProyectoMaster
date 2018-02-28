package com.cice.crud.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


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
@Table(name="articulo")
public class Articulo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name="idArticulo")	
	private Long idArticulo;
	@Column(name="categoria")
	private String categoria;
	@Column(name="fecha_creacion")
	private Date fecha_creacion;
	@Column(name="fecha_modificacion")
	private Date fecha_modificacion;
	@Column(name="titulo")
	private String titulo;
	@Column(name="descripcion")
	private String descripcion;
	@Column(name="color")
	private String color;
	@Column(name="talla")
	private String talla;
	@Column(name="marca")
	private String marca;
	@Column(name="estadoVenta")
	private String estadoVenta; //Valores: "En venta", "vendido"
	@Column(name="estadoPrenda")
	private String estadoPrenda;
	@Column(name="precio_original")
	private Float precio_original;
	@Column(name="precio_venta")
	private Float precio_venta;
	@Column(name="precio_envio")
	private Float precio_envio;
	@Column(name="visto")
	private Integer visto;
	
	//Relacion muchos a uno
	@ManyToOne
	@JoinColumn(name="idUsuario")
	private DatosUsuario datosUsuario;
	
	@ManyToOne
	@JoinColumn(name="idTransaccion")
	private Transacciones transaccion;
	
	//Relacion uno a muchos
	@OneToMany
	@JoinColumn(name="idImagen")
	@IndexColumn(name="idx")
	private List<Imagenes> imagenes;

	public Long getIdArticulo() {
		return idArticulo;
	}

	public void setIdArticulo(Long idArticulo) {
		this.idArticulo = idArticulo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Date getFecha_creacion() {
		return fecha_creacion;
	}

	public void setFecha_creacion(Date fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}

	public Date getFecha_modificacion() {
		return fecha_modificacion;
	}

	public void setFecha_modificacion(Date fecha_modificacion) {
		this.fecha_modificacion = fecha_modificacion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getEstadoVenta() {
		return estadoVenta;
	}

	public void setEstadoVenta(String estadoVenta) {
		this.estadoVenta = estadoVenta;
	}

	public String getEstadoPrenda() {
		return estadoPrenda;
	}

	public void setEstadoPrenda(String estadoPrenda) {
		this.estadoPrenda = estadoPrenda;
	}

	public float getPrecio_original() {
		return precio_original;
	}

	public void setPrecio_original(float precio_original) {
		this.precio_original = precio_original;
	}

	public float getPrecio_venta() {
		return precio_venta;
	}

	public void setPrecio_venta(float precio_venta) {
		this.precio_venta = precio_venta;
	}

	public float getPrecio_envio() {
		return precio_envio;
	}

	public void setPrecio_envio(float precio_envio) {
		this.precio_envio = precio_envio;
	}

	public int getVisto() {
		return visto;
	}

	public void setVisto(int visto) {
		this.visto = visto;
	}

	public DatosUsuario getDatosUsuario() {
		return datosUsuario;
	}

	public void setDatosUsuario(DatosUsuario datosUsuario) {
		this.datosUsuario = datosUsuario;
	}

	public Transacciones getTransaccion() {
		return transaccion;
	}

	public void setTransaccion(Transacciones transaccion) {
		this.transaccion = transaccion;
	}

	public List<Imagenes> getImagenes() {
		return imagenes;
	}

	public void setImagenes(List<Imagenes> imagenes) {
		this.imagenes = imagenes;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

	
	

}
