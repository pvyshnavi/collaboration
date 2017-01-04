package com.collab.portal.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{
	
	@Override
	protected Class<?>[] getRootConfigClasses() 
	{
		return new Class[]{WebAppConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() 
	{
		// TODO Auto-generated method stub
		return null;
	}
	
	//DispatcherServlet - receives all the request (any URL)
	@Override
	protected String[] getServletMappings() 
	{
	   return new String[]{"/"};
	}

}