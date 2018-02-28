package com.cice.crud.service;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.cice.crud.domain.Imagenes;

public class ImagenesRepositoryImpl extends HibernateDaoSupport implements ImagenesRepository {

	public List<Imagenes> list() {
		final String query = "from Imagenes";
		
		return (List<Imagenes>) getHibernateTemplate().executeFind(new HibernateCallback() {
            public Object doInHibernate(Session session) throws HibernateException, SQLException {
                return session.createQuery(query).list();
            }
		});
	}

	public void add(Imagenes imagen) {

		getHibernateTemplate().save(imagen);
		
	}

	public Imagenes load(Long idImagen) {
		
		//return getHibernateTemplate().load(Imagenes.class, "idImagen");
		return getHibernateTemplate().get(Imagenes.class, idImagen);
	}

	public void update(Imagenes imagen) {

		getHibernateTemplate().update(imagen);
		
	}

	public void delete(Long idImagen) {

		getHibernateTemplate().delete(idImagen);
		
	}

}
