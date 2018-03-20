package com.labgalaxy.ms.usermanagement.model.business;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.labgalaxy.ms.usermanagement.model.DomainObject;
import com.labgalaxy.ms.usermanagement.model.user.User;

@Entity
@Table(name = "business")
public class Business extends DomainObject implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="business_id")
	private BusinessBasicDetail basicDetails;
	
	@Column
	@Enumerated
	private BusinessDomain domain;
	
	@ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="area_name")
	private ServiceArea serviceArea;
	
	@ManyToMany
	@JoinTable(name = "business_user", joinColumns = {
			@JoinColumn(name = "business_id", nullable = false, updatable = false, referencedColumnName = "id") }, inverseJoinColumns = {
					@JoinColumn(name = "user_Id", nullable = false, updatable = false, referencedColumnName = "id") })
	private Set<User> memberUsers = new HashSet<User>();

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

	public ServiceArea getServiceArea() {
		return serviceArea;
	}

	public void setServiceArea(ServiceArea serviceArea) {
		this.serviceArea = serviceArea;
	}
}
