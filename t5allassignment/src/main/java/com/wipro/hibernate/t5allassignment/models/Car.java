package com.wipro.hibernate.t5allassignment.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car {
	@Id
	@Column(length=30)
	private String regNo;
	private String model;
	private String color;
	private String manufacturer;
	private int price;
	
	public Car() {}
	
	public Car(String regNo, String model, String color, String manufacturer, int price) {
		super();
		this.regNo = regNo;
		this.model = model;
		this.color = color;
		this.manufacturer = manufacturer;
		this.price = price;
	}

	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [regNo=" + regNo + ", model=" + model + ", color=" + color + ", manufacturer=" + manufacturer
				+ ", price=" + price + "]";
	}
	
	
	
	
     	
	
	

}
