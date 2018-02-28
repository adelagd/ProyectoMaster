package com.cice.crud.domain;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


@Entity
@Table(name="usuario")
public class Usuario implements Serializable{


	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue
    @Column(name="idUsuario")
    private Long idUsuario;

	@Column(name="email")
    private String email;
	@Column(name="password")
    private String password;
    
    //Relacion uno a uno bidireccional
    @OneToOne(cascade=CascadeType.ALL)
	@PrimaryKeyJoinColumn	
    private DatosUsuario datosUsuario;

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public DatosUsuario getDatosUsuario() {
		return datosUsuario;
	}

	public void setDatosUsuario(DatosUsuario datosUsuario) {
		this.datosUsuario = datosUsuario;
	}
    
    
	
}
