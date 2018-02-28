package com.cice.crud.service;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.cice.crud.domain.DatosPago;

public class DatosPagoRepositoryImpl extends HibernateDaoSupport implements DatosPagoRepository{

	public List<DatosPago> list() {
		
		final String query = "from DatosPago";
		
		return (List<DatosPago>) getHibernateTemplate().executeFind(new HibernateCallback() {
            public Object doInHibernate(Session session) throws HibernateException, SQLException {
                return session.createQuery(query).list();
            }
		});
	}

	public void add(DatosPago datosPago) {

		getHibernateTemplate().save(datosPago);
		
	}

	public DatosPago load(Long idDatosPago) {
		
		//return getHibernateTemplate().load(DatosPago.class,"idDatosPago");
		return getHibernateTemplate().get(DatosPago.class, idDatosPago);
	}

	public void update(DatosPago datosPago) {

		getHibernateTemplate().update(datosPago);
		
	}

	public void delete(Long idDatosPago) {

		getHibernateTemplate().delete(idDatosPago);
		
	}

}
