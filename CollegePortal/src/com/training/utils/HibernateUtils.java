package com.training.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {

	private static SessionFactory factory;
	
	// Using the static Factory singleton design pattern
	static{
		
		try {
			
			factory = new Configuration().configure().buildSessionFactory();
		}
		catch(Throwable e){
				
				throw new ExceptionInInitializerError(e);
			}
		}

	public static SessionFactory getFactory() {
		
		return factory;
	}
}
