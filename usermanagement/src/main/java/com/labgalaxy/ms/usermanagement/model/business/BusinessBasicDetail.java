package com.labgalaxy.ms.usermanagement.model.business;

import java.util.Set;

public class BusinessBasicDetail {

	private String name;
	
	private String description;
	
	private String email;
	
	private Set<String> contactNumber;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<String> getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(Set<String> contactNumber) {
		this.contactNumber = contactNumber;
	}

	
	
}
