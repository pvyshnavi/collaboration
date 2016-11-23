package com.niit.collaborationbackend.dao;

import java.util.List;

import javax.transaction.Transactional;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.niit.collaborationbackend.model.UserDetails;


@Repository("userDetailsDAO")
public class UserDetailsDAOImpl implements UserDetailsDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Autowired
	private UserDetails userDetails;
	
	public UserDetailsDAOImpl(SessionFactory sessionFactory)
	{
		try 
		{
			this.sessionFactory=sessionFactory;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Transactional
	public List<UserDetails> list()
	{
		String hql = "from UserDetails" ;
		
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<UserDetails> list = query.list();
		
		return list;
	}
	
	@Transactional
	public boolean save(UserDetails userDetails) {
	
		
		try {
			sessionFactory.getCurrentSession().save(userDetails);
		} catch (HibernateException e) {
			
			e.printStackTrace();
			return false;
		}
	
		return true;
	}


	@Transactional
	public boolean update(UserDetails userDetails) {

		try {
			sessionFactory.getCurrentSession().update(userDetails);
		} catch (HibernateException e) {
			
			e.printStackTrace();
			return false;
		}
	
		return true;
	}
	
	@Transactional
	public UserDetails get(String id)
	{
		String hql = "from UserDetails where id=" + "'" + id + "'" ;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<UserDetails> list = query.list();
		
		if(list !=null && !list.isEmpty())
		{
			return list.get(0);
		}
		return null;
	}
	
	@Transactional
	public boolean delete(String id)
	{
		try
		{
			sessionFactory.getCurrentSession().delete(userDetails);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		
		return true;
	}

}
