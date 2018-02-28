package com.cice.crud.service;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.cice.crud.domain.DatosUsuario;




public class DatosUsuarioRepositoryImpl extends HibernateDaoSupport implements DatosUsuarioRepository{

	public List<DatosUsuario> list() {
		final String query = "from DatosUsuario";
		
		return (List<DatosUsuario>) getHibernateTemplate().executeFind(new HibernateCallback() {
            public Object doInHibernate(Session session) throws HibernateException, SQLException {
                return session.createQuery(query).list();
            }
        });
	
	}

	public void add(DatosUsuario datosUsuario) {
		getHibernateTemplate().save(datosUsuario);
		
	}

	public DatosUsuario load(Long idUsuario) {
		//return getHibernateTemplate().load(DatosUsuario.class, idUsuario);
		return getHibernateTemplate().get(DatosUsuario.class, idUsuario);
	}

	public void update(DatosUsuario datosUsuario) {
		getHibernateTemplate().update(datosUsuario);
		
	}

	public void delete(Long idUsuario) {
		getHibernateTemplate().delete(load(idUsuario));
		
	}
	

}
