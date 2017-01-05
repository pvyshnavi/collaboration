package com.collab.portal.implementation;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.collab.portal.dao.EventDao;
import com.collab.portal.model.Event;
import com.collab.portal.model.Job;

@Repository
public class EventDaoImpl implements EventDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	public void postEvent(Event event) 
	{
		Session session=sessionFactory.openSession();
		session.save(event);
		//session.save(event);
		session.flush();
		session.close();
	}

	public List<Event> getAllEvents() 
	{
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from Event");
		List<Event> events=query.list();
		session.close();
		return events;
	}

	public Event getEventDetail(int eventId) 
	{
		Session session=sessionFactory.openSession();
		Event event=(Event)session.get(Event.class, eventId);
		session.close();
		return event;
	}


}
