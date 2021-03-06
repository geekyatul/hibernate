package com.wipro.hibernate.t2assignment1;

import java.util.List;

import com.wipro.hibernate.t2assignment1.dao.EmployeeDao;
import com.wipro.hibernate.t2assignment1.models.Employee;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        EmployeeDao employeeDao=new EmployeeDao(); 
        
        Employee emp1=new Employee("Atul patel","B1");
        Employee emp2=new Employee("Amit Sigh","B1");
        Employee emp3=new Employee("Aman Gupta","B1");
        
        
        //save the object 
        employeeDao.saveEmployee(emp1);
        employeeDao.saveEmployee(emp2);
        employeeDao.saveEmployee(emp3);
        
        
       //get all the employee
     List<Employee> employeeList=employeeDao.getAllEmployee();
     for(Employee emp:employeeList)
     {
     	System.out.println(emp);
     }
//        
//        //update employee whoes id is 2 update to ajay Yadava
//        
//        // first fetch the value 
       Employee employee=employeeDao.getEmployeeById(2);
       employee.setEmployeeName("Ajay Yadav");
       employeeDao.updateEmployee(employee);
//        
//        //delete whoes id is 2
//        
        employeeDao.deleteEmployeeById(2);
        
    }
}
