package com.cice.crud.service;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.cice.crud.domain.Paypal;

public class PaypalRepositoryImpl extends HibernateDaoSupport implements PaypalRepository {

	public List<Paypal> list() {
		final String query = "from Paypal";
		
		return (List<Paypal>) getHibernateTemplate().executeFind(new HibernateCallback() {
            public Object doInHibernate(Session session) throws HibernateException, SQLException {
                return session.createQuery(query).list();
            }
		});
	}

	public void add(Paypal paypal) {

		getHibernateTemplate().save(paypal);
		
	}

	public Paypal load(Long idPaypal) {
		
		//return getHibernateTemplate().load(Paypal.class, "idPaypal");
		return getHibernateTemplate().get(Paypal.class, idPaypal);
	}

	public void update(Paypal paypal) {

		getHibernateTemplate().update(paypal);
		
	}

	public void delete(Long idPaypal) {

		getHibernateTemplate().delete(idPaypal);
		
	}

}
