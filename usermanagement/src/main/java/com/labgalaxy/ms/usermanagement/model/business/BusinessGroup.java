package com.labgalaxy.ms.usermanagement.model.business;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import com.labgalaxy.ms.usermanagement.model.DomainObject;
import com.labgalaxy.ms.usermanagement.model.user.User;

@Entity
public class BusinessGroup extends DomainObject implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "id", updatable = false, nullable = false)
	public Long getId() {
		return super.getId();
	}

	public void setId(Long id) {
		super.setId(id);
	}
	
	@OneToOne
    @JoinColumn(name="business_basic_detail_id")
	private BusinessBasicDetail basicDetails;
	
	@ManyToMany
	@JoinTable(name = "businessgroup_user", joinColumns = {
			@JoinColumn(name = "groupId", nullable = false, updatable = false, referencedColumnName = "id") }, inverseJoinColumns = {
					@JoinColumn(name = "userId", nullable = false, updatable = false, referencedColumnName = "id") })
	private Set<User> memberUsers;
	
	private Set<ServiceArea> serviceArea;
	
	private Set<BusinessDomain> domainArea;
	
	private Set<BusinessGroup> subBusinessGroups;
	
	private Set<Business> businesses;

	/* private Set<Long> groupAdministrators; */

	public Set<User> getMemberUsers() {
		return memberUsers;
	}

	public void setMemberUsers(Set<User> memberUsers) {
		this.memberUsers = memberUsers;
	}

	public BusinessBasicDetail getBasicDetails() {
		return basicDetails;
	}

	public void setBasicDetails(BusinessBasicDetail basicDetails) {
		this.basicDetails = basicDetails;
	}

	public Set<ServiceArea> getServiceArea() {
		return serviceArea;
	}

	public void setServiceArea(Set<ServiceArea> serviceArea) {
		this.serviceArea = serviceArea;
	}

	public Set<BusinessDomain> getDomainArea() {
		return domainArea;
	}

	public void setDomainArea(Set<BusinessDomain> domainArea) {
		this.domainArea = domainArea;
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
