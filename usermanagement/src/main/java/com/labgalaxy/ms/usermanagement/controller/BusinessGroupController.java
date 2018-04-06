package com.labgalaxy.ms.usermanagement.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.labgalaxy.ms.usermanagement.model.Message;
import com.labgalaxy.ms.usermanagement.model.business.BusinessGroup;
import com.labgalaxy.ms.usermanagement.service.BusinessGroupService;

@RestController
@RequestMapping("/rest/v1/businessgroup")
public class BusinessGroupController {

	@Autowired
	private BusinessGroupService businessGroupService;
	
	@GetMapping
	public String sayDefaultMessage() {
		return Message.DEFAULT_MESSAGE_TEST;
	}

	//@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/create")
	public BusinessGroup createBusinessGroup(@Valid @RequestBody BusinessGroup group) {
		return businessGroupService.save(group);
	}

	//@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/getById/{id}")
	public BusinessGroup getBusinessGroupById(@PathVariable(value = "id") Long groupId) {
		return businessGroupService.findById(groupId);
	}

	@PutMapping("/update/{id}")
	public BusinessGroup updateBusinessGroupById(@RequestBody BusinessGroup group, @PathVariable(value = "id") Long groupId) {
		return businessGroupService.updateComplete(group, groupId);
	}

	@PatchMapping("/update/{id}")
	public BusinessGroup updateBusinessGroupPartiallyById(@PathVariable(value = "id") Long userId, @RequestBody BusinessGroup group) {
		//TODO
		return group;
	}
}
