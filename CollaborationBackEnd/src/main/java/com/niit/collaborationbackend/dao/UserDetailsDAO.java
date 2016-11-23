package com.niit.collaborationbackend.dao;

import java.util.List;

import com.niit.collaborationbackend.model.UserDetails;

public interface UserDetailsDAO {
	
public List<UserDetails> list();
	
	public UserDetails get(String id);
	
	public boolean save(UserDetails userDetails);
	
	public boolean update(UserDetails userdetails);
	
	public boolean delete(String id);

}
