package com.labgalaxy.ms.usermanagement.service.imp;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.labgalaxy.ms.usermanagement.model.user.User;
import com.labgalaxy.ms.usermanagement.repository.UserDAO;
import com.labgalaxy.ms.usermanagement.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;

	public User getUserByEmail(String email) {
		return null;
	}

	public User save(User user) {
		return userDAO.save(user);
	}

	public void remove(User user) {
		userDAO.delete(user);

	}

	public User findById(Long id) {
		return userDAO.findOne(id);
	}

	public Collection<User> findAll() {
		return userDAO.findAll();
	}

	@Override
	public void removeById(Long userId) {
		remove(findById(userId));
	}

	@Override
	public User updateComplete(User user, Long userId) {
		User existingUser = userDAO.findOne(userId);
		// TODO object merging technique to be implemented here
		return userDAO.save(user);
	}

}
