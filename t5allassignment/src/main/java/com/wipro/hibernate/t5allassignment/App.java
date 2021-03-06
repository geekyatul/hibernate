package com.wipro.hibernate.t5allassignment;

import java.util.List;
import java.util.Scanner;

import com.wipro.hibernate.t5allassignment.dao.CarDao;
import com.wipro.hibernate.t5allassignment.models.Car;

/**
 * Hello world!
 *
 */
public class App 
{
	
	
    public static void main( String[] args )
    {
          CarDao carDao=new CarDao();	
    	
        //First save all the car detail in database 
    	Car car1=new Car("KL-07-AB-123","Polo","White","Volkswagen",700000);
    	Car car2=new Car("KL-07-AB-234","Vento","Black","Volkswagen",600000);
    	Car car3=new Car("KL-07-AC-345","Corolla","Silver","Toyota",1000000);
    	Car car4=new Car("KL-07-BC-126","Sail Uva","Red","Chevrolet",500000);
    	
    	//First save the car in databases 
    	carDao.saveCar(car1);
    	carDao.saveCar(car2);
    	carDao.saveCar(car3);
    	carDao.saveCar(car4);
    	
    	
//    	//Assignment 1 Display all the car information 
    	List<Car> listofCars=carDao.diplayAllCar();
    	
    	for(Car car:listofCars)
    	{
    		System.out.println(car);
    	}
    	
    	
    	
//    	//Assignment 2 Manufacturer's names which are starting with āVā 
    	
    	List<Car> nameDetailsCars=carDao.diplayManufacturerName();
    	System.out.println("diplaying the manufacturer name whoes name start with v");
    	for(Car c:nameDetailsCars)
    	{
    		System.out.println(c.getManufacturer());
    	}
    	
//    	
//    	//Assignment 3 display only given regNo
    	System.out.println("enter the registration of car ");
    	Scanner scanner=new Scanner(System.in);
    	String regString=scanner.next();
         System.out.println("Enter reg no is "+regString);
         
         Car car=carDao.searchByRegNo(regString);
         System.out.println("The car with reg value"+ car);
         
    	
//         //Assignment 4 car that have price less thatn 6 lakh
         
         System.out.println("car having price less than 6 lpa");
         List<Car> carHavingPrice6Lpa=carDao.allCarsPriceLessThanSixLpa();
         
         for(Car c:carHavingPrice6Lpa)
     	{
     		System.out.println(c);
     	}
     	 
    	
    	
    	
    	
    	
    	

    }
}
