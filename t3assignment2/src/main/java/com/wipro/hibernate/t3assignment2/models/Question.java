package com.wipro.hibernate.t3assignment2.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Question {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int qId;
	private String qName;
	@ElementCollection
	private List<String> options;
	private String answer;
	
	public Question() {
	
		options=new ArrayList<>();
	}
	public Question(String qName, String answer) {
		super();
		this.qName = qName;
		this.answer = answer;
	}
	public int getqId() {
		return qId;
	}
	public void setqId(int qId) {
		this.qId = qId;
	}
	public String getqName() {
		return qName;
	}
	public void setqName(String qName) {
		this.qName = qName;
	}
	public List<String> getOptions() {
		return options;
	}
	public void setOptions(List<String> options) {
		this.options = options;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "Question [qId=" + qId + ", qName=" + qName + ", options=" + options + ", answer=" + answer + "]";
	}
	
	
	
	
	
	

}
