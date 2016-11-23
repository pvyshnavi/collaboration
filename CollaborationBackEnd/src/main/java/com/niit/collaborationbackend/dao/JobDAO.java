package com.niit.collaborationbackend.dao;

import java.util.List;

import com.niit.collaborationbackend.model.Job;

public interface JobDAO {
	
public List<Job> list();
	
	public Job get(String id);
	
	public boolean save(Job job);
	
	public boolean update(Job job);
	
	public boolean delete(String id);

}
