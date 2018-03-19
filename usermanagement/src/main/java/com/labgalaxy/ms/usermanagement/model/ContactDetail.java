package com.labgalaxy.ms.usermanagement.model;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.MapKeyEnumerated;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="contact_detail")
public class ContactDetail extends DomainObject{
	
	@Column(name = "id", updatable = false, nullable = false)
	public Long getId() {
		return super.getId();
	}
	
	public void setId(Long id) {
		super.setId(id);
	}
	
	@OneToMany(mappedBy="contact_detail")
	@MapKeyEnumerated(EnumType.STRING)
	private Map<String,ContactType> contacts = new HashMap<String,ContactType>();

	public Map<String, ContactType> getContacts() {
		return contacts;
	}

	public void setContacts(Map<String, ContactType> contacts) {
		this.contacts = contacts;
	}
		
}
