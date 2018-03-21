package com.labgalaxy.ms.usermanagement.model.business;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.labgalaxy.ms.usermanagement.model.DomainObject;
import com.labgalaxy.ms.usermanagement.model.user.Person;

@Entity
@Table(name = "business_group")
public class BusinessGroup extends DomainObject implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "business_group_id", updatable = false, nullable = false)
	public Long getId() {
		return super.getId();
	}

	public void setId(Long id) {
		super.setId(id);
	}
	
	@Embedded
	private BusinessBasicDetail basicDetails;
	
	@ManyToMany
	@JoinTable(name = "business_group_user", joinColumns = {
			@JoinColumn(name = "business_group_id", nullable = false, updatable = false, referencedColumnName = "id") }, inverseJoinColumns = {
					@JoinColumn(name = "user_Id", nullable = false, updatable = false, referencedColumnName = "id") })
	private Set<Person> contactPeople = new HashSet<Person>();
	
	
	//private Set<ServiceArea> serviceArea;
	
	/*@Enumerated
	@OneToMany
	@JoinTable(name = "business_group_domains", joinColumns = {
			@JoinColumn(name = "business_group_Id", nullable = false, updatable = false, referencedColumnName = "id") }, inverseJoinColumns = {
					@JoinColumn(name = "userId", nullable = false, updatable = false, referencedColumnName = "id") })
	private Set<BusinessDomain> domains;*/
	
	//private Set<BusinessGroup> subBusinessGroups;
	
	public Set<Person> getContactPeople() {
		return contactPeople;
	}

	public void setContactPeople(Set<Person> contactPeople) {
		this.contactPeople = contactPeople;
	}

	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(name = "businessgroup_business", joinColumns = {
			@JoinColumn(name = "business_group_id", nullable = false, updatable = false, referencedColumnName = "id") }, inverseJoinColumns = {
					@JoinColumn(name = "business_id", nullable = false, updatable = false, referencedColumnName = "id") })
	private Set<Business> businesses = new HashSet<Business>();

	/* private Set<Long> groupAdministrators; */

	

	public BusinessBasicDetail getBasicDetails() {
		return basicDetails;
	}

	public void setBasicDetails(BusinessBasicDetail basicDetails) {
		this.basicDetails = basicDetails;
	}

	/*public Set<ServiceArea> getServiceArea() {
		return serviceArea;
	}

	public void setServiceArea(Set<ServiceArea> serviceArea) {
		this.serviceArea = serviceArea;
	}*/

	/*public Set<BusinessDomain> getDomainArea() {
		return domains;
	}

	public void setDomainArea(Set<BusinessDomain> domainArea) {
		this.domains = domainArea;
	}*/

	/*public Set<BusinessGroup> getSubBusinessGroups() {
		return subBusinessGroups;
	}

	public void setSubBusinessGroups(Set<BusinessGroup> subBusinessGroups) {
		this.subBusinessGroups = subBusinessGroups;
	}*/

	public Set<Business> getBusinesses() {
		return businesses;
	}

	public void setBusinesses(Set<Business> businesses) {
		this.businesses = businesses;
	}
	
}
