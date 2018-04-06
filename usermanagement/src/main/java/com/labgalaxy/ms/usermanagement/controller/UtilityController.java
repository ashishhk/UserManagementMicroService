package com.labgalaxy.ms.usermanagement.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.labgalaxy.ms.usermanagement.model.business.BusinessDomain;

@RestController
@RequestMapping("/rest/v1/utility")
public class UtilityController {

	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/getAllBusinessTypes")
	public BusinessDomain[] getAllBusinessTypes() {
		return BusinessDomain.values();
	}
}
