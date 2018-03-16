package com.labgalaxy.ms.usermanagement.domain;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity(name = "groups")
public class Group extends DomainObject implements Serializable {

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

	@Column
	private String groupName;

	@Column
	private String groupDescription;

	@ManyToMany
	@JoinTable(name = "group_user", joinColumns = {
			@JoinColumn(name = "groupId", nullable = false, updatable = false, referencedColumnName = "id") }, inverseJoinColumns = {
					@JoinColumn(name = "userId", nullable = false, updatable = false, referencedColumnName = "id") })
	private Set<User> memberUsers;

	/* private Set<Long> groupAdministrators; */

	public Set<User> getMemberUsers() {
		return memberUsers;
	}

	public void setMemberUsers(Set<User> memberUsers) {
		this.memberUsers = memberUsers;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getGroupDescription() {
		return groupDescription;
	}

	public void setGroupDescription(String groupDescription) {
		this.groupDescription = groupDescription;
	}

	/*
	 * public Set<Long> getGroupAdministrators() { return groupAdministrators; }
	 * 
	 * public void setGroupAdministrators(Set<Long> groupAdministrators) {
	 * this.groupAdministrators = groupAdministrators; }
	 */

}
