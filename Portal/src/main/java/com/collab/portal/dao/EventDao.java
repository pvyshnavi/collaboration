package com.collab.portal.dao;

import java.util.List;

import com.collab.portal.model.Event;


public interface EventDao {
	
	void postEvent(Event event);
	List<Event> getAllEvents();
	Event getEventDetail(int eventId);

}
