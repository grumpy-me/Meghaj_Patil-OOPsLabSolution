package com.greatlearning.model;
import java.util.*;

public class Employee {

	private String firstName;
	private String lastName;
	
	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	// getters
	public String getFirstName() {
		return this.firstName ;
	}
	
	public String getLastName() {
		return this.lastName ;
	}
	
	// setters
	public void setFirstName(String firstName) {
		this.firstName = firstName ;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName ;
	}

}
