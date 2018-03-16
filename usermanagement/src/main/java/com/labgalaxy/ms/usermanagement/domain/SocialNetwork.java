package com.labgalaxy.ms.usermanagement.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class SocialNetwork extends DomainObject {

	@Column(name = "id", updatable = false, nullable = false)
	public Long getId() {
		return super.getId();
	}

	public void setId(Long id) {
		super.setId(id);
	}

	private SocialNetworkName name;

	public SocialNetworkName getName() {
		return name;
	}

	public void setName(SocialNetworkName name) {
		this.name = name;
	}
}
