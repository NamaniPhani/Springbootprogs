package com.ojas.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class EmpPK implements Serializable{

	private String firstName;
	private String lastName;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}

