package com.niit.collaborationbackend.dao;

import java.util.List;

import com.niit.collaborationbackend.model.Event;

public interface EventDAO {
	
public List<Event> list();
	
	public Event get(String id);
	
	public boolean save(Event event);
	
	public boolean update(Event event);
	
	public boolean delete(String id);

}
