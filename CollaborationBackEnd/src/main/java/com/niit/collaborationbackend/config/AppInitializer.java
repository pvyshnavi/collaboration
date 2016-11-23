package com.niit.collaborationbackend.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{
	
	@Override
	protected Class[] getRootConfigClasses() {
		System.out.println("Testing");
		return new Class[] { ApplicationContextConfig.class};
	}

	@Override
	protected Class[] getServletConfigClasses() {
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Working....");
		return new String[] { "/" };
	}

}
