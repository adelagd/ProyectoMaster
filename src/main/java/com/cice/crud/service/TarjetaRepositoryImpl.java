package com.cice.crud.service;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.cice.crud.domain.DatosUsuario;
import com.cice.crud.domain.Tarjeta;

public class TarjetaRepositoryImpl extends HibernateDaoSupport implements TarjetaRepository {

	public List<Tarjeta> list() {
		final String query = "from Tarjeta";
		
		return (List<Tarjeta>) getHibernateTemplate().executeFind(new HibernateCallback() {
            public Object doInHibernate(Session session) throws HibernateException, SQLException {
                return session.createQuery(query).list();
            }
		});
	}

	public void add(Tarjeta tarjeta) {
		
		getHibernateTemplate().save(tarjeta);
		
	}

	public Tarjeta load(Long idTarjeta) {
		
		//return getHibernateTemplate().load(Tarjeta.class, "idTarjeta");
		return getHibernateTemplate().load(Tarjeta.class, idTarjeta);
	}

	public void update(Tarjeta tarjeta) {

		getHibernateTemplate().update(tarjeta);
		
	}

	public void delete(Long idTarjeta) {

		getHibernateTemplate().delete(idTarjeta);
		
	}

}
