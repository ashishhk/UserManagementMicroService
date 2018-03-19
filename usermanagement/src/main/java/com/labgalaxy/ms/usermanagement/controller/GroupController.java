package com.labgalaxy.ms.usermanagement.controller;

import java.util.Collection;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
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
import com.labgalaxy.ms.usermanagement.model.user.User;
import com.labgalaxy.ms.usermanagement.service.GroupService;
import com.labgalaxy.ms.usermanagement.service.UserService;

@RestController
@RequestMapping("/rest/v1/group")
public class GroupController {

	@Autowired
	GroupService groupService;

	@Autowired
	UserService userService;

	@GetMapping
	public String sayDefaultMessage() {
		return Message.DEFAULT_MESSAGE_TEST;
	}

	@PostMapping("/create")
	public BusinessGroup createUser(@Valid @RequestBody BusinessGroup group) {
		return groupService.save(group);
	}

	@GetMapping("/getById/{id}")
	public BusinessGroup getUserById(@PathVariable(value = "id") Long groupId) {
		return groupService.findById(groupId);
	}

	@PutMapping("/update/{id}")
	public BusinessGroup updateUserById(@RequestBody BusinessGroup group, @PathVariable(value = "id") Long groupId) {
		return groupService.updateComplete(group, groupId);
	}

	@PatchMapping("/update/{id}")
	public User updateUserPartiallyById(@PathVariable(value = "id") Long userId, @RequestBody User user) {
		// TODO to implement further with opeation value and
		return user;
	}

	@DeleteMapping("/deleteById/{id}")
	public void deleteUserById(@PathVariable(value = "id") Long userId) {
		groupService.removeById(userId);
	}

	@GetMapping("/getAll")
	public Collection<BusinessGroup> getAllUsers() {
		return groupService.findAll();
	}
}
