package com.labgalaxy.ms.usermanagement.service;

import java.util.Collection;

import com.labgalaxy.ms.usermanagement.domain.User;

public interface UserService extends AbstractDomainObjectService<User> {

	public User getUserByEmail(String email);

	public User save(User user);

	public void remove(User user);

	public User findById(Long id);

	public Collection<User> findAll();

	public void removeById(Long userId);

	public User updateComplete(User user, Long userId);

}