package com.cice.crud.service;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.cice.crud.domain.DatosUsuario;
import com.cice.crud.domain.Direcciones;


public class DireccionesRepositoryImpl extends HibernateDaoSupport implements DireccionesRepository{

	public List<Direcciones> list() {
		final String query = "from Direcciones";
		
		return (List<Direcciones>) getHibernateTemplate().executeFind(new HibernateCallback() {
            public Object doInHibernate(Session session) throws HibernateException, SQLException {
                return session.createQuery(query).list();
            }
		});
	}

	public List<Direcciones> listByUser(Long idUsuario){
		final String query = "from Direcciones where idusuario = "+ idUsuario;
		
		return (List<Direcciones>) getHibernateTemplate().executeFind(new HibernateCallback() {
            public Object doInHibernate(Session session) throws HibernateException, SQLException {
                return session.createQuery(query).list();
            }
		});
	}
	public void add(Direcciones direccion) {
		getHibernateTemplate().save(direccion);
		
	}

	public Direcciones load(Long idDireccion) {
		//return getHibernateTemplate().load(DatosUsuario.class, idUsuario);
		return getHibernateTemplate().get(Direcciones.class, idDireccion);
		
	}

	public void update(Direcciones direccion) {
		getHibernateTemplate().update(direccion);
		
	}

	public void delete(Long idDireccion) {
		getHibernateTemplate().delete(idDireccion);
		
	}
	
	

}
