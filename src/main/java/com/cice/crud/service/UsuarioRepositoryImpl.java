package com.cice.crud.service;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.cice.crud.domain.Usuario;


public class UsuarioRepositoryImpl extends HibernateDaoSupport implements UsuarioRepository{

	public List<Usuario> list() {

		final String query = "from Usuario";
		
		return (List<Usuario>) getHibernateTemplate().executeFind(new HibernateCallback() {
            public Object doInHibernate(Session session) throws HibernateException, SQLException {
                return session.createQuery(query).list();
            }
		});
	}

	public void add(Usuario usuario) {
		
		getHibernateTemplate().save(usuario);
		
	}

	public Usuario load(Long idUsuario) {
		
		return getHibernateTemplate().load(Usuario.class, idUsuario);
	}

	public void update(Usuario usuario) {
		getHibernateTemplate().update(usuario);
		
	}

	public void delete(Long idUsuario) {
		getHibernateTemplate().delete(load(idUsuario));
		
	}
	
	public List<Usuario> searchUsuario(String email) {
		
		final String query = "from Usuario where email ='"+ email +"' )";
		
		return (List<Usuario>) getHibernateTemplate().executeFind(new HibernateCallback() {
            public Object doInHibernate(Session session) throws HibernateException, SQLException {
                return session.createQuery(query).list();
            }
		});
	}
}
