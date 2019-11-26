package com.incture.paccarmdm.mat.staging.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] { HibernateConfiguration.class, SpringConfiguration.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[]{"/paccar/*"};
	}
}