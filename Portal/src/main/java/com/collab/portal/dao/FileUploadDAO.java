package com.collab.portal.dao;

import com.collab.portal.model.UploadFile;

public interface FileUploadDAO {
	
	void save(UploadFile uploadFile);
	UploadFile getFile(String username);

}
