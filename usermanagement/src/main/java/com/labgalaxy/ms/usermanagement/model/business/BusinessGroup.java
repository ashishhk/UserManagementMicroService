package com.labgalaxy.ms.usermanagement.model.business;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

import com.labgalaxy.ms.usermanagement.model.DomainObject;
import com.labgalaxy.ms.usermanagement.model.user.Person;

@Entity
@Table(name = "business_group")
public class BusinessGroup extends DomainObject implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "id", updatable = false, nullable = false)
	public Long getId() {
		return super.getId();
	}

	public void setId(Long id) {
		super.setId(id);
	}
	
	@Embedded
	private BusinessBasicDetail basicDetails;
	
	@ManyToMany(fetch = FetchType.LAZY,
    cascade = {
        CascadeType.PERSIST,
        CascadeType.MERGE
    })
	@JoinTable(name="businessgroup_people")
	@JoinColumn(name="person_id")
	@Cascade(value = org.hibernate.annotations.CascadeType.MERGE)
	private Set<Person> contactPeople = new HashSet<Person>();
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(name="businessgroup_group")
	private Set<BusinessGroup> subBusinessGroups;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="business_group_id")
	private Set<Business> businesses = new HashSet<Business>();

	public Set<Person> getContactPeople() {
		return contactPeople;
	}

	public void setContactPeople(Set<Person> contactPeople) {
		this.contactPeople = contactPeople;
	}
	
	public BusinessBasicDetail getBasicDetails() {
		return basicDetails;
	}

	public void setBasicDetails(BusinessBasicDetail basicDetails) {
		this.basicDetails = basicDetails;
	}

	public Set<BusinessGroup> getSubBusinessGroups() {
		return subBusinessGroups;
	}

	public void setSubBusinessGroups(Set<BusinessGroup> subBusinessGroups) {
		this.subBusinessGroups = subBusinessGroups;
	}

	public Set<Business> getBusinesses() {
		return businesses;
	}

	public void setBusinesses(Set<Business> businesses) {
		this.businesses = businesses;
	}
	
}
