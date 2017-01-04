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

import com.collab.portal.dao.JobDao;
import com.collab.portal.model.Job;
import com.collab.portal.model.User;

@RestController
public class JobController {
	
	Logger logger=LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private JobDao jobDao;
	@RequestMapping(value="/postJob", method=RequestMethod.POST)
	public ResponseEntity<?> postJob(@RequestBody Job job,HttpSession session)
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
	        job.setPostedOn(new Date());
			jobDao.postJob(job);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}

	@RequestMapping(value="/getAllJobs", method=RequestMethod.GET)
	public ResponseEntity<?> getAllJobs(HttpSession session)
	{
		User user=(User)session.getAttribute("user");
		if(user==null)
		{
			System.out.println("User is null");
			Error error=new Error("Unauthorized user! Please login using valid credentials");
			return new ResponseEntity<Error>(error,HttpStatus.UNAUTHORIZED);//401
		}
		System.out.println("User object: " + user.getRole());
		List<Job> jobs=jobDao.getAllJobs();
		return new ResponseEntity<List<Job>>(jobs,HttpStatus.OK);
	}

	@RequestMapping(value="/getJobDetail/{jobId}", method=RequestMethod.GET)
	public ResponseEntity<?> getJobDetail(@PathVariable(value="jobId") int jobId,HttpSession session)
	{
		User user = (User) session.getAttribute("user");
		if(user==null)
		{
			System.out.println("user is null");
			Error error=new Error("Unauthorized user...login using valid credentials");
			return new ResponseEntity<Error>(error,HttpStatus.UNAUTHORIZED);
		}
		logger.debug("jobId: "+jobId);
		Job jobDetail=jobDao.getJobDetail(jobId);
		return new ResponseEntity<Job>(jobDetail,HttpStatus.OK);
	}

}
