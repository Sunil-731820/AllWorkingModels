package com.java.hib;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class SessionHelper {
	public static SessionFactory getSession() {
		Configuration cgf = new AnnotationConfiguration();
		cgf.configure("hibernate.cfg.xml");
		SessionFactory sf = cgf.buildSessionFactory();
		return sf;
	}

}
