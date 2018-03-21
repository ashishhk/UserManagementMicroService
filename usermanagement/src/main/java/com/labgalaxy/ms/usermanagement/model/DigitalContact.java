package com.labgalaxy.ms.usermanagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table(name="digital_contact")
public class DigitalContact extends DomainObject implements Contact{
	
	@Column
	private String contact;
	
	@Enumerated
	private ContactType type;
	
	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public ContactType getType() {
		return type;
	}

	public void setType(ContactType type) {
		this.type = type;
	}
	
	
}
