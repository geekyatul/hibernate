package com.wipro.hibernate.t5allassignment.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.wipro.hibernate.t5allassignment.models.Car;


public class Config {
	
	private static SessionFactory sessionFactory=null;
	
	   public static SessionFactory getSessionFactory()
	   {
		   if(sessionFactory==null)
		   {
			   Configuration configuration=new Configuration().configure().addAnnotatedClass(Car.class);
		         
			   sessionFactory=configuration.buildSessionFactory();  
			   
		   }
		   return sessionFactory;
	   }

}
