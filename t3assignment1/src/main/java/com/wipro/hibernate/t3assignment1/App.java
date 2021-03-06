package com.wipro.hibernate.t3assignment1;

import java.util.HashMap;
import java.util.Map;

//import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.wipro.hibernate.t3assignment1.config.Config;
import com.wipro.hibernate.t3assignment1.models.Continent;

/**
 * Hello world!
 *
 */
public class App 
{
	static SessionFactory sessionFactory=Config.getSessionFactory();
    public static void main( String[] args )
    {
        System.out.println( "Start of program" );
        
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        
        
        
        Map<String,String> countryAndCaptialMap=new HashMap<>();
        countryAndCaptialMap.put("India", "Dehli");
        countryAndCaptialMap.put("Pakistan", "Islamabad");
        countryAndCaptialMap.put("China","Beijing");
        
        
        Continent continent=new Continent("Asia",countryAndCaptialMap);
        
          session.persist(continent);
        
        transaction.commit();
        session.close();
         System.out.println("end of the program");       
    }
}
