package com.wipro.hibernate.t3assignment2.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.wipro.hibernate.t3assignment2.models.Question;
//import com.wipro.hibernate.t5allassignment.models.Car;


public class Config {
	
	private static SessionFactory sessionFactory=null;
	
	   public static SessionFactory getSessionFactory()
	   {
		   if(sessionFactory==null)
		   {
			   Configuration configuration=new Configuration().configure().addAnnotatedClass(Question.class);
		         
			   sessionFactory=configuration.buildSessionFactory();  
			   
		   }
		   return sessionFactory;
	   }

}
