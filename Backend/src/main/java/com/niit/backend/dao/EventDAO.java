package com.niit.backend.dao;

import java.util.List;

import com.niit.backend.model.Event;

public interface EventDAO {
	
	void postEvent(Event event);
	List<Event> getAllEvents();
	Event getEventDetail(int eventId);

}
