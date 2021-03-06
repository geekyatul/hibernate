package com.wipro.hibernate.t1assignment1.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int employeeId;
	@Column(name="full_name")
	private String employeeName;
	@Column(name="Designation")
	private String employeeDesignation;
	private float employeeSalary;
	
	public Employee() {}
	
	public Employee(String employeeName, String employeeDesignation, float employeeSalary) {
		super();
		this.employeeName = employeeName;
		this.employeeDesignation = employeeDesignation;
		this.employeeSalary = employeeSalary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeDesignation() {
		return employeeDesignation;
	}

	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}

	public float getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(float employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeDesignation="
				+ employeeDesignation + ", employeeSalary=" + employeeSalary + "]";
	}
	
	
	

}
