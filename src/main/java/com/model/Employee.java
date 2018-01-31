package com.model;

import java.util.Date;


public class Employee {

	private long id;
	private String empName;
	private Date timeStamp;
	
	public Employee(){
		
	}

	public Employee(long id, String empName){
		this.id = id;
		this.empName = empName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Date getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

}
