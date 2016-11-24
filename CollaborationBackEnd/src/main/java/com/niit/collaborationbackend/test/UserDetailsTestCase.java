package com.niit.collaborationbackend.test;

import java.sql.Timestamp;
import java.util.Date;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.collaborationbackend.dao.UserDetailsDAO;
import com.niit.collaborationbackend.model.UserDetails;

import junit.framework.Assert;

public class UserDetailsTestCase {
	
	Logger log = LoggerFactory.getLogger(UserDetailsTestCase.class);

	private static AnnotationConfigApplicationContext context;

	@Autowired
	private static UserDetails userDetails;

	@Autowired
	private static UserDetailsDAO userDetailsDAO;
	
	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.collaborationbackend");
		context.refresh();
		
		userDetails = (UserDetails) context.getBean("userDetails");
		
		userDetailsDAO = (UserDetailsDAO) context.getBean("userDetailsDAO");
	}
	
	@AfterClass
	public static void close(){
		context.close();
		userDetails = null;
		userDetailsDAO = null;
	}

	@Test
	public void userDetailsCrudTestCase() {

		/*userDetailsCreateTestCase*/
		userDetails.setId("US001");
		userDetails.setName("VYSHNAVI");
		userDetails.setPassword("vyshu");
		userDetails.setGender("female");
		userDetails.setEmail("vyshu@gmail.com");
		userDetails.setPhone("9847807002");
		//userDetails.setRole("admin");
		
		Assert.assertEquals("userDetailsCreateTestCase", true, userDetailsDAO.save(userDetails));
		
		
		/*getUserDetailsTestCase*/
		Assert.assertEquals("getUserDetailsTestCase",true,userDetailsDAO.get("US001")!=null);
		
		/*userDetailsUpdateTestCase*/
		userDetails.setId("US001");
		userDetails.setName("VYSHNAVI");
		userDetails.setPassword("vyshu");
		userDetails.setGender("female");
		userDetails.setEmail("vyshu@gmail.com");
		userDetails.setPhone("9847807002");
		//userDetails.setRole("admin");
		
		Assert.assertEquals("userDetailsUpdateTestCase", true, userDetailsDAO.update(userDetails));
		
		/*userDetailsDeleteTestCase*/
		Assert.assertEquals("userDetailsDeleteTestCase", true, userDetailsDAO.delete("US001"));


	}

	
}
