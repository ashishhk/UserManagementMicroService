package com.labgalaxy.ms.usermanagement.service.imp;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.labgalaxy.ms.usermanagement.model.business.BusinessGroup;
import com.labgalaxy.ms.usermanagement.model.user.User;
import com.labgalaxy.ms.usermanagement.model.user.UserType;
import com.labgalaxy.ms.usermanagement.repository.GroupRepository;
import com.labgalaxy.ms.usermanagement.service.GroupService;

@Service
public class GroupServiceImpl implements GroupService {

	@Autowired
	private GroupRepository groupRepository;

	public BusinessGroup getGroupByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public BusinessGroup save(BusinessGroup group) {
		return groupRepository.save(group);
	}

	public Collection<BusinessGroup> getGroupByAdminUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	public Collection<BusinessGroup> getGroupByMemberUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	public void addUserToGroup(User user, BusinessGroup group, UserType memberShipType) {
		// TODO Auto-generated method stub

	}

	public void removeUserFromGroup(User user, BusinessGroup group, UserType memberShipType) {
		// TODO Auto-generated method stub

	}

	public void removeUserFromGroup(User user, BusinessGroup group) {
		// TODO Auto-generated method stub

	}

	public Collection<BusinessGroup> findAll() {
		return groupRepository.findAll();
	}

	@Override
	public BusinessGroup findById(Long id) {
		return groupRepository.findOne(id);
	}

	@Override
	public BusinessGroup updateComplete(BusinessGroup group, Long groupId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeById(Long userId) {
		remove(findById(userId));
	}

	public void remove(BusinessGroup group) {
		groupRepository.delete(group);
	}
}
