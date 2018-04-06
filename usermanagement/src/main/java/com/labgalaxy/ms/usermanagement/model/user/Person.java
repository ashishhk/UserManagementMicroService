package com.labgalaxy.ms.usermanagement.model.user;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.annotation.LastModifiedDate;

import com.labgalaxy.ms.usermanagement.model.DomainObject;

@Entity
@Table(name="person")
public class Person extends DomainObject {

	@Column
	@NotBlank
	private String firstName;

	@Column
	@NotBlank
	private String lastName;

	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateOfBirth;
	
	@OneToOne(cascade = {
	        CascadeType.PERSIST,
	        CascadeType.MERGE
	    })
	private User user;
	
	@Embedded
	private PersonBasicDetail basicDetails;

	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	private Date updatedAt;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public PersonBasicDetail getBasicDetails() {
		return basicDetails;
	}

	public void setBasicDetails(PersonBasicDetail basicDetails) {
		this.basicDetails = basicDetails;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
}
