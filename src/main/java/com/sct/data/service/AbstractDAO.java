package com.sct.data.service;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

public class AbstractDAO<T> { 
	protected Class<T> clazz;
	
	@Autowired
	private SessionFactory sessionFactory;
	
	protected Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	public void persist(T entity){
		getSession().persist(entity);
	}
	public void delete(T entity){
		getSession().delete(entity);
	}
	public T getById(String accountNumber){
		Criteria c = getSession().createCriteria(clazz);
		c.add(Restrictions.eq("accountNumber", accountNumber));
		T result = (T)c.uniqueResult();
		return result;
	}
	public List<T> findAll(){
		Criteria c = getSession().createCriteria(clazz);
		return (List<T>)c.list();
	}
}
