package com.niit.collaborationbackend.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

public class Job {
	
	@Id
	private String id;
	private String content;
	private String title;
	
	@CreationTimestamp
	@Column(updatable = false)
	private Date created;
	@UpdateTimestamp
	@Column(insertable = false)
	private Date updated;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public Date getUpdated() {
		return updated;
	}
	public void setUpdated(Date updated) {
		this.updated = updated;
	}
	
	

}
