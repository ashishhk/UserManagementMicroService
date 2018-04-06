package com.labgalaxy.ms.usermanagement.service;

import java.util.Collection;

import com.labgalaxy.ms.usermanagement.model.user.Person;

public interface PersonService extends AbstractDomainObjectService<Person> {

	public Person getUserByEmail(String email);

	public Person save(Person person);

	public void remove(Person person);

	public Person findById(Long id);

	public Collection<Person> findAll();

	public void removeById(Long personId);

	public Person updateComplete(Person person, Long personId);

	public Person findByFirstName(String firstName);
}
