package com.cice.crud.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.IndexColumn;

@Entity
@Table(name="datosUsuario")
public class DatosUsuario implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="idUsuario")
	private Long idUsuario;
	@Column(name="nombre")
	private String nombre;
	@Column(name="apellidos")
	private String apellidos;
	@Column(name="telefono")
	private String telefono;
	@Column(name="fecha_nacimiento")
	private Date fecha_nacimiento;
	
	//Relaciones uno a uno bidireccional
    @OneToOne(cascade=CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private Usuario usuario;
	
	//Relaciones uno a uno unidireccional
	@OneToOne(cascade=CascadeType.ALL)
	@PrimaryKeyJoinColumn	
	private DatosPago datosPago;
	
	// Relaciones uno a muchos
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="idUsuario")
	@IndexColumn(name="idx")
	private List<Direcciones> direcciones;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="idUsuario")
	@IndexColumn(name="idx")
	private List<Articulo> articulos;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="idUsuairo")
	@IndexColumn(name="idx")
	private List<Transacciones> transacciones;

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public DatosPago getDatosPago() {
		return datosPago;
	}

	public void setDatosPago(DatosPago datosPago) {
		this.datosPago = datosPago;
	}

	public List<Direcciones> getDirecciones() {
		return direcciones;
	}

	public void setDirecciones(List<Direcciones> direcciones) {
		this.direcciones = direcciones;
	}

	public List<Articulo> getArticulos() {
		return articulos;
	}

	public void setArticulos(List<Articulo> articulos) {
		this.articulos = articulos;
	}

	public List<Transacciones> getTransacciones() {
		return transacciones;
	}

	public void setTransacciones(List<Transacciones> transacciones) {
		this.transacciones = transacciones;
	}
	
	 
	
	

	
}
