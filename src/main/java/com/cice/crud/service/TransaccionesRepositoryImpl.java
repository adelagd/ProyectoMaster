package com.cice.crud.service;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.cice.crud.domain.Transacciones;


public class TransaccionesRepositoryImpl extends HibernateDaoSupport implements TransaccionesRepository {

	public List<Transacciones> list() {
		final String query = "from Transacciones";
		
		return (List<Transacciones>) getHibernateTemplate().executeFind(new HibernateCallback() {
            public Object doInHibernate(Session session) throws HibernateException, SQLException {
                return session.createQuery(query).list();
            }
		});
	}

	public void add(Transacciones transaccion) {

		getHibernateTemplate().save(transaccion);
		
	}

	public Transacciones load(Long idTransaccion) {
		
		//return getHibernateTemplate().load(Transacciones.class, "idTransaccion");
		return getHibernateTemplate().get(Transacciones.class, idTransaccion);
	}

	public void update(Transacciones transaccion) {
		
		getHibernateTemplate().update(transaccion);
		
	}

	public void delete(Long idTransaccion) {

		getHibernateTemplate().delete(idTransaccion);
		
	}
	
	

}
