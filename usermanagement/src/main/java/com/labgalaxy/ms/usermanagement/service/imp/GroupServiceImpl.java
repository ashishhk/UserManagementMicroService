package com.labgalaxy.ms.usermanagement.service.imp;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.labgalaxy.ms.usermanagement.domain.Group;
import com.labgalaxy.ms.usermanagement.domain.User;
import com.labgalaxy.ms.usermanagement.domain.UserType;
import com.labgalaxy.ms.usermanagement.repository.GroupRepository;
import com.labgalaxy.ms.usermanagement.service.GroupService;

@Service
public class GroupServiceImpl implements GroupService {

	@Autowired
	private GroupRepository groupRepository;

	public Group getGroupByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public Group save(Group group) {
		return groupRepository.save(group);
	}

	public Collection<Group> getGroupByAdminUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	public Collection<Group> getGroupByMemberUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	public void addUserToGroup(User user, Group group, UserType memberShipType) {
		// TODO Auto-generated method stub

	}

	public void removeUserFromGroup(User user, Group group, UserType memberShipType) {
		// TODO Auto-generated method stub

	}

	public void removeUserFromGroup(User user, Group group) {
		// TODO Auto-generated method stub

	}

	public Collection<Group> findAll() {
		return groupRepository.findAll();
	}

	@Override
	public Group findById(Long id) {
		return groupRepository.findOne(id);
	}

	@Override
	public Group updateComplete(Group group, Long groupId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeById(Long userId) {
		remove(findById(userId));
	}

	public void remove(Group group) {
		groupRepository.delete(group);
	}
}
