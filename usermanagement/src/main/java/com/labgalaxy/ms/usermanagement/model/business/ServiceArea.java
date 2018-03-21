package com.labgalaxy.ms.usermanagement.model.business;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.labgalaxy.ms.usermanagement.model.DomainObject;

@Entity
@Table(name = "service_area")
public class ServiceArea extends DomainObject implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "area_name", updatable = false, nullable = false)
	private String areaName;
	
	@Column
	private String googleMapLocationURL;

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getGoogleMapLocationURL() {
		return googleMapLocationURL;
	}

	public void setGoogleMapLocationURL(String googleMapLocationURL) {
		this.googleMapLocationURL = googleMapLocationURL;
	}
}
