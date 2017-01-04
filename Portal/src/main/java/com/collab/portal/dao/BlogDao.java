package com.collab.portal.dao;

import java.util.List;

import com.collab.portal.model.BlogComment;
import com.collab.portal.model.BlogPost;
import com.collab.portal.model.User;

public interface BlogDao {
	
	List<BlogPost> getBlogPosts();
	BlogPost getBlogPost(int id);
	BlogPost addBlogPost(User user,BlogPost blogPost);
	List<BlogComment> getBlogComments(int blogId);
	BlogPost addBlogPostComment(User user,BlogComment blogComment);

}
