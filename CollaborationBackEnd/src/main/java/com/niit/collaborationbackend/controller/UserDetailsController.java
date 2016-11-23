package com.niit.collaborationbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.niit.collaborationbackend.dao.UserDetailsDAO;
import com.niit.collaborationbackend.model.UserDetails;

@RestController
public class UserDetailsController {
	
	@Autowired
	private UserDetails userDetails;
	
	@Autowired
	private UserDetailsDAO userDetailsDAO;
	
	@GetMapping("/UserDetails/")
	public ResponseEntity<List<UserDetails>> listAllUserDetail()
	{
		List<UserDetails> listUserDetail = userDetailsDAO.list();
		if  (listUserDetail.isEmpty())
		{
			return new ResponseEntity<List<UserDetails>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<UserDetails>>(listUserDetail,HttpStatus.OK);
	}
	
	@GetMapping("/UserDetails/{id}")
	public ResponseEntity<UserDetails> getUserDetail(@PathVariable("id") String id)
	{
		userDetails = userDetailsDAO.get(id);
		if(userDetails == null)
		{
			return new ResponseEntity<UserDetails>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<UserDetails>(userDetails,HttpStatus.OK);
	}
	
	@PostMapping("/UserDetails/")
	public ResponseEntity<Void> createUserDetail(@RequestBody UserDetails userDetails, UriComponentsBuilder ucBuilder)
	{
		if (userDetailsDAO.get(userDetails.getId())!= null )
		{
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
		
		userDetailsDAO.save(userDetails);
		
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(ucBuilder.path("UserDeatails/{id}/").buildAndExpand(userDetails.getId()).toUri());
		return new ResponseEntity<Void>(headers,HttpStatus.CREATED);
	}
	
	@PutMapping("/UserDetails/{id}")
	public ResponseEntity<UserDetails> updateUserDetail(@PathVariable("id") String id, @RequestBody UserDetails userDetails)
	{
		if(userDetails.getId() == null)
		{
			System.out.println("ddddddddddddddddddddddddd");
			return new ResponseEntity<UserDetails>(HttpStatus.NOT_FOUND);
		}
		userDetails.setId(id);
		userDetailsDAO.update(userDetails);
		return new ResponseEntity<UserDetails>(userDetails,HttpStatus.OK);
	}
	
	@DeleteMapping("/UserDetails/{id}")
	public ResponseEntity<UserDetails> deleteUserDetail(@PathVariable("id") String id)
	{
		userDetails= userDetailsDAO.get(id);
		if(userDetails==null)
		{
			return new ResponseEntity<UserDetails>(HttpStatus.NOT_FOUND);
		}
		userDetailsDAO.delete(id);
		return new ResponseEntity<UserDetails>(HttpStatus.NO_CONTENT);
	}


}
