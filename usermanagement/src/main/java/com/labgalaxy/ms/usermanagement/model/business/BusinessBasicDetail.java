package com.labgalaxy.ms.usermanagement.model.business;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.labgalaxy.ms.usermanagement.model.Address;
import com.labgalaxy.ms.usermanagement.model.ContactDetail;
import com.labgalaxy.ms.usermanagement.model.DomainObject;

@Entity
@Table(name="business_basic_detail")
public class BusinessBasicDetail extends DomainObject{

	@Column
	private String name;
	
	@Column
	private String description;
	
	@Column
	private String email;
	
	@ManyToMany
	@JoinTable(name = "business_basic_detail_contact", joinColumns = {
			@JoinColumn(name = "business_basic_detailid", nullable = false, updatable = false, referencedColumnName = "id") }, inverseJoinColumns = {
					@JoinColumn(name = "contactdetail_id", nullable = false, updatable = false, referencedColumnName = "id") })
	private Set<ContactDetail> contact;
	
	public Set<ContactDetail> getContact() {
		return contact;
	}

	public void setContact(Set<ContactDetail> contact) {
		this.contact = contact;
	}

	@OneToOne
	@JoinColumn(name="address_id")
	private Address address;
	
	@Column(name = "id", updatable = false, nullable = false)
	public Long getId() {
		return super.getId();
	}
	
	public void setId(Long id) {
		super.setId(id);
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

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
}
