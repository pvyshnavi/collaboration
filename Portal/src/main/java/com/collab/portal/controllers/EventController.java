package com.collab.portal.controllers;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.collab.portal.dao.EventDao;
import com.collab.portal.model.Event;
import com.collab.portal.model.User;

@RestController
public class EventController {
	
Logger logger=LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private EventDao eventDao;
	@RequestMapping(value="/postEvent", method=RequestMethod.POST)
	public ResponseEntity<?> postEvent(@RequestBody Event event,HttpSession session)
	{
		User user=(User) session.getAttribute("user");
		if(user==null)
		{
			Error error=new Error("Unauthorized user...login using valid credentials");
			return new ResponseEntity<Error>(error,HttpStatus.UNAUTHORIZED);
		}
		
		else
		{
			System.out.println("Role of User: " + user.getRole());
			eventDao.postEvent(event);
			//eventDao.postEvent(event);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}

	@RequestMapping(value="/getAllEvents", method=RequestMethod.GET)
	public ResponseEntity<?> getAllEvents(HttpSession session)
	{
		User user=(User)session.getAttribute("user");
		if(user==null)
		{
			System.out.println("User is null");
			Error error=new Error("Unauthorized user! Please login using valid credentials");
			return new ResponseEntity<Error>(error,HttpStatus.UNAUTHORIZED);//401
		}
		System.out.println("User object: " + user.getRole());
		List<Event> events=eventDao.getAllEvents();
		return new ResponseEntity<List<Event>>(events,HttpStatus.OK);
	}

	@RequestMapping(value="/getEventDetail/{EventId}", method=RequestMethod.GET)
	public ResponseEntity<?> getEventDetail(@PathVariable(value="eventId") int eventId,HttpSession session)
	{
		User user = (User) session.getAttribute("user");
		if(user==null)
		{
			System.out.println("user is null");
			Error error=new Error("Unauthorized user...login using valid credentials");
			return new ResponseEntity<Error>(error,HttpStatus.UNAUTHORIZED);
		}
		logger.debug("eventId: "+eventId);
		Event eventDetail=eventDao.getEventDetail(eventId);
		return new ResponseEntity<Event>(eventDetail,HttpStatus.OK);
	}


}
