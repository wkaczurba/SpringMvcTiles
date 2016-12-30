package com.api;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import com.web.WebConfig;

public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	@Override
	public Class<?>[] getRootConfigClasses() {
		return null;
	}
	
	@Override
	public Class<?>[] getServletConfigClasses() {
		return new Class<?>[] { WebConfig.class };
	}
	
	//@Override
	@Override
	public String[] getServletMappings() {
		return new String[] { "/" };
	}
}
