package com.niit.collaborationbackend.dao;

import java.util.List;

import com.niit.collaborationbackend.model.Blog;

public interface BlogDAO {
	
public List<Blog> list();
	
	public Blog get(String id);
	
	public boolean update(Blog blog);
	
	public boolean save(Blog blog);
	
	public boolean delete(String id);

}
