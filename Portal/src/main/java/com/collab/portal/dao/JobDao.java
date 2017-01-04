package com.collab.portal.dao;

import java.util.List;

import com.collab.portal.model.Job;

public interface JobDao {
	
	void postJob(Job job);
	List<Job> getAllJobs();
	Job getJobDetail(int jobId);

}
