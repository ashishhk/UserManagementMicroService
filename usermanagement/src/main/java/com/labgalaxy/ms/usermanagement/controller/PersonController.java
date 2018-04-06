package com.labgalaxy.ms.usermanagement.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.labgalaxy.ms.usermanagement.model.Message;
import com.labgalaxy.ms.usermanagement.model.user.Person;
import com.labgalaxy.ms.usermanagement.service.PersonService;

@RestController
@RequestMapping("/rest/v1/person")
public class PersonController {

	@Autowired
	PersonService personService;

	@GetMapping
	public String sayDefaultMessage() {
		return Message.DEFAULT_MESSAGE_TEST;
	}

	@PostMapping("/create")
	public Person createPerson(@Valid @RequestBody Person person) {
		return personService.save(person);
	}

	//@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/getById/{id}")
	public Person getByPersonId(@PathVariable(value = "userName") Long id) {
		return personService.findById(id);
	}
}
