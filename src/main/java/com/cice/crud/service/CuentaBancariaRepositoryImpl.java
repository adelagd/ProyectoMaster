package com.cice.crud.service;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.cice.crud.domain.CuentaBancaria;


public class CuentaBancariaRepositoryImpl extends HibernateDaoSupport implements CuentaBancariaRepository{

	public List<CuentaBancaria> list() {
		final String query = "from CuentaBancaria";
		return (List<CuentaBancaria>) getHibernateTemplate().executeFind(new HibernateCallback() {
            public Object doInHibernate(Session session) throws HibernateException, SQLException {
                return session.createQuery(query).list();
            }
		});
	}

	public void add(CuentaBancaria cuentaBancaria) {

		getHibernateTemplate().save(cuentaBancaria);
		
	}

	public CuentaBancaria load(Long idCuentaBancaria) {
		
		//return getHibernateTemplate().load(CuentaBancaria.class, "idCuentaBancaria");
		return getHibernateTemplate().get(CuentaBancaria.class, idCuentaBancaria);
	}

	public void update(CuentaBancaria cuentaBancaria) {

		getHibernateTemplate().update(cuentaBancaria);
		
	}

	public void delete(Long idCuentaBancaria) {

		getHibernateTemplate().delete(idCuentaBancaria);
		
	}
	
	
	
	

}
