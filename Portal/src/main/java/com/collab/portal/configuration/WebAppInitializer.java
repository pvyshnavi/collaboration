package com.collab.portal.configuration;

import javax.servlet.ServletRegistration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{
	/*@Override
	  protected void customizeRegistration(ServletRegistration.Dynamic registration) {
	    registration.setInitParameter("dispatchOptionsRequest", "true");
	    registration.setAsyncSupported(true);
	  }
	*/
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
