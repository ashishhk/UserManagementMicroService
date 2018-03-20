package com.labgalaxy.ms.usermanagement.model.user;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;

@Entity(name = "user")
public class User extends Person implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column
	private String userName;

	@Column
	private String password;

	@Column
	private String parentUser;
	
	@Enumerated
	private UserType type;

	public UserType getType() {
		return type;
	}

	public void setType(UserType type) {
		this.type = type;
	}

	@Column(name = "userId", updatable = false, nullable = false)
	public Long getId() {
		return super.getId();
	}

	public void setId(Long id) {
		super.setId(id);
	}
	// private Map<Long,UserType> groupMembershipType;

	/*
	 * private Set<User> childUsers=new HashSet();
	 * 
	 * private Set<SocialNetwork> socialNetworks;
	 * 
	 * public Set<SocialNetwork> getSocialNetworks() { return socialNetworks; }
	 * 
	 * public void setSocialNetworks(Set<SocialNetwork> socialNetworks) {
	 * this.socialNetworks = socialNetworks; }
	 * 
	 * public Map<Long, UserType> getGroupMembershipType() { return
	 * groupMembershipType; }
	 * 
	 * public void setGroupMembershipType(Map<Long, UserType> groupMembershipType) {
	 * this.groupMembershipType = groupMembershipType; }
	 * 
	 * public Set<User> getChildUsers() { return childUsers; }
	 * 
	 * public void setChildUsers(Set<User> childUsers) { this.childUsers =
	 * childUsers; }
	 */
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getParentUser() {
		return parentUser;
	}

	public void setParentUser(String parentUser) {
		this.parentUser = parentUser;
	}
}
