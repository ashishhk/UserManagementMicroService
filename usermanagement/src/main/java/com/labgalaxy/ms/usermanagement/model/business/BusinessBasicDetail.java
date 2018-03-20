package com.labgalaxy.ms.usermanagement.model.business;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import com.labgalaxy.ms.usermanagement.model.EntityBasicDetail;

@Embeddable
public class BusinessBasicDetail extends EntityBasicDetail{

	@Column
	private String name;
	
	@Column
	private String description;	

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
}
