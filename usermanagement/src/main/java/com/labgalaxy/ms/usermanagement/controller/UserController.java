package com.labgalaxy.ms.usermanagement.controller;

import java.util.Collection;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
import com.labgalaxy.ms.usermanagement.model.user.Person;
import com.labgalaxy.ms.usermanagement.model.user.User;
import com.labgalaxy.ms.usermanagement.service.UserService;

@RestController
@RequestMapping("/rest/v1/user")
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping
	public String sayDefaultMessage() {
		return Message.DEFAULT_MESSAGE_TEST;
	}

	@PostMapping("/create")
	public User createUser(@Valid @RequestBody User user) {
		return userService.save(user);
	}

	@PostMapping("/login")
	public Person login(@Valid @RequestBody String userName,String password) {
		
		//return userService.save(user);
		return new Person();
	}
	
	@GetMapping("/getByUserName/{userName}")
	public User getUserById(@PathVariable(value = "userName") String userName) {
		return userService.findByUserName(userName);
	}

	@PutMapping("/update/{id}")
	public User updateUserById(@RequestBody User user, @PathVariable(value = "id") Long userId) {
		return userService.updateComplete(user, userId);
	}

	@PatchMapping("/update/{id}")
	public User updateUserPartiallyById(@PathVariable(value = "id") Long userId, @RequestBody User user) {
		// TODO to implement further with opeation value and
		return user;
	}

	@DeleteMapping("/deleteById/{id}")
	public void deleteUserById(@PathVariable(value = "id") Long userId) {
		userService.removeById(userId);
	}

	@CrossOrigin(origins = "http://localhost:3001")
	@GetMapping("/getAll")
	public Collection<User> getAllUsers() {
		return userService.findAll();
	}

}
