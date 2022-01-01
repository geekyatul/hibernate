package com.wipro.hibernate.t3assignment1.models;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapKeyColumn;

@Entity
public class Continent {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	
	@Column(length = 21)
	private String name;

	@ElementCollection
	@MapKeyColumn(name="country")
	@Column(name="capital")
	@CollectionTable(name="Country_Details")
	private Map<String ,String> countries;
	
	
	public Continent() {
      
		 countries=new HashMap<String, String>();
		
		
	}


	public Continent(String name, Map<String, String> countries) {
		super();
		this.name = name;
		this.countries = countries;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Map<String, String> getCountries() {
		return countries;
	}


	public void setCountries(Map<String, String> countries) {
		this.countries = countries;
	}


	@Override
	public String toString() {
		return "Continent [name=" + name + ", countries=" + countries + "]";
	}
	
	
	

}
