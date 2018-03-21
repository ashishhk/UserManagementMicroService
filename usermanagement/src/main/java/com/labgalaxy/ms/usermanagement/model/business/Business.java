package com.labgalaxy.ms.usermanagement.model.business;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.labgalaxy.ms.usermanagement.model.DomainObject;
import com.labgalaxy.ms.usermanagement.model.user.Person;

@Entity
@Table(name = "business")
public class Business extends DomainObject implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Embedded
	private BusinessBasicDetail basicDetails;
	
	@Enumerated
	private BusinessDomain domain;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="business_service_area")
	@JoinColumn(name="servicearea_id")
	private Set<ServiceArea> serviceArea;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="business_people")
	@JoinColumn(name="person_id")
	private Set<Person> contactPeople = new HashSet<Person>();

	public BusinessBasicDetail getBasicDetails() {
		return basicDetails;
	}

	public void setBasicDetails(BusinessBasicDetail basicDetails) {
		this.basicDetails = basicDetails;
	}

	public BusinessDomain getDomain() {
		return domain;
	}

	public void setDomain(BusinessDomain domain) {
		this.domain = domain;
	}
	
	public Set<ServiceArea> getServiceArea() {
		return serviceArea;
	}

	public void setServiceArea(Set<ServiceArea> serviceArea) {
		this.serviceArea = serviceArea;
	}

	public Set<Person> getContactPeople() {
		return contactPeople;
	}

	public void setContactPeople(Set<Person> contactPeople) {
		this.contactPeople = contactPeople;
	}
}
