package com.labgalaxy.ms.usermanagement.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class EntityBasicDetail {

	@ManyToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="contact_id")
	private Set<DigitalContact> contact = new HashSet<DigitalContact>();
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="address_id")
	private Set<MailAddress> address = new HashSet<MailAddress>();
	
	public Set<DigitalContact> getContacts() {
		return contact;
	}

	public void setContacts(Set<DigitalContact> contact) {
		this.contact = contact;
	}

	public Set<MailAddress> getAddress() {
		return address;
	}

	public void setAddress(Set<MailAddress> address) {
		this.address = address;
	}
	
	
}
