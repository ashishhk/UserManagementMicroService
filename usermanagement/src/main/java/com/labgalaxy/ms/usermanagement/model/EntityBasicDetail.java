package com.labgalaxy.ms.usermanagement.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

@MappedSuperclass
public abstract class EntityBasicDetail {

	@ManyToMany
	@JoinTable(name = "business_contact", joinColumns = {
			@JoinColumn(name = "business_basic_detail_id", nullable = false, updatable = false, referencedColumnName = "id") }, inverseJoinColumns = {
					@JoinColumn(name = "contactdetail_id", nullable = false, updatable = false, referencedColumnName = "id") })
	private Set<DigitalContact> contacts = new HashSet<DigitalContact>();
	
	@OneToOne
	@JoinColumn(name="address_id")
	private Set<MailAddress> address = new HashSet<MailAddress>();
	
	public Set<DigitalContact> getContacts() {
		return contacts;
	}

	public void setContacts(Set<DigitalContact> contacts) {
		this.contacts = contacts;
	}

	public Set<MailAddress> getAddress() {
		return address;
	}

	public void setAddress(Set<MailAddress> address) {
		this.address = address;
	}
	
	
}
