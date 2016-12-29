package com.niit.backend.implementation;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.backend.dao.EventDAO;
import com.niit.backend.dao.JobDao;
import com.niit.backend.model.Event;
import com.niit.backend.model.Job;

@Repository
public class EventDaoImpl implements EventDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	public void postEvent(Event event) 
	{
		Session session=sessionFactory.openSession();
		session.save(event);
		session.flush();
		session.close();
	}

	public List<Event> getAllEvents() 
	{
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from Event");
		List<Event> event=query.list();
		session.close();
		return event;
	}

	public Event getEventDetail(int eventId) 
	{
		Session session=sessionFactory.openSession();
		Event event=(Event)session.get(Event.class, eventId);
		session.close();
		return event;
	}


}
