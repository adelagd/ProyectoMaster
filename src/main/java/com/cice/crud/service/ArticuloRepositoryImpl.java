package com.cice.crud.service;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.cice.crud.domain.Articulo;


public class ArticuloRepositoryImpl extends HibernateDaoSupport implements ArticuloRepository{

	public List<Articulo> list() {
		final String query = "from Articulos";
		
		return (List<Articulo>) getHibernateTemplate().executeFind(new HibernateCallback() {
            public Object doInHibernate(Session session) throws HibernateException, SQLException {
                return session.createQuery(query).list();
            }
		});
	}

	public List<Articulo> listbyuser(Long idUsuario){
		final String query = "Select u from Articulos where u.idUsuario = idUsuario order by u.fecha_alta desc";
		
		return (List<Articulo>) getHibernateTemplate().executeFind(new HibernateCallback() {
            public Object doInHibernate(Session session) throws HibernateException, SQLException {
                return session.createQuery(query).list();
            }
		});
		
	}
	public void add(Articulo articulo) {
		getHibernateTemplate().save(articulo);
		
	}

	public Articulo load(Long idArticulo) {
		
		//return getHibernateTemplate().load(Articulo.class, idArticulo);
		return getHibernateTemplate().get(Articulo.class, idArticulo);
	}

	public void update(Articulo articulo) {
		getHibernateTemplate().update(articulo);
		
	}

	public void delete(Long idArticulo) {
		getHibernateTemplate().delete(load(idArticulo));
		
	}
	
	

}
