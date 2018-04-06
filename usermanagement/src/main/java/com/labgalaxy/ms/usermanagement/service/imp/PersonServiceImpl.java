package com.labgalaxy.ms.usermanagement.service.imp;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.labgalaxy.ms.usermanagement.model.user.Person;
import com.labgalaxy.ms.usermanagement.repository.PersonRepository;
import com.labgalaxy.ms.usermanagement.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonRepository personRepository;
	
	@Override
	public Person getUserByEmail(String email) {
		return null;
	}

	@Override
	public Person save(Person person) {
		personRepository.save(person);		
		return null;
	}

	@Override
	public void remove(Person person) {
		// TODO Auto-generated method stub

	}

	@Override
	public Person findById(Long id) {
		personRepository.findOne(id);
		return null;
	}

	@Override
	public Collection<Person> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeById(Long personId) {
		// TODO Auto-generated method stub

	}

	@Override
	public Person updateComplete(Person person, Long personId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person findByFirstName(String firstName) {
		// TODO Auto-generated method stub
		return null;
	}

}
