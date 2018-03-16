package com.labgalaxy.ms.usermanagement.service;

import java.util.Collection;

import com.labgalaxy.ms.usermanagement.domain.Group;
import com.labgalaxy.ms.usermanagement.domain.User;
import com.labgalaxy.ms.usermanagement.domain.UserType;

public interface GroupService extends AbstractDomainObjectService<Group> {

	public Group getGroupByName(String name);

	public Group save(Group group);

	public void remove(Group group);

	public Collection<Group> getGroupByAdminUser(User user);

	public Collection<Group> getGroupByMemberUser(User user);

	public void addUserToGroup(User user, Group group, UserType memberShipType);

	public void removeUserFromGroup(User user, Group group, UserType memberShipType);

	public void removeUserFromGroup(User user, Group group);

	public Collection<Group> findAll();

	public Group updateComplete(Group group, Long groupId);

	public void removeById(Long userId);

}
