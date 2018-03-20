package com.labgalaxy.ms.usermanagement.model.business;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "service_area")
public class ServiceArea implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "area_name", updatable = false, nullable = false)
	private String areaName;
	
	@Column
	private String googleMapLocationURL;

	public String getName() {
		return areaName;
	}

	public void setName(String name) {
		this.areaName = name;
	}

	public String getGoogleMapLocationURL() {
		return googleMapLocationURL;
	}

	public void setGoogleMapLocationURL(String googleMapLocationURL) {
		this.googleMapLocationURL = googleMapLocationURL;
	}
}
